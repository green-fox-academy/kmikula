package com.greenfoxacademy.todosql.repositories;

import com.greenfoxacademy.todosql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
