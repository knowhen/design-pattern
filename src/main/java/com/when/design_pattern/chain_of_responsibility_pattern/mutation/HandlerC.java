package com.when.design_pattern.chain_of_responsibility_pattern.mutation;

/**
 * @author: when
 * @create: 2020-03-25  10:23
 **/
public class HandlerC extends Handler {
    @Override
    protected void doHandle() {
        System.out.println("C handler do handle.");
    }
}
