package com.when.design_pattern.template_pattern.beverage.v1;

/**
 * @author: when
 * @create: 2019-06-06  11:41
 * @Description: TODO:
 **/
public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water.");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    abstract void brew();

    abstract void addCondiments();
}
