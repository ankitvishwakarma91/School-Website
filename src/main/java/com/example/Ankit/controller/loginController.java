package com.example.Ankit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class loginController {


    @GetMapping("/login")
    public String displayLoginPage(@RequestParam(value = "error", required = false) String error,
                                   @RequestParam(value = "logout", required = false) String logout,
                                   Model model) {

        String errorMessge = null;
        if (error != null) {
            errorMessge = "Invalid username or password";
        }
        if (logout != null) {
            errorMessge = "You have been logged out successfully";
        }
        model.addAttribute("errorMessge", errorMessge);
        return "login";
    }
}
