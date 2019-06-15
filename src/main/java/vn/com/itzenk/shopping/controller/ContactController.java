package vn.com.itzenk.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import vn.com.itzenk.shopping.entity.ContactEntity;
import vn.com.itzenk.shopping.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	ContactService contactService;

	@GetMapping("/contact")
	public String updateUser(Model model) {
		model.addAttribute("contactEntity", new ContactEntity());
		return "contact";
	}

	@PostMapping("/contact")
	public String addContact(@ModelAttribute("contactEntity") ContactEntity contactEntity) {
		contactService.createNewContact(contactEntity);
		return "redirect:/contactthankyou";
	}
}
