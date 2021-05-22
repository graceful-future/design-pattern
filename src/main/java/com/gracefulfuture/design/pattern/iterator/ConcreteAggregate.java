package com.gracefulfuture.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
* @description      具体聚合类
* @author           chenkun
* @create           2021/5/22 17:44
* @version          1.0
*/
public class ConcreteAggregate implements Aggregate{
    private List<Object> list = new ArrayList<>();
    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
