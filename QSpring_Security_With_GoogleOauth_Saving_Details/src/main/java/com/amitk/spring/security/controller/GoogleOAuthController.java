package com.amitk.spring.security.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amitk.spring.security.entity.AppUser;
import com.amitk.spring.security.repository.AppUserRepository;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class GoogleOAuthController  {
	
	private final AppUserRepository appUserRepository;

    @GetMapping("/profile")
    public Map<String, Object> profile(@AuthenticationPrincipal OAuth2User principal) {
        Map<String, Object> attributes = principal.getAttributes();

        String oauth2Id = (String) attributes.get("sub");
        String name = (String) attributes.get("name");
        String email = (String) attributes.get("email");
        String picture = (String) attributes.get("picture");

        // Save to DB if not exists
        appUserRepository.findByOauth2Id(oauth2Id)
                .orElseGet(() -> appUserRepository.save(
                        AppUser.builder()
                                .oauth2Id(oauth2Id)
                                .name(name)
                                .email(email)
                                .picture(picture)
                                .build()
                ));

        return attributes; // return JSON of user info
    }
}
