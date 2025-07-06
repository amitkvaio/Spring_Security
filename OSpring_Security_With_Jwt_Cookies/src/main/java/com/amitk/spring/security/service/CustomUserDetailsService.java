package com.amitk.spring.security.service;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.amitk.spring.security.entity.AppUser;
import com.amitk.spring.security.repository.AppUserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private AppUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser appUser = userRepository.findById(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found"));

		return new User(appUser.getUsername(), 
				appUser.getPassword(), 
				List.of(new SimpleGrantedAuthority(appUser.getRole())));
	}
}
