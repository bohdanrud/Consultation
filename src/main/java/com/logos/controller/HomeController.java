package com.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
