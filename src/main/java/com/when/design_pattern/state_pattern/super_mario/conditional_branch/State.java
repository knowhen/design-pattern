package com.when.design_pattern.state_pattern.super_mario.conditional_branch;

public enum State {
    SMALL(0), SUPER(1), FIRE(2), CAPE(3);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
