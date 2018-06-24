package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {
    ArrayList<Fox> foxes;
    Fox fox = new Fox();

    public FoxService() {

        foxes = new ArrayList<>();
           foxes.add(fox);
    }

    public ArrayList<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(ArrayList<Fox> foxes) {
        this.foxes = foxes;
    }

    public Fox getFox() {
        return fox;
    }

    public void setFox(Fox fox) {
        this.fox = fox;
    }


    public void addFood(Food food) {
        fox.setFoxFood(food);
    }

    public void addDrink(Drink drink) {
        fox.setFoxDrink(drink);
    }


}
