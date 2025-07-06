package com.amitk.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    	http.csrf(csrfConfig -> csrfConfig.disable())
    		.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
    	
    	http.formLogin(
                form -> form
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/welcome")
                .permitAll());
    	
    	http.logout(
                logout -> logout
                .logoutUrl("/logout")
                .permitAll());
    	
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        
    	UserDetails user = User.withUsername("user")
        						.password("{noop}user")
        						.authorities("read")
        						.build();
        
        UserDetails admin = User.withUsername("admin")
                            .password("{bcrypt}$2a$10$0XR7EcRzxJQm3NlOV1RzDe..La4yJoyaSNh7n9ihxJ.30sye/uFo2")//admin
                            .authorities("admin")
                            .build();
        
        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
