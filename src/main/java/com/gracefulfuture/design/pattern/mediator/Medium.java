package com.gracefulfuture.design.pattern.mediator;

public abstract class Medium {
    public abstract void register(Customer customer);

    public abstract void relay(String from,String advertisement);
}
