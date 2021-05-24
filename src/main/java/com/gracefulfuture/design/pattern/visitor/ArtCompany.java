package com.gracefulfuture.design.pattern.visitor;

/**
* @description      具体访问者-艺术公司
* @author           chenkun
* @create           2021/5/24 10:39
* @version          1.0
*/
public class ArtCompany implements Company{
    @Override
    public String create(Cuprum cuprum) {
        return "zhuxi";
    }

    @Override
    public String create(Paper paper) {
        return "lecture";
    }
}
