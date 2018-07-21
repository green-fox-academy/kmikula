package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.Assignee;
import com.greenfoxacademy.todosql.models.ToDo;
import com.greenfoxacademy.todosql.repositories.AssigneeRepository;
import com.greenfoxacademy.todosql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AssigneeServiceImpl implements AssigneeService {

    private AssigneeRepository assigneeRepository;
    private ToDoRepository toDoRepository;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository, ToDoRepository toDoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.toDoRepository = toDoRepository;
        Assignee assignee1 = new Assignee("Annie", "annie@gmail.com");
        Assignee assignee2 = new Assignee("John", "john@gmail.com");
        Assignee assignee3 = new Assignee("Bradley", "bradley@gmail.com");

        assigneeRepository.save(assignee1);
        assigneeRepository.save(assignee2);
        assigneeRepository.save(assignee3);
    }

    @Override
    public ArrayList<Assignee> listAssignees() {
        return assigneeRepository.findAll();
    }

    @Override
    public Assignee editAssignee(Long id) {
        return assigneeRepository.findAssigneeById(id);
    }

    @Override
    public Assignee saveAssignee(Long id, String name) {
        assigneeRepository.findAssigneeById(id).setName(name);
        return assigneeRepository.save(assigneeRepository.findAssigneeById(id));
    }


    @Override
    public void deleteAssignee(Long id) {
        assigneeRepository.deleteById(id);
    }

    @Override
    public void addAssignee(String name, String email) {
        assigneeRepository.save(new Assignee(name, email));
    }

    @Override
    public ArrayList<ToDo> listAssigneeTodos(Long id) {
//        return assigneeRepository.findAllToDobyAssigneeId(id);
        return toDoRepository.findAllToDoByAssigneeId(id);
    }


}
