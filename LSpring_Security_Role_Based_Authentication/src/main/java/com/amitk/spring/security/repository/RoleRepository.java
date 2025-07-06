package com.amitk.spring.security.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

import com.amitk.spring.security.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}