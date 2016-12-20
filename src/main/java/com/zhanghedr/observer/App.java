package com.zhanghedr.observer;

public class App {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber tom = new Subscriber("Tom");
        Subscriber brian = new Subscriber("Brian");
        Subscriber travis = new Subscriber("Travis");
        Subscriber howard = new Subscriber("Howard");
        publisher.register(tom);
        publisher.register(brian);
        publisher.register(travis);
        publisher.register(howard);

        publisher.setMessage("Message 1");
        publisher.notifyObservers(publisher);

        System.out.println("-----------------------");

        publisher.setMessage("Message 2");
        publisher.notifyObservers(publisher);

        System.out.println("-----------------------");

        publisher.unregister(brian);
        publisher.setMessage("Message 3");
        publisher.notifyObservers(publisher);
    }

}
