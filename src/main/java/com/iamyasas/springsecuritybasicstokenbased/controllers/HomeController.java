package com.iamyasas.springsecuritybasicstokenbased.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/api1")
	public String user() {
		return ("<h1>Welcome api 1</h1>");
	}
	
	@GetMapping("/api2")
	public String admin() {
		return ("<h1>Welcome api 2</h1>");
	}
	
}
