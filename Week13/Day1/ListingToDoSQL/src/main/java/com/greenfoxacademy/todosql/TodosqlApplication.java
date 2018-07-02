package com.greenfoxacademy.todosql;

import com.greenfoxacademy.todosql.models.Assignee;
import com.greenfoxacademy.todosql.models.ToDo;
import com.greenfoxacademy.todosql.repositories.AssigneeRepository;
import com.greenfoxacademy.todosql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosqlApplication implements CommandLineRunner {
    @Autowired
    ToDoRepository toDoRepository;

    @Autowired
    AssigneeRepository assigneeRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodosqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Assignee businessMan = new Assignee("name", "email");
        ToDo toSAve = new ToDo("water the plants");
        assigneeRepository.save(businessMan);
        toSAve.setAssignee(businessMan);
        toDoRepository.save(toSAve);
    }
}
