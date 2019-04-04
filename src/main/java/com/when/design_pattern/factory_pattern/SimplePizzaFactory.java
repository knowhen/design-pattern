package com.when.design_pattern.factory_pattern;

/**
 * @author: when
 * @create: 2019-03-14  10:10
 **/
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
