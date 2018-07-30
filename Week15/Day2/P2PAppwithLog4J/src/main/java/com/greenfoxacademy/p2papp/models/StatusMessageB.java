package com.greenfoxacademy.p2papp.models;

public class StatusMessageB {
    private String status;
    private String message;

    public StatusMessageB() {
        this.status = "error";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
