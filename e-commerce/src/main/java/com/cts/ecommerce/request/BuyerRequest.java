package com.cts.ecommerce.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuyerRequest {
	
	private Long buyerId;	
	private String name;
	private String phoneNumber;
	private String password;
}

