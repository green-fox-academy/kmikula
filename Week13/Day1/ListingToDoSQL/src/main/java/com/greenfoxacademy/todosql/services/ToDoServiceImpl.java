package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.ToDo;
import com.greenfoxacademy.todosql.repositories.AssigneeRepository;
import com.greenfoxacademy.todosql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoServiceImpl implements ToDoService {

    ToDoRepository toDoRepository;
    AssigneeRepository assigneeRepository;

    @Autowired
    public ToDoServiceImpl(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
        this.toDoRepository = toDoRepository;
        this.assigneeRepository = assigneeRepository;
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

    @Override
    public ToDo edit(Long id) {
        return toDoRepository.findToDoById(id);
    }

    @Override
    public void save(Long id, String title, Boolean urgent, Boolean done , String assigneeName) {
        ToDo todo = toDoRepository.findToDoById(id);
        todo.setTitle(title);
        todo.setUrgent(urgent);
        todo.setDone(done);
        todo.setAssignee(assigneeRepository.findAssigneeByName(assigneeName));


        toDoRepository.save(todo);
    }

    @Override
    public ArrayList<ToDo> lookUpTitle(String title) {
        return toDoRepository.findAllToDoByTitle(title);
    }




}
