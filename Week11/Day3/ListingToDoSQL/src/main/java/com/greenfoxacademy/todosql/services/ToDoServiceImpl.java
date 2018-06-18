package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.ToDo;
import com.greenfoxacademy.todosql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoServiceImpl implements ToDoService {

    ToDoRepository toDoRepository;

    @Autowired
    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public void add(String title) {
        ToDo todo = new ToDo(title);
        toDoRepository.save(todo);
    }

    @Override
    public ArrayList<ToDo> listToDos() {
        return toDoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        toDoRepository.deleteById(id);
    }

}
