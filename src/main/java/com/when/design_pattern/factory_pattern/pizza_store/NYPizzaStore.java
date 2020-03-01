package com.when.design_pattern.factory_pattern.pizza_store;

/**
 * @author: when
 * @create: 2019-03-15  16:06
 **/
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("NYStyleCheesePizza")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
