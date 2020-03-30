package com.when.design_pattern.state_pattern.super_mario.state_pattern;

public interface Mario {
    State getName();

    void obtainMushroom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
