package com.gracefulfuture.design.pattern.command;

public class CompositeCommandTest {
    public static void main(String[] args) {
        Command commandB = new ConcreteCommandB();
        Command commandC = new ConcreteCommandC();
        CompositeInvoker invoker = new CompositeInvoker();
        invoker.add(commandB);
        invoker.add(commandC);
        invoker.execute();
    }
}
