package com.greenfoxacademy.p2papp.controllers;

import com.greenfoxacademy.p2papp.models.Message;
import com.greenfoxacademy.p2papp.services.StatusService;
import com.greenfoxacademy.p2papp.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

    private UsersService usersService;
    private StatusService statusService;

    @Autowired
    RController (UsersService usersService, StatusService statusService) {
        this.usersService = usersService;
        this.statusService = statusService;
    }

    @PostMapping("api/message/receive")
    public Object receiveMessage(@RequestBody Message message) {
        usersService.saveReceivedMessage(message.getId(),message.getUsername(),message.getText(),message.getTimestamp());

        return statusService.checkReceived(message);
    }
}
