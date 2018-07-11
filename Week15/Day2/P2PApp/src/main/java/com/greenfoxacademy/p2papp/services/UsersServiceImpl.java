package com.greenfoxacademy.p2papp.services;

import com.greenfoxacademy.p2papp.models.Users;
import com.greenfoxacademy.p2papp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    UserRepository userRepository;

    @Autowired
    public UsersServiceImpl (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(String name) {
        Users user = new Users();
        user.setName(name);
        userRepository.save(user);
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
}
