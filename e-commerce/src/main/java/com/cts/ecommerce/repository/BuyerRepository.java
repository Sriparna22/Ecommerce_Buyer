package com.cts.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecommerce.model.Buyer;


	public interface BuyerRepository extends JpaRepository<Buyer,Long> {

		public Buyer findByPhoneNumber(String phoneNumber);
		
		public Buyer findOneByPhoneNumberAndPassword(String phoneNumber, String password);
	}
	



