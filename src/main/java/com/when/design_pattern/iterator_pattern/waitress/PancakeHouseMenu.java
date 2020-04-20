package com.when.design_pattern.iterator_pattern.waitress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: when
 * @create: 2019-06-11  15:48
 * @Description: TODO:
 **/
public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fired eggs and sausage", false, 2.99);
        addItem("Blueberry Pancake Breakfast", "Pancakes made with fresh blueberries", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator iterator() {
        return menuItems.iterator();
    }
}
