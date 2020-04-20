package com.when.design_pattern.iterator_pattern.iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author: when
 * @create: 2020-04-03  15:31
 **/
public class ArrayIterator<E> implements IteratorV1<E> {
    private int cursor;
    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor < arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentElement() {
        if (cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}
