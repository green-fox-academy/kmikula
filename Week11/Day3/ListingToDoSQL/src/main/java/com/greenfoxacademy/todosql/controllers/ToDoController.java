package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value = "todo")
public class ToDoController {
    private final ToDoRepository toDoRepository;


    @Autowired
    public ToDoController(ToDoRepository toDoRepository){
        this.toDoRepository=toDoRepository;
    }

    @GetMapping(value = {"/", "/List"})
    //@ResponseBody
    public String worksFine(Model model) {

        //toDoRepository.save(new ToDo("title",true,true));
        model.addAttribute("todos", toDoRepository.findAll() );
        //return "This is my first todo.";
        return "index";

    }
}
