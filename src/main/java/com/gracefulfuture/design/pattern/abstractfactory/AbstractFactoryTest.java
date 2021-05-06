package com.gracefulfuture.design.pattern.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Farm farm = new BiJieFarm();
        Animal animal = farm.createAnimal();
        Plant plant = farm.createPlan();
        animal.show();
        plant.show();
    }
}
