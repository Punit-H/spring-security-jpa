package com.playground.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppResourceController {

    @GetMapping("/")
    public String landingPage(){
        return "<h1 align=\"center\">Welcome to gallery !!!</h1>";
    }

    @GetMapping("/user")
    public String landingPageForUser(){
        return "<h1 align=\"center\">Welcome user to our gallery !!!</h1>";
    }

    @GetMapping("/admin")
    public String landingPageForAdmin(){
        return "<h1 align=\"center\">All control to you Admin !!!</h1>";
    }
}
