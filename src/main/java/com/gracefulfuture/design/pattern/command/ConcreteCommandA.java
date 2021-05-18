package com.gracefulfuture.design.pattern.command;

public class ConcreteCommandA extends Command{
    private Receiver receiver;

    public ConcreteCommandA() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
