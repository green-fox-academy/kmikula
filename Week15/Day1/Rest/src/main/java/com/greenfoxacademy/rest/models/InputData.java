package com.greenfoxacademy.rest.models;

public class InputData {

   private int received;
   private int result;

   String error;

    public InputData() {
    }

    public InputData(int received, int result) {
        this.received = received;
        this.result = result;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }



}
