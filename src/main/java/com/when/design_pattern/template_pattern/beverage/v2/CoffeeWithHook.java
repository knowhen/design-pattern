package com.when.design_pattern.template_pattern.beverage.v2;

/**
 * @author: when
 * @create: 2019-06-06  11:55
 * @Description: TODO:
 **/
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping the Coffee through filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk.");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
