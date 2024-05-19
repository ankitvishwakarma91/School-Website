package com.example.Ankit.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ControllerPage {


    @RequestMapping(value = {"","/","/home"})
    public String displayHomePage(){
        return "home";
    }

    @GetMapping("/courses")
    public String displayCoursesPage(){
        return "courses";
    }

    @GetMapping("/about")
    public String displayAboutPage(){
        return "about";
    }

}
