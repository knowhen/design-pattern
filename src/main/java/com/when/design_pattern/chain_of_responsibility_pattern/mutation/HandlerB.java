package com.when.design_pattern.chain_of_responsibility_pattern.mutation;

/**
 * @author: when
 * @create: 2020-03-25  10:06
 **/
public class HandlerB extends Handler {
    @Override
    protected void doHandle() {
        System.out.println("B handler do handle.");
    }
}
