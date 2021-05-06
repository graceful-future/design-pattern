package com.gracefulfuture.design.pattern.factorymethod;

public class PeachFlowerFactory implements FlowerFactory{
    @Override
    public Flower createFlower() {
        return new PeachFlower();
    }
}
