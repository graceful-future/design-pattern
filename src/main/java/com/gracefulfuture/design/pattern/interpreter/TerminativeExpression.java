package com.gracefulfuture.design.pattern.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
* @description      终结符表达式类
* @author           chenkun
* @create           2021/5/24 14:51
* @version          1.0
*/
public class TerminativeExpression implements Expression{
    private Set<String> set =  new HashSet<>();

    public TerminativeExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {
        if(set.contains(info)){
            return true;
        }else{
            return false;
        }
    }
}
