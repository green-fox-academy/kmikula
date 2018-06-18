package com.greenfoxacademy.di.controllers;

import com.greenfoxacademy.di.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/gfa")
    public String landingPageGfa(Model model) {
        model.addAttribute("counter", studentService.count());
        return "gfa";
    }


    @GetMapping("/gfa/list")
    public String gfaList(Model model) {
        model.addAttribute("studentList", studentService.findAll());
        return "gfaList";
    }

    @GetMapping("gfa/add")
    public String addStudentForm(Model model) {
        return "newStudentForm";
    }

    @PostMapping("gfa/save")
    public String addStudent(@RequestParam(value = "name") String name, Model model) {
        studentService.save(name);

        return "redirect:/gfa/list";
    }

    @GetMapping("gfa/check")
    public String check(Model model) {
        return "nameCheck";
    }

    @PostMapping("gfa/checkResult")
    public String checkResult(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("resultMessage", studentService.checkName(name));
        model.addAttribute("inList", name + " is in the list.");
        model.addAttribute("notInList", name + " is not in the list.");
        return "result";
    }
}
