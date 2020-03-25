package com.when.design_pattern.chain_of_responsibility_pattern.mutation;

/**
 * @author: when
 * @create: 2020-03-25  10:16
 **/
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        doHandle();
        if (successor != null) {
            successor.handle();
        }
    }

    protected abstract void doHandle();
}
