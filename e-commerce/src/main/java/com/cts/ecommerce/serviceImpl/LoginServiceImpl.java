package com.cts.ecommerce.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecommerce.model.Buyer;
import com.cts.ecommerce.repository.BuyerRepository;
import com.cts.ecommerce.request.LoginRequest;
import com.cts.ecommerce.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private BuyerRepository buyerRepo;

	@Override
	public Buyer LoginUser(LoginRequest loginRequest) {
		Buyer user=new Buyer();
		
		user=buyerRepo.findOneByPhoneNumberAndPassword(loginRequest.getPhoneNumber(),loginRequest.getPassword());
		return user;
	}


}