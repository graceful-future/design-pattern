package com.gracefulfuture.design.pattern.mediator;

public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague);

}
