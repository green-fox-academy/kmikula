package com.greenfoxacademy.programmerfoxclub.models;

public class Trick {

    private String trick;

    public Trick(String trick) {
        this.trick = trick;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    @Override
    public String toString() {
        return this.trick;
    }
}
