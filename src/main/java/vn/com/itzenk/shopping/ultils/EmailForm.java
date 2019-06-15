package vn.com.itzenk.shopping.ultils;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailForm {
	@Autowired
	public JavaMailSender emailSender;

	public void sendEmail(String userEmail, String userName, ArrayList<String> productName, ArrayList<String> quantity,
			ArrayList<String> price, String totalCart) {
		String content = "";
		SimpleMailMessage message = new SimpleMailMessage();
		for (int i = 0; i < productName.size(); i++) {
			content += productName.get(i).toString() + ":" + quantity.get(i).toString() + "\n Price : "
					+ price.get(i).toString() + "\n";
		}
		message.setTo(userEmail);
		message.setSubject("Order confirmation");
		message.setText("Hello, " + userName + "\n" + "Thank you for your purchase at our website!" + "\n"
				+ "Your order includes : " + "\n" + "\t" + content);
		this.emailSender.send(message);
		System.out.println("Send mail success!");
	}
}
