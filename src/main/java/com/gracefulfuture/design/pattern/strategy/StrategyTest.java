package com.gracefulfuture.design.pattern.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        context.strategyMethod();
    }
}
