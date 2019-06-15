package vn.com.itzenk.shopping.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {
	
	@RequestMapping(value = "/shop-single", method = RequestMethod.GET)
	public String shopSingle(HttpServletRequest request) throws Exception {
		return "shop-single";
	}
	
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String shop(HttpServletRequest request) throws Exception {
		return "shop";
	}
	
	@RequestMapping(value = "/thankyou", method = RequestMethod.GET)
	public String thankYou(HttpServletRequest request) throws Exception {
		return "thankyou";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(HttpServletRequest request) throws Exception {
		return "about";
	}
	@RequestMapping(value = "/contactthankyou", method = RequestMethod.GET)
	public String contactThankYou(HttpServletRequest request) throws Exception {
		return "contactthankyou";
	}
}

