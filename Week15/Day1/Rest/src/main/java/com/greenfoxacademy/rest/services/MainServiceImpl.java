package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.*;
import com.greenfoxacademy.rest.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MainServiceImpl implements MainService {

    private LogRepository logRepository;

    @Autowired
    public MainServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }


    @Override
    public Object doubleValue(Integer value) {


        if (value == null) {
            return new ErrorMessage("Please provide an input!");

        } else {

            return new InputData(value, value * 2);
        }

    }

    @Override
    public Greeter welcomeMessage(String name, String title) {

        return new Greeter(name, title, "Oh, hi there " + name + ", my dear " + title + "!");
    }

    @Override
    public Appenda appendStrings(String appendable) {

        return new Appenda(appendable, appendable + "a");
    }

    @Override
    public Dountil sumAllElements(int value) {
        Dountil dountil = new Dountil();

        dountil.setUntil(value);

        int sumResult = 0;

        for (int i = 1; i <= dountil.getUntil(); i++) {
            sumResult += i;
        }

        dountil.setResult(sumResult);

        return dountil;
    }

    @Override
    public Dountil factor(int value) {
        Dountil dountil = new Dountil();

        dountil.setUntil(value);

        int factor = 1;

        for (int i = 1; i <= dountil.getUntil(); i++) {
            factor *= i;
        }
        dountil.setResult(factor);

        return dountil;
    }

    public void chooseOperation(String what, ArrayList<Integer> numbers) {
        if (what.equals("sum")) {
            addArrayElements(numbers);
        } else if (what.equals("multiply")) {
            multiplyArrayElements(numbers);
        } else if (what.equals("double")) {
            doubleArrayElements(numbers);
        }

    }

    @Override
    public ArrayHandler addArrayElements(ArrayList<Integer> numbers) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(sum);

        arrayHandler.setNumbers(numbers);
        arrayHandler.setResult(temp);
        arrayHandler.setWhat("sum");
        return arrayHandler;
    }

    @Override
    public ArrayHandler multiplyArrayElements(ArrayList<Integer> numbers) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int sum = 1;

        for (int i = 0; i < numbers.size(); i++) {
            sum *= numbers.get(i);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(sum);

        arrayHandler.setNumbers(numbers);
        arrayHandler.setResult(temp);
        arrayHandler.setWhat("multiply");
        return arrayHandler;
    }

    @Override
    public ArrayHandler doubleArrayElements(ArrayList<Integer> numbers) {
        ArrayHandler arrayHandler = new ArrayHandler();


        ArrayList<Integer> doubled = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            doubled.add(numbers.get(i) * 2);
        }
        arrayHandler.setNumbers(numbers);
        arrayHandler.setResult(doubled);
        arrayHandler.setWhat("double");

        return arrayHandler;
    }

    @Override
    public void saveLogs(String endpoint, String data) {

        Log log = new Log();
        log.setEndpoint(endpoint);
        log.setData(data);

        logRepository.save(log);

    }

    @Override
    public ArrayList<Log> listLogs() {
        return logRepository.findAll();
    }

}
