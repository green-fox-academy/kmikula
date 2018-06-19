package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable("id") Long id) {
        toDoService.delete(id);

        return new ModelAndView("redirect:/List");
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable("id") Long id, Model model) {
        toDoService.edit(id);
        model.addAttribute("todoItem", toDoService.edit(id));

        return new ModelAndView("editForm");
    }


    @PostMapping("/save")
    public String save(@RequestParam(value = "id") Long id, @RequestParam(value = "title") String title,
                       @RequestParam(required = false,defaultValue = "false", value = "urgent") Boolean urgent,
                       @RequestParam(required = false, defaultValue = "false",value = "done") Boolean done) {
        toDoService.save(id, title, urgent, done);
        return "redirect:/List";
    }
}

