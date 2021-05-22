package com.gracefulfuture.design.pattern.iterator;

/**
 * @author chenkun
 * @version 1.0
 * @description 聚合类接口
 * @create 2021/5/22 17:35
 */
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator getIterator();
}
