package com.zhanghedr.observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        if (name == null)
            throw new NullPointerException();
        this.name = name;
    }

    @Override
    public void update(Object o) {
        Publisher publisher = (Publisher) o;
        System.out.println(String.format("Subscriber %s consumes message: %s", name, publisher.getMessage()));
    }

}
