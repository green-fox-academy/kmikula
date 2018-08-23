package com.greenfoxacademy.p2papp.services;

import com.greenfoxacademy.p2papp.models.Message;
import com.greenfoxacademy.p2papp.models.StatusMessageA;
import com.greenfoxacademy.p2papp.models.StatusMessageB;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {

    @Override
    public Object checkReceived(Message message) {

        Object object = new Object();
        StatusMessageA statusMessageA = new StatusMessageA();
        StatusMessageB statusMessageB = new StatusMessageB();

        if (message.getUsername() != null && message.getText() != null && message.getTimestamp() != null) {

            object = statusMessageA;

        } else if (message.getUsername() == null) {
            statusMessageB.setMessage("Missing field(s): message.username");
            object = statusMessageB;
        } else if (message.getText() == null) {
            statusMessageB.setMessage("Missing field(s): message.text");
            object = statusMessageB;
        } else if (message.getTimestamp() == null) {
            statusMessageB.setMessage("Missing field(s): message.timestamp");
            object = statusMessageB;

        }

        return object;
    }

}
