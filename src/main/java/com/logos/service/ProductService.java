package com.logos.service;

import java.util.List;

import com.logos.entity.Product;

public interface ProductService {
	
	void saveProduct(Product product);
	
	Product findProductById(int id);
	
	List<Product> findAllProducts();

}
