package com.when.design_pattern.iterator_pattern;

import java.util.Iterator;
import java.util.List;

/**
 * @author: when
 * @create: 2019-06-11  16:21
 * @Description: TODO:
 **/
public class PancakeMenuIterator implements Iterator {
    private List<MenuItem> menuItems;

    public PancakeMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > 0;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(0);
        menuItems.remove(0);
        return menuItem;
    }
}
