package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong incrementID = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " Klari");
        long loadingNr = incrementID.getAndIncrement();;
        model.addAttribute("loadingNr", loadingNr++);
        return "greeting";
    }

}
