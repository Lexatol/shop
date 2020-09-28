package com.geekbrains.geekmarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/checkout")
    public String login() {
        return "checkout";
    }

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "access-denied";
    }
}
