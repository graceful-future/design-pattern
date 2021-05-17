package com.gracefulfuture.design.pattern.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }
}
