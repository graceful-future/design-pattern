package com.gracefulfuture.design.pattern.abstractfactory;

public class Fruit implements Plant{
    @Override
    public void show() {
        System.out.println("种类丰富的水果");
    }
}
