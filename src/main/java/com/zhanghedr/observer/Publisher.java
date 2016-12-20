package com.zhanghedr.observer;

public class Publisher extends Observable {

    private String message;

    public Publisher() {
        super();
    }

    public Publisher(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
