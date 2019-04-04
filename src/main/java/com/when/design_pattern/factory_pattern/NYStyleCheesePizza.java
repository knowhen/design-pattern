package com.when.design_pattern.factory_pattern;

/**
 * @author: when
 * @create: 2019-03-15  15:41
 **/
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }


}
