package com.gracefulfuture.design.pattern.interpreter;

/**
* @description      非终结符表达式类
* @author           chenkun
* @create           2021/5/24 14:56
* @version          1.0
*/
public class NonterminativeExpression implements Expression{
    private Expression city;
    private Expression person;

    public NonterminativeExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] arr = info.split("的");
        return city.interpret(arr[0]) && person.interpret(arr[1]);
    }
}
