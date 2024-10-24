package com.Gtech.jenkins_Docker_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("companyName", "Gtech Technologies");
        model.addAttribute("description", "Innovative solutions for your tech needs");
        return "home";
    }
}
