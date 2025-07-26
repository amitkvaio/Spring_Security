package com.amitk.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankController {

    @GetMapping("/transfer")
    public String showTransferForm() {
        return "transfer";
    }

    @PostMapping("/transfer")
    @ResponseBody
    public String handleTransfer(@RequestParam String to, @RequestParam double amount) {
        System.out.println("Transferred ₹>>>>>>>>>>>>>>>>" + amount + " to " + to);
    	return "Transferred ₹" + amount + " to " + to;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}