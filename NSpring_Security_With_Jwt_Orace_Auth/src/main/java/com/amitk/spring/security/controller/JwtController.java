package com.amitk.spring.security.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amitk.spring.security.jwt.JwtUtil;

@RestController
@RequestMapping("/api/jwt")
public class JwtController {
    @Autowired private JwtUtil jwtUtil;
    @Autowired private AuthenticationManager authManager;

    @PostMapping("/generate")
    public ResponseEntity<String> generateToken(@RequestParam String username, @RequestParam String password) {
        try {
            Authentication auth = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password));
            return ResponseEntity.ok(jwtUtil.generateToken(username));
        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @GetMapping("/validate")
    public ResponseEntity<String> validate(@RequestParam String token) {
        String user = jwtUtil.validateToken(token);
        return (user != null) ? ResponseEntity.ok("Valid token for: " + user)
                              : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
    }
}