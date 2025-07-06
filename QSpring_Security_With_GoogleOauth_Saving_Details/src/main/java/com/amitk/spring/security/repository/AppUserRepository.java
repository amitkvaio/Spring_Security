package com.amitk.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amitk.spring.security.entity.AppUser;

@Repository
public interface AppUserRepository  extends JpaRepository<AppUser, String> {
	 Optional<AppUser> findByOauth2Id(String oauth2Id);
}