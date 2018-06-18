package com.greenfoxacademy.di.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    ArrayList<String> names;

    public StudentServiceImpl() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }


    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String student) {
        names.add(student);
    }

    @Override
    public int count() {
        return names.size();
    }

    @Override
    public boolean checkName(String name) {
        return names.contains(name);
    }


}
