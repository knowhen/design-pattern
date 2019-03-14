package com.when.design_pattern.decorator_pattern;

/**
 * @author: when
 * @create: 2019-03-13  17:33
 **/
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
