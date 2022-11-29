package com.cts.ecommerce.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

	private String phoneNumber;
	private String password;

}
