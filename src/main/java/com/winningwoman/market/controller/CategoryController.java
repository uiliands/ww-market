package com.winningwoman.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winningwoman.market.model.Category;
import com.winningwoman.market.repository.CategoryRepository;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@PostMapping
	public void post(@RequestBody Category category) {
		categoryRepository.save(category);
	}
	
	@GetMapping
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}
	
}
