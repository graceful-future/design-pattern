package com.gracefulfuture.design.pattern.abstractfactory;

public class GuiYangFarm implements Farm{
    @Override
    public Animal createAnimal() {
        return new Cattle();
    }

    @Override
    public Plant createPlan() {
        return new Vegetable();
    }
}
