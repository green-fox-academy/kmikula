package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AssigneeController {
    private final AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/assignees")
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.listAssignees());
        return "assignees";
    }

    @GetMapping("/{id}/editAssignee")
    public ModelAndView editAssignee(@PathVariable("id") Long id, Model model) {

        model.addAttribute("assigneeItem", assigneeService.editAssignee(id));
        return new ModelAndView("editAssignee");
    }

    @PostMapping("/saveName")
    public String saveName(@RequestParam(value = "id") Long id,
                           @RequestParam(value = "name") String name) {
        assigneeService.saveAssignee(id, name);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/removeAssignee")
    public String removeAssignee(@PathVariable("id") Long id) {

        assigneeService.deleteAssignee(id);
        return "redirect:/assignees";
    }

    @PostMapping("/addAssignee")
    public String addAssignee(@RequestParam("name") String name,
                              @RequestParam("email") String email) {
        assigneeService.addAssignee(name, email);
        return "redirect:/assignees";
    }
}
