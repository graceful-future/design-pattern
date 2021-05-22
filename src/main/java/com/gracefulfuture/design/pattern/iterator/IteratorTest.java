package com.gracefulfuture.design.pattern.iterator;

/**
* @description      迭代器模式测试
* @author           chenkun
* @create           2021/5/22 17:48
* @version          1.0
*/
public class IteratorTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("贵州大学");
        aggregate.add("贵州师范大学");
        aggregate.add("贵州财经大学");
        aggregate.add("贵州医科大学");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        Object first = iterator.first();
        System.out.println("first：\n" + first);
    }
}
