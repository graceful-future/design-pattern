package com.gracefulfuture.design.pattern.visitor;

/**
 * @author chenkun
 * @version 1.0
 * @description 抽象访问者-公司
 * @create 2021/5/24 10:32
 */
public interface Company {
    String create(Cuprum cuprum);

    String create(Paper paper);
}
