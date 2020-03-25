package com.when.design_pattern.chain_of_responsibility_pattern.basic;

/**
 * @author: when
 * @create: 2020-03-25  10:03
 **/
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
