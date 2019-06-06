package com.when.design_pattern.adapter_pattern;

/**
 * @author: when
 * @create: 2019-06-05  15:13
 * @Description: TODO:
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble, gobble...");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance.");
    }
}
