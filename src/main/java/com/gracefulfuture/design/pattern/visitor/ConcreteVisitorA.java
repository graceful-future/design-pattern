package com.gracefulfuture.design.pattern.visitor;

/**
* @description      具体访问者角色A
* @author           chenkun
* @create           2021/5/24 9:57
* @version          1.0
*/
public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者A访问->" + elementA.operation());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者A访问->" + elementB.operation());
    }
}
