package com.greenfoxacademy.p2papp.services;

import com.greenfoxacademy.p2papp.models.Message;
import org.springframework.stereotype.Service;

@Service
public interface StatusService {

   Object checkReceived(Message message);
}
