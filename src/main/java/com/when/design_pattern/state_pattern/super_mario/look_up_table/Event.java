package com.when.design_pattern.state_pattern.super_mario.look_up_table;

public enum Event {
    GOT_MUSHROOM(0), GOT_CAPE(1), GOT_FIRE(2), MET_MONSTER(3);
    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
