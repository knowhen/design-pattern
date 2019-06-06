package com.when.design_pattern.template_pattern.duck;

import java.util.Arrays;

/**
 * @author: when
 * @create: 2019-06-06  15:16
 * @Description: TODO:
 **/
public class DuckSort {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("duck 1", 5),
                new Duck("duck 2", 4),
                new Duck("duck 3", 3),
                new Duck("duck 4", 2),
                new Duck("duck 5", 1)};
        System.out.println("Before sorting:");
        display(ducks);
        System.out.println("\nAfter sorting:");
        Arrays.sort(ducks);
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
