package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.*;
import com.greenfoxacademy.rest.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RController {

    private MainService mainService;

    @Autowired
    public RController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/doubling")
    public InputData doubling(@RequestParam(value = "input") int input) {

        mainService.saveLogs("/doubling", String.valueOf(input));

        return mainService.doubleValue(input);
    }
    //localhost:8080/doubling?input=15


    @GetMapping("/greeter")
    public Greeter greeterMethod(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "title") String title) {

        mainService.saveLogs("/greeter", name + "," + title);

        return mainService.welcomeMessage(name, title);
    }
    //localhost:8080/greeter?name=Petike&title=student

    @GetMapping("appenda/{appendable}")
    public Appenda appendStrings(@PathVariable(value = "appendable") String appendable) {

        mainService.saveLogs("/appenda", appendable);

        return mainService.appendStrings(appendable);
    }

    @PostMapping("dountil/{what}")
    public Dountil doUntil(@PathVariable(value = "what") String what,
                           @RequestBody Until until) {

        mainService.saveLogs("/dountil", what + "," + until.toString());

        Dountil dountil = new Dountil();

        if (what.equals("sum")) {
            dountil = mainService.sumAllElements(until.getUntil());
        } else if (what.equals("factor")) {
            dountil = mainService.factor(until.getUntil());
        }
        return dountil;
    }

    @PostMapping("/arrays")
    public ArrayHandler arrayHandler(@RequestBody ArrayHandler arrayHandlerInput) {

        ArrayHandler arrayHandlerResult = new ArrayHandler();

        if (arrayHandlerInput.getWhat().equals("sum")) {
            arrayHandlerResult = mainService.addArrayElements(arrayHandlerInput.getNumbers());
        } else if (arrayHandlerInput.getWhat().equals("multiply")) {
            arrayHandlerResult = mainService.multiplyArrayElements(arrayHandlerInput.getNumbers());
        } else if (arrayHandlerInput.getWhat().equals("double")) {
            arrayHandlerResult = mainService.doubleArrayElements(arrayHandlerInput.getNumbers());
        }
        return arrayHandlerResult;
    }

    @GetMapping("/log")
    public ArrayList<Log> listAllLogs() {
        return mainService.listLogs();
    }


}
