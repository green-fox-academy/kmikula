package com.greenfoxacademy.resttest.controllers;

import com.greenfoxacademy.resttest.models.ErrorMessage;
import com.greenfoxacademy.resttest.models.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {


    @GetMapping("/groot")
    public Object groot(@RequestParam(value = "received") String received) {

        if (received.length() == 0) {
            return new ErrorMessage("I am groot");
        } else {

           return new Message(received, "I am groot");
        }

    }

// localhost:8080/groot?received=input
}
