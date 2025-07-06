package com.amitk.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amitk.spring.security.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
}
