package com.winningwoman.market.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.winningwoman.market.dto.request.ProductRequest;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@Entity
public class Product {
	
	public Product(ProductRequest productRequest, Category category) {
		this.setName(productRequest.getName());
		this.setQtd(productRequest.getQtd());
		this.setPrice(productRequest.getPrice());
		this.setCategory(category);
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int qtd;
	private float price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	@JsonIgnore
	private Category category;
	
}
