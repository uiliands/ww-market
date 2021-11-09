package com.winningwoman.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winningwoman.market.dto.request.ProductRequest;
import com.winningwoman.market.dto.response.ProductResponse;
import com.winningwoman.market.model.Category;
import com.winningwoman.market.model.Product;
import com.winningwoman.market.repository.CategoryRepository;
import com.winningwoman.market.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public ProductResponse create(ProductRequest productRequest) {
		Category category = this.categoryRepository.findById(productRequest.getIdCategory()).orElseThrow(RuntimeException::new);
		Product product = new Product(productRequest, category);
		Product productCreated = this.productRepository.save(product);
		return new ProductResponse(productCreated);
	}
	
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	
}
