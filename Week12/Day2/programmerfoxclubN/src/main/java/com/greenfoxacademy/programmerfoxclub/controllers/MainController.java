package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    FoxService foxService;

    NutritionService nutritionService;


    @Autowired
    public MainController(FoxService foxService, NutritionService nutritionService) {

        this.foxService = foxService;
        this.nutritionService = nutritionService;
        this.nutritionService.fillFoodList();
        this.nutritionService.fillDrinkList();
        this.nutritionService.fillTrickList();
    }


    @GetMapping("/")
    public String mainPage(@RequestParam("name") String name,
                           @RequestParam(value = "food", defaultValue = "CHICKEN", required = true) Food food,
                           @RequestParam(value = "drink", defaultValue = "WATER", required = false) Drink drink, Model model) {

//        Food defaultFood= new Food ("SANDWICH");

        foxService.getFox().setName(name);
        model.addAttribute("name", "This is " + name);


//        if(food == null) {
//            model.addAttribute("food", nutritionService.getFoodList().get(0));
//        } else{
//            model.addAttribute("food", foxService.getFox().getFoxFood());
//        }

        model.addAttribute("food", foxService.getFox().getFoxFood());
        model.addAttribute("drink", foxService.getFox().getFoxDrink());
        model.addAttribute("tricks", foxService.getFox().getFoxTricks());
        model.addAttribute("nrOfTricks", foxService.getFox().nrOfTricksLearned());

        return "profile";
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping("/{name}")
    public String infoPage(@RequestParam("name") String name, Model model) {

        return "redirect:/?name=" + name;
    }


    @GetMapping("/nutritionStore")
    public String nutritionStore(Model model) {


        model.addAttribute("foodList", nutritionService.getFoodList());
        model.addAttribute("food", nutritionService.getFoodList());

        model.addAttribute("drinkList", nutritionService.getDrinkList());
        model.addAttribute("drinks", nutritionService.getDrinkList());


        model.addAttribute("name", foxService.getFox().getName());

        return "nutritions";
    }

    @PostMapping("/changeNutrition")
    public String changeFoxNutrition(@RequestParam("food") Food food,
                                     @RequestParam("drink") Drink drink,
                                     @RequestParam(value = "name", required = false) String name, Model model) {

        foxService.addFood(food);
        foxService.addDrink(drink);

        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickCenter")
    public String trickCenter(Model model) {
        model.addAttribute("tricks", nutritionService.getTrickList());
        model.addAttribute("name", foxService.getFox().getName());
        model.addAttribute("drink", foxService.getFox().getFoxDrink());
        model.addAttribute("food", foxService.getFox().getFoxFood());
        return "trickCenter";
    }

    @PostMapping("/addTrick")
    public String addTrick(@RequestParam("trick") Trick trick,
                           @RequestParam("food") Food food,
                           @RequestParam("drink") Drink drink,
                           @RequestParam(value = "name", required = false) String name, Model model) {

        foxService.getFox().checkAndAddTrick(trick);


        return "redirect:/?name=" + name;
    }

}




