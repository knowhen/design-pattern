package com.when.design_pattern.state_pattern.super_mario.look_up_table;

import com.when.design_pattern.state_pattern.super_mario.conditional_branch.State;

import static com.when.design_pattern.state_pattern.super_mario.conditional_branch.State.*;

/**
 * @author: when
 * @create: 2020-03-30  19:06
 **/
public class MarioStateMachine {
    private int score;
    private State currentState;

    private static final State[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
    };

    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SMALL;
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void obtainMushroom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    public void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score = actionTable[stateValue][eventValue];
    }
}
