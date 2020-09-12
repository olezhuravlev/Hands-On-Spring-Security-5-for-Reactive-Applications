package com.packtpub.book.ch02.springsecurity.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model, Principal principal) {
        
        if (principal != null)
            model.addAttribute("msg",
                "Welcome " + principal.getName() + " into in-memory managed user using BASIC authentication.");
        
        return "home";
    }
}
