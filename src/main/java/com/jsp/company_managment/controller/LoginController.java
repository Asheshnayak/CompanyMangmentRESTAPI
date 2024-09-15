package com.jsp.company_managment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Name of the Thymeleaf template
    }

    @RequestMapping("/home")
    public String home() {
        return "home"; // Replace with your actual home page
    }
}
