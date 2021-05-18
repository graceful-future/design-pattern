package com.gracefulfuture.design.pattern.command;

public class ConcreteCommandC extends Command{
    private CompositeReceiver receiver;

    public ConcreteCommandC() {
        this.receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        this.receiver.action2();
    }
}
