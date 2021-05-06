package com.gracefulfuture.design.pattern.factorymethod;

public class RoseFlowerFactory implements FlowerFactory{
    @Override
    public Flower createFlower() {
        return new RoseFlower();
    }
}
