package com.winningwoman.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winningwoman.market.dto.request.ProductRequest;
import com.winningwoman.market.dto.response.ProductResponse;
import com.winningwoman.market.model.Product;
import com.winningwoman.market.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public ProductResponse post(@RequestBody ProductRequest productRequest) {
		return productService.create(productRequest);
	}
	
	@GetMapping
	public List<Product> getAll() {
		return productService.getAll();
	}
	
}
