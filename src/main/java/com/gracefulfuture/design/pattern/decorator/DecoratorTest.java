package com.gracefulfuture.design.pattern.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Morrigan original = new Original();
        original.display();
        Morrigan succubus = new Succubus(original);
        succubus.display();
        Morrigan girl = new Girl(original);
        girl.display();
    }
}
