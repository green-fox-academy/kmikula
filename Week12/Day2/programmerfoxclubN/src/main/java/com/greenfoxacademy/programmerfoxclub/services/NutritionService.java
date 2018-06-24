package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NutritionService {

    ArrayList<Food>foodList;
    ArrayList<Drink>drinkList;
    ArrayList<Trick>trickList;

    public NutritionService() {
        foodList = new ArrayList<>();
        drinkList = new ArrayList<>();
        trickList = new ArrayList<>();
    }

    public void fillFoodList() {
        Food food1 = new Food("SALAD");
        Food food2 = new Food("SANDWICH");
        Food food3 = new Food("VEGETABLES");
        Food food4 = new Food("APPLE");

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    public void fillDrinkList() {

        Drink drink1 = new Drink("JUICE");
        Drink drink2 = new Drink("LEMONADE");
        Drink drink3 = new Drink("ICE TEA");
        Drink drink4 = new Drink("CIDER");

        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);
        drinkList.add(drink4);
    }

    public ArrayList<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(ArrayList<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public void fillTrickList() {
        Trick trick1 = new Trick("code in Java");
        Trick trick2 = new Trick("prepare sushi");
        Trick trick3 = new Trick("speak Frenglish");
        Trick trick4 = new Trick("be friend with green rabbits");
        Trick trick5 = new Trick("do excelmagic");

        trickList.add(trick1);
        trickList.add(trick2);
        trickList.add(trick3);
        trickList.add(trick4);
        trickList.add(trick5);
    }

    public ArrayList<Trick> getTrickList() {
        return trickList;
    }

    public void setTrickList(ArrayList<Trick> trickList) {
        this.trickList = trickList;
    }


}
