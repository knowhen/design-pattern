package com.when.design_pattern.strategy_pattern;

/**
 * @author: when
 * @create: 2019-03-12  08:39
 **/
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
