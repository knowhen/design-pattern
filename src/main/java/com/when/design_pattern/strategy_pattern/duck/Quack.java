package com.when.design_pattern.strategy_pattern.duck;

/**
 * @author: when
 * @create: 2019-03-12  08:31
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
