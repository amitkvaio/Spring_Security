package com.amitk.spring.security.controller;

import com.amitk.spring.security.entity.AppUser;
import com.amitk.spring.security.repository.AppUserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AppUserController {

	private final AppUserRepository appUserRepository;
	private final PasswordEncoder passwordEncoder;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody AppUser customer) {
		try {
			System.out.println("Customer Details ::" + customer);
			String hashPwd = passwordEncoder.encode(customer.getPassword());
			customer.setPassword(hashPwd);
			AppUser appUser = appUserRepository.save(customer);
			System.out.println("Customer Details After save ::" + customer);
			if (appUser.getUsername() != null) {
				return ResponseEntity.status(HttpStatus.CREATED)
						.body("Given app user details are successfully registered");
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("App user registration failed");
			}
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An exception occurred: " + ex.getMessage());
		}
	}
}
