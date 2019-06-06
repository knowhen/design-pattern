package com.when.design_pattern.template_pattern.beverage.v1;

/**
 * @author: when
 * @create: 2019-06-06  11:42
 * @Description: TODO:
 **/
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon.");
    }
}
