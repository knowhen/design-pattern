package com.when.design_pattern.iterator_pattern.iterator;

public interface IteratorV1<E> {
    boolean hasNext();

    void next();

    E currentElement();
}
