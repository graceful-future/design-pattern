package com.gracefulfuture.design.pattern.interpreter;

/**
 * @author chenkun
 * @version 1.0
 * @description 抽象表达式
 * @create 2021/5/24 14:45
 */
public interface Expression {
    boolean interpret(String info);
}
