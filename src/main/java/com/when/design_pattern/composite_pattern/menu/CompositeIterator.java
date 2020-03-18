package com.when.design_pattern.composite_pattern.menu;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author: when
 * @create: 2019-06-12  11:34
 * @Description: 组合迭代器实现了迭代器接口
 **/
public class CompositeIterator implements Iterator {
    // 用来存储需要遍历的顶层组合的迭代器
    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        // 查看堆栈中迭代器是否被清空
        if (stack.isEmpty()) {
            return false;
        } else {
            // 取出迭代器，并查看是否还有元素
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                // 迭代器中没有元素，将其弹出堆栈
                stack.pop();
                // 递归当前方法
                return hasNext();
            } else {
                return true;
            }
        }
    }

}
