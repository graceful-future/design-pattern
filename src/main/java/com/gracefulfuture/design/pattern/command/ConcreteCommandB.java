package com.gracefulfuture.design.pattern.command;

public class ConcreteCommandB extends Command{
    private CompositeReceiver receiver;

    public ConcreteCommandB() {
        this.receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        this.receiver.action1();
    }
}
