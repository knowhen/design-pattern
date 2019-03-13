package com.when.design_pattern.strategy_pattern;

/**
 * @author: when
 * @create: 2019-03-12  08:48
 **/
public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        this.quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
