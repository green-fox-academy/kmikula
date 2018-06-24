package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;

public class Fox {
    private String name;
    private Food foxFood;
    private Drink foxDrink;
    private ArrayList<Trick> foxTricks;

    public Fox() {
        foxTricks = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFoxFood() {
        return foxFood;
    }

    public void setFoxFood(Food food) {
        this.foxFood = food;
    }

    public Drink getFoxDrink() {
        return foxDrink;
    }

    public void setFoxDrink(Drink foxDrink) {
        this.foxDrink = foxDrink;
    }



    public ArrayList<Trick> getFoxTricks() {
        return foxTricks;
    }

    public void setFoxTricks(ArrayList<Trick> foxTricks) {
        this.foxTricks = foxTricks;
    }


    public void checkAndAddTrick(Trick trick) {
        if (!getFoxTricks().contains(trick)) {
            getFoxTricks().add(trick);
        }

    }

    public int nrOfTricksLearned() {
        return getFoxTricks().size();
    }
}