package com.when.design_pattern.strategy_pattern.duck;

/**
 * @author: when
 * @create: 2019-03-11  18:03
 **/
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket.");
    }
}
