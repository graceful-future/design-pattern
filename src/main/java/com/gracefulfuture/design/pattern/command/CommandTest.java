package com.gracefulfuture.design.pattern.command;

public class CommandTest {
    public static void main(String[] args) {
        Command command = new ConcreteCommandA();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
