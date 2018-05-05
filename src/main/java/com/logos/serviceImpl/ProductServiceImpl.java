package com.logos.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logos.entity.Product;
import com.logos.repository.ProductRepository;
import com.logos.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired private ProductRepository productRepository;
	
	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.getOne(id);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
