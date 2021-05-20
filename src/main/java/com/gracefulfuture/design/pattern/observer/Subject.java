package com.gracefulfuture.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        this.observers.add(observer);
    }

    public void remove(Observer observer){
        this.observers.remove(observer);
    }

    public abstract void notifyObservers();
}
