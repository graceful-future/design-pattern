package com.gracefulfuture.design.pattern.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        FlowerFactory flowerFactory = new PeachFlowerFactory();
        Flower flower = flowerFactory.createFlower();
        flower.show();
    }
}
