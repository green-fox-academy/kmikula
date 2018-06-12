package com.greenfoxacademy.di.services;

import org.springframework.stereotype.Service;

@Service
public class MyColorImplRed implements MyColor {

    public MyColorImplRed() {
    }

    @Override
    public void printColor() {
        System.out.println("Red");
    }
}
