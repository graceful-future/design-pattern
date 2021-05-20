package com.gracefulfuture.design.pattern.observer;

public class ConcreteObserverA implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者A作出反应");
    }
}
