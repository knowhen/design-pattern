package com.when.design_pattern.factory_pattern.pizza_store;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2019-03-14  10:11
 **/
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String s : toppings) {
            System.out.println("  " + s);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into digital slices");
    }

    void box() {
        System.out.println("Place pizza into official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
