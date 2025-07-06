package com.amitk.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.amitk.spring.security.jwt.JwtAuthenticationFilter;
import com.amitk.spring.security.service.CustomUserDetailsService;

@Configuration
public class SpringSecurityConfig {

	@Autowired private CustomUserDetailsService userDetailsService;
	@Autowired private JwtAuthenticationFilter jwtAuthenticationFilter;
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                // Replaced csrf().disable() with lambda configuration
                .csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth
						
						//Role Based authorization
						/*
						.requestMatchers(HttpMethod.POST, "/api/register**").hasRole("ADMIN")
						.requestMatchers(HttpMethod.PUT, "/api/**").hasRole("ADMIN")
						.requestMatchers(HttpMethod.DELETE, "/api/**").hasRole("ADMIN")
						.requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("ADMIN", "USER")
						.requestMatchers(HttpMethod.PATCH, "/api/**").hasAnyRole("ADMIN", "USER")
						.requestMatchers(HttpMethod.GET, "/api/**").permitAll()
                		*/
                		
                        .requestMatchers(
                                "/login",
                                "/api/jwt/**",
                                "/api/notice",
                                "/api/contactus",
                                "/api/register"
                        ).permitAll()
                        .requestMatchers(
                                "/api/myaccountbalance",
                                "/api/transaction",
                                "/api/welcome",
                                "/api/admin"
                        ).authenticated()
                        .anyRequest().denyAll()
                )
                // Form login configuration remains similar, using lambda
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/api/welcome", true)
                        .permitAll()
                )
                // Specify the UserDetailsService for this HttpSecurity chain
                .userDetailsService(userDetailsService)
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

	@Bean
	public AuthenticationManager authManager(HttpSecurity http) throws Exception {
		AuthenticationManagerBuilder authenticationManagerBuilder = http
				.getSharedObject(AuthenticationManagerBuilder.class);

		authenticationManagerBuilder.userDetailsService(userDetailsService)
				.passwordEncoder(new BCryptPasswordEncoder());

		return authenticationManagerBuilder.build();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
