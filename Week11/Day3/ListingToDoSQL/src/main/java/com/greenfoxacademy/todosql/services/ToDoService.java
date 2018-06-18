package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface ToDoService {


    public void add(String title);

    public ArrayList<ToDo> listToDos();

}
