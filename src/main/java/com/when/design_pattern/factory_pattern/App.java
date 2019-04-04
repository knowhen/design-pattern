package com.when.design_pattern.factory_pattern;

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
