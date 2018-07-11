package com.greenfoxacademy.p2papp.services;

import com.greenfoxacademy.p2papp.models.Users;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {

    void saveUser(String name);

    Users findUser(Long id);

    void updateUser(Long id, String name);

}
