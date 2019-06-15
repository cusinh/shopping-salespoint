package vn.com.itzenk.shopping.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import vn.com.itzenk.shopping.service.CustomerService;
import vn.com.itzenk.shopping.ultils.RegistrationForm;

//import vn.com.itzenk.shopping.service.CustomerService;
//import vn.com.itzenk.shopping.utils.RegistrationForm;


@Controller
public class LoginController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/register")
	String register(Model model, RegistrationForm registrationForm) {
		model.addAttribute("registrationForm", registrationForm);
		return "register";
	}
	
	@PostMapping("/register")
	String registerNew(@Valid RegistrationForm registrationForm, Errors result) {
		if (result.hasErrors()) {
			return "register";
		}
		customerService.createNewCusomer(registrationForm);
		return "redirect:/login";
	}
}
