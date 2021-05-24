package com.gracefulfuture.design.pattern.interpreter;

/**
* @description      解释器模式测试类
* @author           chenkun
* @create           2021/5/24 15:13
* @version          1.0
*/
public class InterpreterTest {
    public static void main(String[] args) {
        InterpreterContext interpreterContext = new InterpreterContext();
        interpreterContext.freeRide("韶关的老人");
        interpreterContext.freeRide("韶关的年轻人");
        interpreterContext.freeRide("广州的妇女");
        interpreterContext.freeRide("广州的儿童");
        interpreterContext.freeRide("山东的儿童");
    }
}
