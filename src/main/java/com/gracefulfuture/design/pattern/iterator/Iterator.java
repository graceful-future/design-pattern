package com.gracefulfuture.design.pattern.iterator;

/**
 * @author chenkun
 * @version 1.0
 * @description 迭代器接口
 * @create 2021/5/22 17:36
 */
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
