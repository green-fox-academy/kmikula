package com.greenfoxacademy.di;

import com.greenfoxacademy.di.services.MyColor;
import com.greenfoxacademy.di.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

    @Autowired
    Printer printer;

    @Qualifier(value = "myColorImplGreen")
    @Autowired
    MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        myColor.printColor();
    }
}
