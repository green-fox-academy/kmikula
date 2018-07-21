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

        Assignee assignee = new Assignee("Lisa", "lisa@gmail.com");
        ToDo todo1 = new ToDo("water the plants", "pour water on all the plants", "22-11-2018");
        assigneeRepository.save(assignee);
        todo1.setAssignee(assignee);
        toDoRepository.save(todo1);
    }
}
