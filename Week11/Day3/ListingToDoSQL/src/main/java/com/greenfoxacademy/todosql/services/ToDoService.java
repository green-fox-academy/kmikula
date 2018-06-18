package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface ToDoService {


    void add(String title);

    ArrayList<ToDo> listToDos();

    void delete(Long id);

}
