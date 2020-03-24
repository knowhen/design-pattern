package com.when.design_pattern.strategy_pattern.duck;

/**
 * @author: when
 * @create: 2019-03-12  08:32
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
