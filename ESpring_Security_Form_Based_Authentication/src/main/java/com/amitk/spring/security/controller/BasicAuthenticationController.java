package com.amitk.spring.security.controller;

import java.util.Enumeration;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class BasicAuthenticationController {
	
	@GetMapping("/formbased")
	public String formBasedAuthentication(Authentication authentication) {
		String userName = authentication.getName();
		return "Hey! "+ userName + " Do you know that!? From and Basic Authentication is a simple way to secure your web application.\r\n"
				+ "It asks the user to provide a username and password to access certain pages or APIs.";
	}
	
	@GetMapping("/getheader")
    public String basicAuthentication(Authentication authentication, HttpServletRequest request) {
        // Print all headers
        StringBuilder headersInfo = new StringBuilder();
        headersInfo.append("Request Headers:\n");

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            String value = request.getHeader(header);
            headersInfo.append(header).append(": ").append(value).append("\n");
        }
        return headersInfo.toString();
    }
}
