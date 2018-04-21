package com.logos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.logos.domain.AddUserRequest;
import com.logos.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String showHome(Model model) {
		model.addAttribute("title", "Home page");
		
		return "home";
	}
	@GetMapping("/add-user")
	public String showAddUserForm(Model model) {
		model.addAttribute("userModel", new AddUserRequest());
		return "add-user";
	}
	
	@PostMapping("/save-user")
	public String saveUser(@Valid @ModelAttribute("userModel") AddUserRequest request, BindingResult br) {
		if (br.hasErrors()) {
			return "add-user";
		}
		return "redirect:/";
	}
}
