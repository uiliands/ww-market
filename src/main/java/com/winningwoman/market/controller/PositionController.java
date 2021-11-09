package com.winningwoman.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.winningwoman.market.model.Position;
import com.winningwoman.market.repository.PositionRepository;

@RestController
@RequestMapping(value = "/position")
public class PositionController {
	
	@Autowired
	PositionRepository positionRepository;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public void post(@RequestBody Position position) {
		positionRepository.save(position);
	}
	
	@GetMapping
	public List<Position> getAll() {
		return positionRepository.findAll();
	}
	
}
