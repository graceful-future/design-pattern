package com.gracefulfuture.design.pattern.abstractfactory;

public class Vegetable implements Plant{
    @Override
    public void show() {
        System.out.println("新鲜的蔬菜");
    }
}
