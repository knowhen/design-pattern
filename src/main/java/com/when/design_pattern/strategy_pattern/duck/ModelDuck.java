package com.when.design_pattern.strategy_pattern.duck;

/**
 * @author: when
 * @create: 2019-03-12  08:43
 **/
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
