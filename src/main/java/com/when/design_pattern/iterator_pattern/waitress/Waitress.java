package com.when.design_pattern.iterator_pattern.waitress;

public interface Waitress {
    void printMenu();

    void printBreakfastMenu();

    void printLunchMenu();

    void printVegetarianMenu();

    boolean isItemVegetarian(String name);
}
