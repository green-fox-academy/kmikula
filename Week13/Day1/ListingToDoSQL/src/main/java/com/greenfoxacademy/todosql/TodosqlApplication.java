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

        Assignee assignee = new Assignee("Mr Anderson", "email");
        ToDo toSAve = new ToDo("water the plants");
        assigneeRepository.save(assignee);
        toSAve.setAssignee(assignee);
        toDoRepository.save(toSAve);
    }
}
