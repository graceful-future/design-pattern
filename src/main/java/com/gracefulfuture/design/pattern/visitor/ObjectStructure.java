package com.gracefulfuture.design.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* @description      对象结构角色
* @author           chenkun
* @create           2021/5/24 10:03
* @version          1.0
*/
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator iterator = elements.iterator();
        while(iterator.hasNext()){
            Element element = (Element) iterator.next();
            element.accept(visitor);
        }
    }

    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }

}
