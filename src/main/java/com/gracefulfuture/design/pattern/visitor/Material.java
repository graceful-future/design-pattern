package com.gracefulfuture.design.pattern.visitor;

/**
 * @author chenkun
 * @version 1.0
 * @description 抽象元素-材料
 * @create 2021/5/24 10:33
 */
public interface Material {
    String accept(Company company);
}
