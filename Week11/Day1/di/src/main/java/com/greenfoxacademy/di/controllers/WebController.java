package com.greenfoxacademy.di.controllers;

import com.greenfoxacademy.di.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("useful/{email}")
    public String emailCheck(@RequestParam("email") String address, Model model) {

        model.addAttribute("emailCheck", utilityService.validateEmail(address));
        model.addAttribute("trueResponse", "is@this.valid is a valid email address");
        model.addAttribute("falseResponse", "not_valid_email.com is not a valid email address");
        return "email";
    }

    @GetMapping("useful/encoder")
    public String ceasarEncoder(@RequestParam("text") String text,
                                @RequestParam("number") int number, Model model) {
        String encoded = utilityService.caesar(text, number);
        model.addAttribute("encodedText", encoded);
        return "encoder";
    }

    @GetMapping("useful/decoder")           //TODO: debug
    public String ceasarDecoder(@RequestParam("text") String text,
                                @RequestParam("number") int number, Model model) {
        String encoded = utilityService.caesar(text, (number * -1));
        model.addAttribute("encodedText", encoded);
        return "encoder";
    }



}



