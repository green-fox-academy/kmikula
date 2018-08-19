package com.greenfoxacademy.resttest.models;

//@Component
public class ErrorMessage {

    String error;

    public ErrorMessage() {
    }

    public ErrorMessage(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public ErrorMessage setError(String error) {
        this.error = error;
        return null;
    }
}
