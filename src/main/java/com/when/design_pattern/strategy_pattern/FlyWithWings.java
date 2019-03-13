package com.when.design_pattern.strategy_pattern;

/**
 * @author: when
 * @create: 2019-03-11  18:02
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings.");
    }
}
