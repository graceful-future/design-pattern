package com.gracefulfuture.design.pattern.builder;

public class ConcretBuilder extends Builder{
    @Override
    void buildPartA() {
        product.setPartA("构建PartA");
    }

    @Override
    void buildPartB() {
        product.setPartB("构建PartB");
    }

    @Override
    void buildPartC() {
        product.setPartC("构建PartC");
    }
}
