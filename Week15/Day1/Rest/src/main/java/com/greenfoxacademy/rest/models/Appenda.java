package com.greenfoxacademy.rest.models;

public class Appenda {

    private String appendable;
    private String appended;

    public Appenda() {
    }

    public Appenda(String appendable, String appended) {
        this.appendable = appendable;
        this.appended = appended;
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
