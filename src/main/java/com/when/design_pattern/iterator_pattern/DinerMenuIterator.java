package com.when.design_pattern.iterator_pattern;

import java.util.Iterator;

/**
 * @author: when
 * @create: 2019-06-11  16:14
 * @Description: TODO:
 **/
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }

    /**
     * Dinner menu 中使用了定长数组，删除元素时需要将其后面元素向前移动一位
     */
    @Override
    public void remove() {
        if (position <= 0) {
            throw new UnsupportedOperationException("You can't remove item until you've done at least one next()");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
