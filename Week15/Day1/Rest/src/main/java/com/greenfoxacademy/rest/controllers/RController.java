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

        if (name == null || title == null) {
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



        Object object = new Object();

        if (until == null) {
            errorMessage.setError("Please provide a number!");
            object = errorMessage;
        } else if (what.equals("sum")) {
            object = mainService.sumAllElements(until.getUntil());
            mainService.saveLogs("/dountil", what + "," + until.getUntil());
        } else if (what.equals("factor")) {
            object = mainService.factor(until.getUntil());
            mainService.saveLogs("/dountil", what + "," + until.getUntil());
        }
        return object;
    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody(required = false) ArrayHandler arrayHandlerInput) {

        Object object = new Object();

        if (arrayHandlerInput == null) {
            errorMessage.setError("Please provide what to do with the numbers!");
            object = errorMessage;
        } else if (arrayHandlerInput.getWhat().equals("sum")) {
            object = mainService.addArrayElements(arrayHandlerInput.getNumbers());
        } else if (arrayHandlerInput.getWhat().equals("multiply")) {
            object = mainService.multiplyArrayElements(arrayHandlerInput.getNumbers());
        } else if (arrayHandlerInput.getWhat().equals("double")) {
            object = mainService.doubleArrayElements(arrayHandlerInput.getNumbers());
        }
        return object;

    }

    @GetMapping("/log")
    public ArrayList<Log> listAllLogs() {
        return mainService.listLogs();
    }


}
