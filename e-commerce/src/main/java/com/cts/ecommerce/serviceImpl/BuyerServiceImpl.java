package com.cts.ecommerce.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecommerce.model.Buyer;
import com.cts.ecommerce.repository.BuyerRepository;
import com.cts.ecommerce.request.BuyerRequest;
import com.cts.ecommerce.service.BuyerService;

@Service
public class BuyerServiceImpl implements BuyerService {
	
	@Autowired
	private BuyerRepository buyerRepo;
	
	public Buyer createUserReq(BuyerRequest buyerRequest){ 
		Buyer user= new Buyer(buyerRequest);
	     user=buyerRepo.save(user);		
		return user; 	
	}
	

	
	public Buyer  findByPhoneNumber(String phoneNumber) {
		return buyerRepo.findByPhoneNumber(phoneNumber);
		
	}
	}

			
		
		
		
		
		
		
		
		
//		public User authenticateUser(Authentication auth)
//		{
//			List<Buyer> list = buyerRepo.findAll();
//			for(Buyer user: list)
//			{
//				if(user.getphoneNumber().equalsIgnoreCase(auth.getphoneNumber()) && user.getPassword().equalsIgnoreCase(auth.getPassword()))
//				{
//					return user;
//				}
//			}
//			return null;
//		}
		
	


