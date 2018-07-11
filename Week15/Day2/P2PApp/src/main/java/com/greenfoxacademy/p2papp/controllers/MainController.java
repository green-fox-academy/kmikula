package com.greenfoxacademy.p2papp.controllers;

import com.greenfoxacademy.p2papp.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    UsersService usersService;

    @Autowired
    public MainController (UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String renderRegisterPage(Model model) {

        return "registerPage";
    }

    @PostMapping("/registeruser")
    public String registerUser(@RequestParam("username") String name, Model model) {

        usersService.saveUser(name);

        return "redirect:/mainpage";
    }

    @GetMapping("/mainpage")
    public String renderMainpage( Model model) {

        model.addAttribute("username", usersService.findUser(1L).getName());

        return "mainpage";
    }

    @PostMapping("/updateuser")
    public String updateUser(@RequestParam("username")String name, Model model) {

        usersService.updateUser(1L, name);
        model.addAttribute("username", usersService.findUser(1L).getName());

        return "redirect:/mainpage";
    }

}
