package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface MainService {

    InputData doubleValue(int value);

    Greeter welcomeMessage(String name, String title);

    Appenda appendStrings(String appendable);

    Dountil sumAllElements(int value);

    Dountil factor(int value);

    void chooseOperation(String what, ArrayList<Integer> numbers);

    ArrayHandler addArrayElements(ArrayList<Integer> numbers);

    ArrayHandler multiplyArrayElements(ArrayList<Integer> numbers);

    ArrayHandler doubleArrayElements(ArrayList<Integer> numbers);
}
