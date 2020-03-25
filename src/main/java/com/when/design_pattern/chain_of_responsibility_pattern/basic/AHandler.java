package com.when.design_pattern.chain_of_responsibility_pattern.basic;

/**
 * @author: when
 * @create: 2020-03-25  10:05
 **/
public class AHandler extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("A handler do handle failed.");
        return handled;
    }
}
