package com.greenfoxacademy.di.controllers;

import com.greenfoxacademy.di.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    UtilityService utilityService;

    @Autowired
    public WebController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String landingPage() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String randomColor(Model model) {
        model.addAttribute("colors", utilityService.randomColor());
        return "background";
    }


}

