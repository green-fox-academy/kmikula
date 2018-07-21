package com.greenfoxacademy.todosql.repositories;

import com.greenfoxacademy.todosql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
    ArrayList<ToDo>findAll();

    ToDo findToDoById(Long id);

    ArrayList<ToDo> findAllToDoByTitle(String title);

//    @Query(select todo from Todo todo where todo.title = :title and todo.dueDate = :dueDate)
//    ArrayList<ToDo>findAllToDoByTitleOrDueDate(@Param("title") String title,
//                                  @Param("dueDate") String dueDate);


    ArrayList<ToDo>findAllToDoByAssigneeId(Long id);

}
