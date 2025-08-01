package com.amitk.spring.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomLoginPageAuthController {
	
	@GetMapping("/welcome")
	public String formBasedAuthentication(Authentication authentication) {
		return "welcome";
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
}
