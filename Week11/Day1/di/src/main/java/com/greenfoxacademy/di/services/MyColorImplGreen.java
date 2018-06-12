package com.greenfoxacademy.di.services;

import org.springframework.stereotype.Service;

@Service
public class MyColorImplGreen implements MyColor {

    public MyColorImplGreen() {
    }

    @Override
    public void printColor() {
        System.out.println("Green");
    }
}
