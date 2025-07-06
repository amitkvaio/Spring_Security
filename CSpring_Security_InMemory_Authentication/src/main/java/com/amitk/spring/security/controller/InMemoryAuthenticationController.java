package com.amitk.spring.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InMemoryAuthenticationController {
	
	@GetMapping("/inmemory")
	public String greeting(Authentication authentication) {
		String userName = authentication.getName();
		return userName + ", In-Memory Authentication means storing user details (username, password, roles) "
				+ "in the application memory, rather than in a database or external system.";
	}
}
