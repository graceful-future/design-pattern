package com.gracefulfuture.design.pattern.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a1 = flyweightFactory.getFlyweight("a");
        Flyweight a2 = flyweightFactory.getFlyweight("a");
        Flyweight b1 = flyweightFactory.getFlyweight("b");
        Flyweight b2 = flyweightFactory.getFlyweight("b");
        a1.operation(new UnsharedFlyweight("a"));
        b1.operation(new UnsharedFlyweight("b"));
        System.out.println(a1 == a2);
        System.out.println(b1 == b2);
    }
}
