package com.greenfoxacademy.p2papp.controllers;

import com.greenfoxacademy.p2papp.services.UsersService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {

//    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MainController.class);

    Logger logger = LogManager.getLogger(MainController.class);

    UsersService usersService;

    @Autowired
    public MainController(UsersService usersService) {
        this.usersService = usersService;

    }

    @GetMapping("/register")
    public String renderRegisterPage(Model model) {

        logger.info("Request /register GET");

        return "registerPage";
    }

    @PostMapping("/registeruser")
    public String registerUser(@RequestParam("username") String name, Model model) {

        try {

      //      model.addAttribute("missingUser", (name = null));
      //      model.addAttribute("errorMessage", "The username field is empty");

            usersService.saveUser(name);

            logger.info("Request /registeruser POST text=" + name);

        } catch (Exception e) {

            logger.error("No username" + e.getMessage());
        }

        return "redirect:/mainpage";
    }

    @GetMapping("/mainpage")
    public String renderMainpage(Model model) {

        model.addAttribute("username", usersService.findUser(1L).getName());
        model.addAttribute("messageList", usersService.listMessages());

        logger.info("Request /mainpage GET");

        return "mainpage";
    }

    @PostMapping("/updateuser")
    public String updateUser(@RequestParam("username") String name, Model model) {

        usersService.updateUser(1L, name);
        model.addAttribute("username", usersService.findUser(1L).getName());

        logger.info("Request /updateuser POST text=" + name);

        return "redirect:/mainpage";
    }

    @PostMapping("/storemessage")
    public String storeMessage(@RequestParam("message") String message) {

        usersService.saveMessage(usersService.findUser(1L).getName(), message);

        return "redirect:/mainpage";
    }

}
