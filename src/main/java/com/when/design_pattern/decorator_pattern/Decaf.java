package com.when.design_pattern.decorator_pattern;

/**
 * @author: when
 * @create: 2019-03-13  17:45
 **/
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
