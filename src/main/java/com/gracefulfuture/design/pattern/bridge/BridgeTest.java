package com.gracefulfuture.design.pattern.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Color color = new Yellow();
        LeatherBag leatherBag = new HandBag();
        leatherBag.setColor(color);
        String name = leatherBag.getName();
        System.out.println(name);
    }
}
