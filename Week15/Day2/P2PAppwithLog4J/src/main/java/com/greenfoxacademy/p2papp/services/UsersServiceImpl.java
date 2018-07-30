package com.greenfoxacademy.p2papp.services;

import com.greenfoxacademy.p2papp.models.Message;
import com.greenfoxacademy.p2papp.models.Users;
import com.greenfoxacademy.p2papp.repositories.MessageRepository;
import com.greenfoxacademy.p2papp.repositories.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    Logger serviceLogger = Logger.getLogger(UsersServiceImpl.class);

    UserRepository userRepository;
    MessageRepository messageRepository;

    @Autowired
    public UsersServiceImpl(UserRepository userRepository, MessageRepository messageRepository) {
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
    }

    @Override
    public void saveUser(String name) {
        Users user = new Users();
        if (name != null) {
            user.setName(name);
            userRepository.save(user);
        } else if(name == null) {
            serviceLogger.error("Missing input (name field)");
        }
    }

    @Override
    public Users findUser(Long id) {
        return userRepository.findUsersById(id);
    }

    @Override
    public void updateUser(Long id, String name) {
        userRepository.findUsersById(id).setName(name);
        userRepository.save(userRepository.findUsersById(id));
    }

    @Override
    public void saveMessage(String name, String text) {
        Message message = new Message();
        message.setUsername(name);
        message.setText(text);

        messageRepository.save(message);

    }

    @Override
    public List<Message> listMessages() {
        return messageRepository.findAll();
    }

    @Override
    public void saveReceivedMessage(Long id, String name, String text, Timestamp timestamp) {
        Message message = new Message();
        message.setId(id);
        message.setUsername(name);
        message.setText(text);
        message.setTimestamp(timestamp);

        messageRepository.save(message);
    }
}
