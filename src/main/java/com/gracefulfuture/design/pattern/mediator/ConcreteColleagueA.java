package com.gracefulfuture.design.pattern.mediator;

public class ConcreteColleagueA extends Colleague{
    @Override
    public void send() {
        System.out.println("具体同事类A发出请求");
        this.mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类A收到请求");
    }
}
