package com.when.design_pattern.decorator_pattern;

/**
 * @author: when
 * @create: 2019-03-13  17:45
 **/
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
