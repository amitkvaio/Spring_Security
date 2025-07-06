package com.amitk.spring.security.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amitk.spring.security.jwt.JwtUtil;

@RestController
@RequestMapping("/api/jwt")
public class JwtController {

	private final JwtUtil jwtUtil;

	public JwtController(JwtUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
	}

	// Generate JWT token from username
	//http://localhost:2035/api/jwt/generate?username=amit
	@PostMapping("/generate")
	public ResponseEntity<String> generateToken(@RequestParam String username) {
		String token = jwtUtil.generateToken(username);
		return ResponseEntity.ok(token);
	}
	
	
	//http://localhost:2035/api/jwt/validate?token=x.y.z
	// Validate JWT token
	@GetMapping("/validate")
	public ResponseEntity<String> validateToken(@RequestParam String token) {
		String username = jwtUtil.validateToken(token);
		if (username != null) {
			return ResponseEntity.ok("Valid token for user: " + username);
		} else {
			return ResponseEntity.badRequest().body("Invalid or expired token");
		}
	}
}
