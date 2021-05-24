package com.gracefulfuture.design.pattern.visitor;

/**
* @description      具体元素-纸
* @author           chenkun
* @create           2021/5/24 10:37
* @version          1.0
*/
public class Paper implements Material{
    @Override
    public String accept(Company company) {
        return company.create(this);
    }
}
