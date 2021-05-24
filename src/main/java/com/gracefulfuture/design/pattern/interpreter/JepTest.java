package com.gracefulfuture.design.pattern.interpreter;


import org.nfunk.jep.JEP;

/**
* @description      Jep测试类
* @author           chenkun
* @create           2021/5/24 15:33
* @version          1.0
*/
public class JepTest {
    public static void main(String[] args) {
        JEP jep = new JEP();
        String expression = "principal*interestTRate*depositTerm";
        jep.addVariable("principal",10000);
        jep.addVariable("interestTRate",0.038);
        jep.addVariable("depositTerm",2);
        jep.parseExpression(expression);
        double interests = jep.getValue();
        System.out.println(interests);
    }
}
