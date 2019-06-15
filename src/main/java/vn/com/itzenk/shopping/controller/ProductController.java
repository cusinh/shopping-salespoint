package vn.com.itzenk.shopping.controller;

import org.salespointframework.catalog.ProductIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.itzenk.shopping.entity.ProductEntity.ProductType;
import vn.com.itzenk.shopping.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping("/")
	String getAllProduct(Model model) {
		model.addAttribute("productList", productService.getAllProduct());
		model.addAttribute("popularProductList", productService.findNewProduct());
		model.addAttribute("countMenProduct", productService.countByProductType(ProductType.MEN));
		model.addAttribute("countWomenProduct", productService.countByProductType(ProductType.WOMEN));
		model.addAttribute("countShoesProduct", productService.countByProductType(ProductType.SHOES));
		return "index";
	}

	@GetMapping("/product/product-detail/{product-id}")
	String productDetail(@PathVariable("product-id") ProductIdentifier productId, Model model) {
		model.addAttribute("detail", productService.getProductByProductId(productId).get());
		return "shop-single";
	}

	@GetMapping("/product")
	String searchProductByProductName(@RequestParam(value = "search", required = false) String productName,
			Model model) {
		int result = productService.searchProductByProductName(productName).size();
		if (result == 0) {
			model.addAttribute("message", "Try different or less specific keywords.");
		} else {
			model.addAttribute("catalogList", productService.searchProductByProductName(productName));
		}
		return "shop";
	}
	
	@GetMapping("/product/men-catalog")
	String menCatalog(Model model) {
		model.addAttribute("catalogList", productService.getAllByProductType(ProductType.MEN));
		model.addAttribute("countMenProduct", productService.countByProductType(ProductType.MEN));
		model.addAttribute("countWomenProduct", productService.countByProductType(ProductType.WOMEN));
		model.addAttribute("countShoesProduct", productService.countByProductType(ProductType.SHOES));
		return "shop";
	}

	@GetMapping("/product/women-catalog")
	String womenCatalog(Model model) {
		model.addAttribute("catalogList", productService.getAllByProductType(ProductType.WOMEN));
		model.addAttribute("countMenProduct", productService.countByProductType(ProductType.MEN));
		model.addAttribute("countWomenProduct", productService.countByProductType(ProductType.WOMEN));
		model.addAttribute("countShoesProduct", productService.countByProductType(ProductType.SHOES));
		return "shop";
	}

	@GetMapping("/product/shoes-catalog")
	String shoesCatalog(Model model) {
		model.addAttribute("catalogList", productService.getAllByProductType(ProductType.SHOES));
		model.addAttribute("countMenProduct", productService.countByProductType(ProductType.MEN));
		model.addAttribute("countWomenProduct", productService.countByProductType(ProductType.WOMEN));
		model.addAttribute("countShoesProduct", productService.countByProductType(ProductType.SHOES));
		return "shop";
	}

}
