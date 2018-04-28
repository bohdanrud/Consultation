package com.logos.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.logos.entity.User;
import com.logos.service.UserService;
import com.logos.service.cloudinary.CloudinaryService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CloudinaryService cloudinaryService;
	
	@GetMapping("/profile")
	public String ShowProfile(Model model, Principal principal) {
		User user = userService.findUserByLogin(principal.getName());
		model.addAttribute("userProfile", user);
		return "user/profile";
	}
	@GetMapping("/profile/image")
	public String uploadProfileImage() {
		return "user/upload-image";
	}
	
	@PostMapping("/profile/image/upload")
	public String upload(@RequestParam("profileImage") MultipartFile file, Principal principal) {
		User user = userService.findUserByLogin(principal.getName());
		
		String imageUrl = cloudinaryService.uploadFile(file, "user/" + user.getLogin());
		user.setImageUrl(imageUrl);
		userService.updateUser(user);
		
		return "redirect:/user/profile";
	}
}
