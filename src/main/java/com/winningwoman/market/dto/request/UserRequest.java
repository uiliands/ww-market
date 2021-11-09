package com.winningwoman.market.dto.request;

import java.util.Date;

import lombok.Data;

@Data
public class UserRequest {
	
	private String name;
	private String lastname;
	private String email;
	private String pass;
	private Date creation_date;
	
	private Long idPosition;
}
