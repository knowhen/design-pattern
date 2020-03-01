package com.when.design_pattern.factory_pattern.pizza_store;

/**
 * @author: when
 * @create: 2019-03-15  16:16
 **/
public class App {
    public static void main(String[] args) {
        PizzaStore nyPizzaStory = new NYPizzaStore();
        nyPizzaStory.orderPizza("NYStyleCheesePizza");
    }
}
