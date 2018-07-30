package com.greenfoxacademy.p2papp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
public class Message {

    @Id
    private Long id;
    private String username;
    private String text;
    private Timestamp timestamp;

    public Message() {
  //      this.timestamp = new Timestamp(System.currentTimeMillis());
        Instant instant = Instant.now();
        this.timestamp = java.sql.Timestamp.from(instant);
        this.id = (long)(Math.random() * 9999999 + 1000000);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
