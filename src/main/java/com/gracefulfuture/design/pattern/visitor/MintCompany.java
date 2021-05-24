package com.gracefulfuture.design.pattern.visitor;

/**
* @description      具体访问者-造币公司
* @author           chenkun
* @create           2021/5/24 10:40
* @version          1.0
*/
public class MintCompany implements Company{
    @Override
    public String create(Cuprum cuprum) {
        return "cuprumCoin";
    }

    @Override
    public String create(Paper paper) {
        return "banknote";
    }
}
