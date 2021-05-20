package com.gracefulfuture.design.pattern.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        Subject subject = new ConcreteSubject();
        subject.add(observerA);
        subject.add(observerB);
        subject.notifyObservers();
    }
}
