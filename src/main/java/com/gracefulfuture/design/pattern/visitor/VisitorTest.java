package com.gracefulfuture.design.pattern.visitor;

/**
* @description      观察者模式测试类
* @author           chenkun
* @create           2021/5/24 10:07
* @version          1.0
*/
public class VisitorTest {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(elementA);
        objectStructure.add(elementB);
        objectStructure.accept(visitorA);
        System.out.println("---------------------");
        objectStructure.accept(visitorB);
    }
}
