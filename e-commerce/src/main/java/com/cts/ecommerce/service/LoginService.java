package com.cts.ecommerce.service;

import com.cts.ecommerce.model.Buyer;
import com.cts.ecommerce.request.LoginRequest;

public interface LoginService {

	public Buyer LoginUser(LoginRequest loginRequest);
}