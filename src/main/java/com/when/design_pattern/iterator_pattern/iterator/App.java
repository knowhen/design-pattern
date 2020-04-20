package com.when.design_pattern.iterator_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: when
 * @create: 2020-04-03  15:45
 **/
public class App {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Iterator<String> iterator = strings.iterator();
        iterator.next();
        strings.remove("one");
    }
}
