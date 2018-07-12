package com.greenfoxacademy.p2papp.repositories;

import com.greenfoxacademy.p2papp.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message>findAll();
}
