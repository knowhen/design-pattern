package com.when.design_pattern.chain_of_responsibility_pattern.mutation;

/**
 * @author: when
 * @create: 2020-03-25  10:05
 **/
public class HandlerA extends Handler {
    @Override
    protected void doHandle() {
        System.out.println("A handler do handle.");
    }
}
