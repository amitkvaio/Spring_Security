package com.spring.security.amitk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdCardsController {

    @GetMapping("/prod")
    public  String getCardsDetails () {
        return "Returing the card details from the production environment.";
    }
}
