package com.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.logos.entity.Product;
import com.logos.service.ProductService;
import com.logos.service.cloudinary.CloudinaryService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private CloudinaryService cloudinaryService;
	@Autowired
	private ProductService productService;
	
	@GetMapping("/add")
	public String showAddProductForm(Model model) {
		model.addAttribute("productModel", new Product());
		return "product/add-product";
	}
	
	@PostMapping("/add")
	public String saveProduct(
			@ModelAttribute("productModel") Product product,
			@RequestParam("productImage") MultipartFile file) {
	
		productService.saveProduct(product);
		String imageUrl = cloudinaryService.uploadFile(file, "product/" + product.getId());
		product.setImageUrl(imageUrl);
		productService.saveProduct(product);
		return "redirect:/";
	}
	
	@GetMapping("/list")
	public String showProducts(Model model) {
		model.addAttribute("products", productService.findAllProducts());
		return "product/products";
	}
	
	
}
