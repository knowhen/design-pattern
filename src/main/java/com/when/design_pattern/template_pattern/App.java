package com.when.design_pattern.template_pattern;

import com.when.design_pattern.template_pattern.beverage.v1.CaffeineBeverage;
import com.when.design_pattern.template_pattern.beverage.v1.Coffee;
import com.when.design_pattern.template_pattern.beverage.v2.CaffeineBeverageWithHook;
import com.when.design_pattern.template_pattern.beverage.v2.CoffeeWithHook;

/**
 * @author: when
 * @create: 2019-06-06  11:52
 * @Description: TODO:
 **/
public class App {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();

        CaffeineBeverageWithHook caffeineBeverage = new CoffeeWithHook();
        caffeineBeverage.prepareRecipe();
    }
}
