package com.iamyasas.springsecuritybasicstokenbased.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {

	@GetMapping("/token1")
	public String getToken1() {

		return "token1";
	}

	@GetMapping("/token2")
	public String getToken2() {

		return "token2";
	}

}
