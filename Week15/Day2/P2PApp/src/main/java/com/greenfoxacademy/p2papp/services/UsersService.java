package com.greenfoxacademy.p2papp.services;

import com.greenfoxacademy.p2papp.models.Message;
import com.greenfoxacademy.p2papp.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {

    void saveUser(String name);

    Users findUser(Long id);

    void updateUser(Long id, String name);

    void saveMessage(String name, String text);

    List<Message>listMessages();

}
