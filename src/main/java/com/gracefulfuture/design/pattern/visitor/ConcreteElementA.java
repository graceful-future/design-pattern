package com.gracefulfuture.design.pattern.visitor;

/**
* @description      具体元素角色A
* @author           chenkun
* @create           2021/5/24 9:53
* @version          1.0
*/
public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operation(){
        return "具体元素角色A的业务操作";
    }
}
