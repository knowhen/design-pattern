package com.when.design_pattern.iterator_pattern.waitress;

import java.util.Iterator;
import java.util.List;

/**
 * @author: when
 * @create: 2019-06-11  16:07
 * @Description: TODO:
 **/
public class WaitressAlice implements Waitress {
    private List<Menu> menus;

    public WaitressAlice(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public void printMenu() {
        Iterator iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            printIterator(menu.iterator());
        }
    }

    private void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public void printBreakfastMenu() {

    }

    @Override
    public void printLunchMenu() {

    }

    @Override
    public void printVegetarianMenu() {

    }

    @Override
    public boolean isItemVegetarian(String name) {
        return false;
    }
}
