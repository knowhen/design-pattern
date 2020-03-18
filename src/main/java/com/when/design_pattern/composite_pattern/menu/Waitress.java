package com.when.design_pattern.composite_pattern.menu;

import java.util.Iterator;

/**
 * @author: when
 * @create: 2019-06-12  10:13
 * @Description: TODO:
 **/
public class Waitress {
    private MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void print() {
        allMenu.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenu.createIterator();
        System.out.println("------VEGETARIAN MENU------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}
