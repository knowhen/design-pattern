package com.when.design_pattern.iterator_pattern;

import java.util.Iterator;

/**
 * @author: when
 * @create: 2019-06-11  15:48
 * @Description: TODO:
 **/
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the day", "Soup with a side of potato salad", false, 3.29);
        addItem("Hot dog", "Hot dog with relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full! Can't add item.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator iterator() {
        return new DinerMenuIterator(menuItems);
    }
}
