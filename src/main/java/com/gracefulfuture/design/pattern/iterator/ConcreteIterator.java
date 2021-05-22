package com.gracefulfuture.design.pattern.iterator;

import java.util.List;

/**
* @description      具体迭代器类
* @author           chenkun
* @create           2021/5/22 17:39
* @version          1.0
*/
public class ConcreteIterator implements Iterator{
    private List<Object> list = null;

    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if(hasNext()){
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(index < list.size() - 1){
            return true;
        }else{
            return false;
        }
    }
}
