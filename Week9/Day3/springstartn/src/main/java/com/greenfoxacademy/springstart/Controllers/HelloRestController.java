package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {
    AtomicLong incrementID = new AtomicLong(0);

//    @RequestMapping(value = "/greeting")
//    public Greetings greeting() {
//        return new Greetings( 1,"Hello World!");

    @RequestMapping(value = "/greeting")
    public Greetings greeting(@RequestParam(value = "name") String name) {
        name = "CodeGirlz";
        long id = incrementID.getAndIncrement();
        return new Greetings(id, "Hello " + name + "!");
    }

}
