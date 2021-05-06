package com.gracefulfuture.design.pattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new ConcretBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
