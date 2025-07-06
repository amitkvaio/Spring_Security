package com.spring.security.amitk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class SessionController {

	@GetMapping("/invalidSession")
	public ResponseEntity<?> invalidSession(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			return ResponseEntity.ok("✅ Session is destroyed.");
		} else {
			return ResponseEntity.ok("❌ Session still exists.");
		}
	}
}