package com.when.design_pattern.decorator_pattern;

/**
 * @author: when
 * @create: 2019-03-13  17:43
 **/
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
