package com.amitk.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/").permitAll()
	                .anyRequest().authenticated()
	            )
	            .oauth2Login(oauth2 -> oauth2
	                .defaultSuccessUrl("/profile", true)
	            );
	        return http.build();
	    }
}