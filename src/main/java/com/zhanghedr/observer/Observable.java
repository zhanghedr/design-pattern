package com.zhanghedr.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    protected List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

    public void register(Observer obs) {
        if (obs == null)
            throw new NullPointerException();
        if (!observers.contains(obs))
            observers.add(obs);
    }

    public void unregister(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObservers(Object o) {
        for (Observer obs : observers)
            obs.update(o);
    }

}
