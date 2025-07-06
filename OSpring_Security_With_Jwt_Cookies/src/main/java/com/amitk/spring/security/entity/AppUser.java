package com.amitk.spring.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AppUser")
public class AppUser {
	@Id
	private String username;
	private String password;
	private String role;
}

/*
{
  "username": "user",
  "password": "user",
  "role": "ROLE_USER"
}

{
  "username": "admin",
  "password": "admin",
  "role": "ROLE_admin"
}
*/