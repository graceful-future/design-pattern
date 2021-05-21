package com.gracefulfuture.design.pattern.mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send();

    public abstract void receive();
}
