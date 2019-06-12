package com.when.design_pattern.iterator_pattern;

public interface Waitress {
    void printMenu();

    void printBreakfastMenu();

    void printLunchMenu();

    void printVegetarianMenu();

    boolean isItemVegetarian(String name);
}
