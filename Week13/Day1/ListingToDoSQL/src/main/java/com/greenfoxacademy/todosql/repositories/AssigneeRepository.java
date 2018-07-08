package com.greenfoxacademy.todosql.repositories;

import com.greenfoxacademy.todosql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    ArrayList<Assignee> findAll();

    Assignee findAssigneeById(Long id);

    Assignee findAssigneeByName(String name);


}
