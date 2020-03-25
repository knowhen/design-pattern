package com.when.design_pattern.chain_of_responsibility_pattern.basic;

/**
 * @author: when
 * @create: 2020-03-25  10:19
 **/
public class CHandler extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("C handler do handle.");
        return handled;
    }
}
