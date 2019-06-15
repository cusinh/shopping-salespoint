package vn.com.itzenk.shopping.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.salespointframework.order.Cart;
import org.salespointframework.order.Order;
import org.salespointframework.order.OrderManager;
import org.salespointframework.payment.Cash;
import org.salespointframework.quantity.Quantity;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.web.LoggedIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import vn.com.itzenk.shopping.entity.ProductEntity;
import vn.com.itzenk.shopping.ultils.EmailForm;
import vn.com.itzenk.shopping.ultils.OrderObject;

@Controller
@SessionAttributes("cart")
@PreAuthorize("isAuthenticated()")
public class OrderController {
	private final OrderManager<Order> orderManager;

	OrderObject orderObject = new OrderObject();
	@Autowired
	public JavaMailSender emailSender;

	EmailForm emailForm = new EmailForm();

	OrderController(OrderManager<Order> orderManager) {
		Assert.notNull(orderManager, "OrderManager must not be null!");
		this.orderManager = orderManager;
	}

	@ModelAttribute("cart")
	Cart initializeCart() {
		return new Cart();
	}

	@PostMapping("/cart")
	String addProduct(@RequestParam("pid") ProductEntity productEntity, @RequestParam("number") int number,
			@ModelAttribute Cart cart) {
		cart.addOrUpdateItem(productEntity, Quantity.of(number));
		return "redirect:/";
	}

	@GetMapping("/cart")
	String basket() {
		return "cart";
	}

	@GetMapping("/cart/removeItemCart/{cart-id}")
	String productDetail(@PathVariable("cart-id") String cartId, @ModelAttribute Cart cart) {
		cart.removeItem(cartId);
		return "redirect:/cart";
	}

	public void sendEmail(String userEmail, String userName, ArrayList<String> productName, ArrayList<String> quantity,
			ArrayList<String> price, String totalCart) {
		String content = "";
		SimpleMailMessage message = new SimpleMailMessage();
		for (int i = 0; i < productName.size(); i++) {
			content += " - " + productName.get(i).toString() + "\n\t + Quantity:" + quantity.get(i).toString()
					+ "\n\t + Price : " + price.get(i).toString() + "\n";
		}
		message.setTo(userEmail);
		message.setSubject("Order confirmation");
		message.setText("Hello, " + userName + "\n" + "Thank you for your purchase at our website!" + "\n"
				+ "Your order includes : " + "\n" + content + "Total Price: " + totalCart);
		this.emailSender.send(message);
		System.out.println("Send mail success!");
	}

	@PostMapping("/checkout")
	String buy(@ModelAttribute Cart cart, @LoggedIn Optional<UserAccount> userAccount) {
		return userAccount.map(account -> {
			Order order = new Order(account, Cash.CASH);
			cart.addItemsTo(order);
			orderManager.payOrder(order);
			orderManager.completeOrder(order);
			
//			send mail
			order.getOrderLines().forEach(value -> orderObject.addOrderProductName(value.getProductName()));
			order.getOrderLines().forEach(value -> orderObject.addOrderPrice(String.valueOf(value.getPrice())));
			order.getOrderLines().forEach(value -> orderObject.addOrderQuantity(String.valueOf(value.getQuantity())));

			sendEmail(order.getUserAccount().getEmail(), order.getUserAccount().getUsername(),
					orderObject.getOrderProductName(), orderObject.getOrderQuantity(), orderObject.getOrderPrice(),
					order.getTotalPrice().toString());
			cart.clear();
			return "redirect:/thankyou";
		}).orElse("redirect:/cart");
	}

}
