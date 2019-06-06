package com.when.design_pattern.template_pattern.beverage.v2;

/**
 * @author: when
 * @create: 2019-06-06  11:53
 * @Description: TODO:
 **/
public abstract class CaffeineBeverageWithHook {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water.");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();
}
