package com.gracefulfuture.design.pattern.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Product product = SimpleFactory.generateProduct(1);
        System.out.println(product.getProductDate());
    }
}

