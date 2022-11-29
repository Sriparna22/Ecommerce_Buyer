package com.cts.ecommerce.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecommerce.model.Buyer;
import com.cts.ecommerce.request.BuyerRequest;
import com.cts.ecommerce.request.LoginRequest;
import com.cts.ecommerce.response.BuyerResponse;
import com.cts.ecommerce.response.LoginResponse;
import com.cts.ecommerce.service.BuyerService;
import com.cts.ecommerce.service.LoginService;

@RestController
@CrossOrigin(origins="*")
public class BuyerController {
	
	@Autowired
	private BuyerService buyerService;
	
	@Autowired
	private LoginService loginService;
	
	
	
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody BuyerRequest buyerRequest){
		BuyerResponse buyerResponse=null;
		Buyer user=null;
		try{
			user=buyerService.createUserReq(buyerRequest);
			return ResponseEntity.of(Optional.of(new BuyerResponse(user))); 
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("User Already Exist",HttpStatus.FORBIDDEN);
		}
	}
	
	@PostMapping("/loginbuyer")
	public ResponseEntity<?> LoginUser(@RequestBody LoginRequest loginRequest){
		Buyer user=null;
		LoginResponse loginResponse=null;
			user=loginService.LoginUser(loginRequest);
			if(user==null) {		
				return new ResponseEntity<>("User Not Found",HttpStatus.FORBIDDEN);
			}else {
			return ResponseEntity.status(HttpStatus.OK).body(new LoginResponse(user)); 
			}
	}	
	

}
