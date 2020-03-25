package com.when.design_pattern.chain_of_responsibility_pattern.basic;

/**
 * @author: when
 * @create: 2020-03-25  10:06
 **/
public class BHandler extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = true;
        System.out.println("B handler do handle success.");
        return handled;
    }
}
