package com.gracefulfuture.design.pattern.strategy;

public class Context {
    private Strategy strategy;


    public void strategyMethod(){
        strategy.strategyMethod();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
