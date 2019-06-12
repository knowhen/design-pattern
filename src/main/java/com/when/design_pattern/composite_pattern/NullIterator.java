package com.when.design_pattern.composite_pattern;

import java.util.Iterator;

/**
 * @author: when
 * @create: 2019-06-12  11:32
 * @Description: TODO:
 **/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
