package com.amitk.spring.security.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleOAuthController {

	@GetMapping("/profile")
	public Map<String, Object> userProfile(@AuthenticationPrincipal OAuth2User principal) {
		return principal.getAttributes(); // contains name, email, picture etc.
	}
}
