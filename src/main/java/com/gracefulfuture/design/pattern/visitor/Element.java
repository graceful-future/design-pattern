package com.gracefulfuture.design.pattern.visitor;

/**
 * @author chenkun
 * @version 1.0
 * @description 抽象元素角色
 * @create 2021/5/24 9:52
 */
public interface Element {
    void accept(Visitor visitor);
}
