package com.when.design_pattern.factory_pattern.pizza_store;

/**
 * @author: when
 * @create: 2019-03-14  10:40
 **/
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
