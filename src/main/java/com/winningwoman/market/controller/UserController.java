package com.winningwoman.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winningwoman.market.model.User;
import com.winningwoman.market.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping
	public void post(@RequestBody User user) {
		userRepository.save(user);
	}
	
	
	
}
