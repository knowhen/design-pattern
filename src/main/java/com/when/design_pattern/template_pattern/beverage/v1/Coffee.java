package com.when.design_pattern.template_pattern.beverage.v1;

/**
 * @author: when
 * @create: 2019-06-06  11:42
 * @Description: TODO:
 **/
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping the Coffee through filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk.");
    }
}
