package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.*;
import com.greenfoxacademy.rest.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RController {

    private MainService mainService;
    private ErrorMessage errorMessage;

    @Autowired
    public RController(MainService mainService, ErrorMessage errorMessage) {
        this.mainService = mainService;
        this.errorMessage = errorMessage;
    }

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input") Integer input) {

        mainService.saveLogs("/doubling", String.valueOf(input));

        return mainService.doubleValue(input);
    }
    //localhost:8080/doubling?input=15


    @GetMapping("/greeter")
    public Object greeterMethod(@RequestParam(required = false, value = "name") String name,
                                @RequestParam(required = false, value = "title") String title) {

        mainService.saveLogs("/greeter", name + "," + title);

        if (name.length() == 0 || title.length() == 0) {
            errorMessage.setError("Please provide a name and a title!");
            return errorMessage;
        } else {
            return mainService.welcomeMessage(name, title);
        }
    }
    //localhost:8080/greeter?name=Petike&title=student

    @GetMapping("appenda/{appendable}")
    public Appenda appendStrings(@PathVariable(value = "appendable") String appendable) {

        mainService.saveLogs("/appenda", appendable);

        return mainService.appendStrings(appendable);
    }

    @PostMapping("dountil/{what}")
    public Object doUntil(@PathVariable(value = "what") String what,
                          @RequestBody(required = false) Until until) {


        if (until == null) {
            errorMessage.setError("Please provide a number!");
            return errorMessage;
        } else if (what.equals("sum")) {
            mainService.saveLogs("/dountil", what + "," + until.getUntil());
            return mainService.sumAllElements(until.getUntil());

        } else if (what.equals("factor")) {
            mainService.saveLogs("/dountil", what + "," + until.getUntil());
            return mainService.factor(until.getUntil());

        } else {
            errorMessage.setError("Incorrect input");
            return errorMessage;
        }

    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody(required = false) ArrayHandler arrayHandlerInput) {


        if (arrayHandlerInput == null) {
            errorMessage.setError("Please provide what to do with the numbers!");
            return errorMessage;
        } else if (arrayHandlerInput.getWhat().equals("sum")) {
            return mainService.addArrayElements(arrayHandlerInput.getNumbers());
        } else if (arrayHandlerInput.getWhat().equals("multiply")) {
            return mainService.multiplyArrayElements(arrayHandlerInput.getNumbers());
        } else if (arrayHandlerInput.getWhat().equals("double")) {
            return mainService.doubleArrayElements(arrayHandlerInput.getNumbers());
        } else {
            errorMessage.setError("Invalid arrayhandler method");
            return errorMessage;
        }


    }

    @GetMapping("/log")
    public ArrayList<Log> listAllLogs() {
        return mainService.listLogs();
    }


}
