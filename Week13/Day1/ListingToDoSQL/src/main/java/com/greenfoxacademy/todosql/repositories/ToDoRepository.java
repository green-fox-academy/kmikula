package com.greenfoxacademy.todosql.repositories;

import com.greenfoxacademy.todosql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
    ArrayList<ToDo> findAll();

    ToDo findToDoById(Long id);

    ArrayList<ToDo> findAllToDoByTitle(String title);


    ArrayList<ToDo> findAllToDoByAssigneeId(Long id);

}
