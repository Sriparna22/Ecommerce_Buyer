package com.cts.ecommerce.response;

import com.cts.ecommerce.model.Buyer;
import lombok.*;
@Getter
@Setter

public class BuyerResponse {
	private Long buyerId;	
	private String name;
	private String phoneNumber;
	private String password;
	
	public BuyerResponse(Buyer buyer) {
		this.buyerId = buyer.getBuyerId();
		this.name = buyer.getName();
		this.phoneNumber = buyer.getPhoneNumber();
		this.password = buyer.getPassword();

}
}
