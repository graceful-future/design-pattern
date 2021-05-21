package com.gracefulfuture.design.pattern.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueA.send();
        colleagueB.send();
    }
}
