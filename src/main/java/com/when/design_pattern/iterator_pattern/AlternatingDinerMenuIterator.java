package com.when.design_pattern.iterator_pattern;

import java.util.Calendar;
import java.util.Iterator;

/**
 * @author: when
 * @create: 2019-06-11  17:19
 * @Description: TODO:
 **/
public class AlternatingDinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        if (position > menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 2;
        return menuItem;
    }


}
