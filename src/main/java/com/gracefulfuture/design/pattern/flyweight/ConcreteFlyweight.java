package com.gracefulfuture.design.pattern.flyweight;

public class ConcreteFlyweight implements Flyweight{
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnsharedFlyweight unsharedFlyweight) {
        System.out.println("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + unsharedFlyweight.getInfo());
    }

}
