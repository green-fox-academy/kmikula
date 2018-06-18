package com.greenfoxacademy.di.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<String> findAll();

    void save(String student);

    int count();

    boolean checkName(String name);
}
