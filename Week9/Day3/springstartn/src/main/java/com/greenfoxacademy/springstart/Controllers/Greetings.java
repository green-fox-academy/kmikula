package com.greenfoxacademy.springstart.Controllers;

public class Greetings {
    private long id;
    private String content;


    public Greetings() {

    }

    public Greetings(long id, String content) {
        this.id = id;
        this.content = content;
    }


    public  long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
