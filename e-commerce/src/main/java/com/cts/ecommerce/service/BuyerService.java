package com.cts.ecommerce.service;

import com.cts.ecommerce.model.Buyer;
import com.cts.ecommerce.request.BuyerRequest;

public interface BuyerService {

	public Buyer createUserReq(BuyerRequest buyerRequest);
	
}