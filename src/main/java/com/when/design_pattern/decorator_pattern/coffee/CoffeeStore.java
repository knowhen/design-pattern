package com.when.design_pattern.decorator_pattern.coffee;

/**
 * @author: when
 * @create: 2019-03-13  17:53
 * Thinking: add small, middle, big size for coffee
 **/
public class CoffeeStore {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

    }
}
