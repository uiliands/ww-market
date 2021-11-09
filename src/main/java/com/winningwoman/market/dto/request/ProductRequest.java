package com.winningwoman.market.dto.request;


import lombok.Data;

@Data
public class ProductRequest {
	
	private String name;
	private int qtd;
	private float price;
	
	private Long idCategory;

}
