package com.cts.ecommerce.response;

import com.cts.ecommerce.model.Buyer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {

	private Long buyerId;	
	private String name;
	
	public LoginResponse(Buyer buyer) {
		this.buyerId = buyer.getBuyerId();
		this.name = buyer.getName();
	}
	
	
}