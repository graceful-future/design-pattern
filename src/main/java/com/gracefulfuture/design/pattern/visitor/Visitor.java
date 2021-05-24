package com.gracefulfuture.design.pattern.visitor;

/**
* @description      抽象访问者角色
* @author           chenkun
* @create           2021/5/24 9:50
* @version          1.0
*/
public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}
