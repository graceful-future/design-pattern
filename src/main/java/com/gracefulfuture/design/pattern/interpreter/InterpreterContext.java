package com.gracefulfuture.design.pattern.interpreter;

/**
* @description      解释器环境类
* @author           chenkun
* @create           2021/5/24 15:04
* @version          1.0
*/
public class InterpreterContext {
    private String[] citys = {"韶关","广州"};
    private String[] persons = {"老人","妇女","儿童"};
    private Expression expression;

    public InterpreterContext() {
        Expression city = new TerminativeExpression(citys);
        Expression person = new TerminativeExpression(persons);
        this.expression = new NonterminativeExpression(city,person);
    }

    public void freeRide(String info){
        boolean success = expression.interpret(info);
        if(success){
            System.out.println("您是" + info + ",本次乘车免费");
        }else{
            System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
        }
    }
}
