package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAppWithoutSecuirtyController {
	@GetMapping("/withoutSecurity")
	public String sayWelcome() {
		return "Building a Spring application without any security measures is like leaving your front door wide open";
	}
}
