package com.amitk.spring.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	//Public APIs
	@GetMapping("/notice")
	public ResponseEntity<String> publicNotice() {
		return ResponseEntity.ok("This is a public notice page. No authentication needed.");
	}

	@GetMapping("/contactus")
	public ResponseEntity<String> publicContact() {
		return ResponseEntity.ok("This is a public contact us page. No authentication needed.");
	}

	//Authenticated APIs
	@GetMapping("/myaccountbalance")
	public ResponseEntity<String> accountBalance() {
		return ResponseEntity.ok("Your account balance is ₹1,00,000.");
	}

	@GetMapping("/transaction")
	public ResponseEntity<String> transactionHistory() {
		return ResponseEntity.ok("Here are your last 5 transactions.");
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("Welcome to the protected API!");
	}

	@GetMapping("/admin")
	public ResponseEntity<String> admin() {
		return ResponseEntity.ok("Hello Admin! This is an admin-only section.");
	}
}
