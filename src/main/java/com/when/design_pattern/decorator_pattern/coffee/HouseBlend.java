package com.when.design_pattern.decorator_pattern.coffee;

/**
 * @author: when
 * @create: 2019-03-13  17:44
 **/
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}
