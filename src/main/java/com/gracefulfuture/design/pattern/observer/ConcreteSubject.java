package com.gracefulfuture.design.pattern.observer;

public class ConcreteSubject extends Subject{
    @Override
    public void notifyObservers() {
        System.out.println("具体目标发生改变...");
        System.out.println("---------------------");
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
