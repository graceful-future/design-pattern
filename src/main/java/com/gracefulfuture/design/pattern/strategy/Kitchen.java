package com.gracefulfuture.design.pattern.strategy;

//环境类：厨房
class Kitchen {
    private CrabCooking strategy;    //抽象策略
    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }
    public CrabCooking getStrategy() {
        return strategy;
    }
    public void cookingMethod() {
        strategy.cookingMethod();    //做菜
    }
}
