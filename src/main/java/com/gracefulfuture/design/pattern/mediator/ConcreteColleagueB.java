package com.gracefulfuture.design.pattern.mediator;

public class ConcreteColleagueB extends Colleague{
    @Override
    public void send() {
        System.out.println("具体同事类B发出请求");
        this.mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类B收到请求");
    }
}
