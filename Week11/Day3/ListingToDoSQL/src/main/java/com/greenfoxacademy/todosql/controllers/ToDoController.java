package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller(value = "todo")
public class ToDoController {
    private final ToDoService toDoService;


    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping(value = {"/", "/List"})
    //@ResponseBody
    public String worksFine(Model model) {

        //toDoRepository.save(new ToDo("title",true,true));
        model.addAttribute("todos", toDoService.listToDos());
        //return "This is my first todo.";
        return "index";

    }

    @GetMapping("/addtodo")
    public String addTodoForm(Model model) {
        return "todoForm";
    }


    @PostMapping("/addtolist")
    public String addTodo(@RequestParam(value = "title") String title, Model model) {
        toDoService.add(title);
        return "redirect:/List";
    }
}
