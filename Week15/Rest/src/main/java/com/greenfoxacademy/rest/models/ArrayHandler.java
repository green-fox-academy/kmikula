package com.greenfoxacademy.rest.models;

import java.util.ArrayList;

public class ArrayHandler {

    private String what;
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> result;

    public ArrayHandler() {
        this.numbers = new ArrayList<>();
        this.result = new ArrayList<>();
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

//    public Integer getResult() {
//        return result;
//    }
//
//    public void setResult(Integer result) {
//        this.result = result;
//    }


    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }
}
