package com.when.design_pattern.iterator_pattern.iterator;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @author: when
 * @create: 2020-04-03  15:58
 **/
public class LinkedListIterator<E> implements IteratorV2<E> {
    private int cursor;
    private LinkedList<E> linkedList;

    public LinkedListIterator(LinkedList<E> linkedList) {
        this.cursor = 0;
        this.linkedList = linkedList;
    }

    @Override
    public boolean hasNext() {
        return cursor != linkedList.size();
    }

    @Override
    public E next() {
        if (cursor >= linkedList.size()) {
            throw new NoSuchElementException();
        }
        E element = linkedList.get(cursor);
        cursor++;
        return element;
    }
}
