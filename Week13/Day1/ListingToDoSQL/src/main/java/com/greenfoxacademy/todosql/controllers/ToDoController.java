package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.services.AssigneeService;
import com.greenfoxacademy.todosql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "todo")
public class ToDoController {
    private final ToDoService toDoService;
    private final AssigneeService assigneeService;


    @Autowired
    public ToDoController(ToDoService toDoService, AssigneeService assigneeService) {
        this.toDoService = toDoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"/", "/List"})
    //@ResponseBody
    public String worksFine(Model model) {

        //toDoRepository.save(new ToDo("title",true,true));
        model.addAttribute("todos", toDoService.listToDos());

        //return "This is my first todo.";
        return "index";

    }


    @PostMapping("/search")
    public String search(@RequestParam("title") String title, Model model) {

        model.addAttribute("lookUpItem", toDoService.lookUpTitle(title));
        return "searchResult";
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
        model.addAttribute("assignees", assigneeService.listAssignees());
        return new ModelAndView("editForm");
    }


    @PostMapping("/save")
    public String save(@RequestParam(value = "id") Long id,
                       @RequestParam(value = "title") String title,
                       @RequestParam(required = false, defaultValue = "false", value = "urgent") Boolean urgent,
                       @RequestParam(required = false, defaultValue = "false", value = "done") Boolean done,
                       /*@RequestParam(value = "assigneeId") Long assigneeId,*/
                       @RequestParam(value = "assigneeName") String  assigneeName) {
        toDoService.save(id, title, urgent, done, assigneeName);
        return "redirect:/List";
    }
}

