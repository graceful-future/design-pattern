package com.gracefulfuture.design.pattern.abstractfactory;

public class BiJieFarm implements Farm{
    @Override
    public Animal createAnimal() {
        return new Horse();
    }

    @Override
    public Plant createPlan() {
        return new Fruit();
    }
}
