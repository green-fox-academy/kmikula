package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.Assignee;
import com.greenfoxacademy.todosql.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public interface AssigneeService {

    ArrayList<Assignee>listAssignees();

    Assignee editAssignee(Long id);

    Assignee saveAssignee(Long id, String name);

    void deleteAssignee(Long id);

    void addAssignee(String name, String email);

    ArrayList<ToDo> listAssigneeTodos(Long id);
}
