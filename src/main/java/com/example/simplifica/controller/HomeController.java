package com.example.simplifica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.simplifica.model.TesouroForm;

@Controller
public class HomeController {
    @Autowired
    TesouroForm tForm;

    @GetMapping("/home")
    public String home() {             
        return "home";
    }
 
    @GetMapping("/ranking")
    public String ranking() {
        return "ranking";
    }

    @GetMapping("/resultado")
    public String resultado() {
        return "resultado";
    }

}
