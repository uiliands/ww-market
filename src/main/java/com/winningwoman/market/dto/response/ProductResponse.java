package com.winningwoman.market.dto.response;

import com.winningwoman.market.model.Product;

import lombok.Data;

@Data
public class ProductResponse {
		
	public ProductResponse(Product product) {
		this.setId(product.getId());
		this.setName(product.getName());
		this.setQtd(product.getQtd());
		this.setPrice(product.getPrice());
		this.setCategoryName(product.getCategory().getName());
	}
	
	private Long id;
	private String name;
	private int qtd;
	private float price;
	
	private String categoryName;

}
