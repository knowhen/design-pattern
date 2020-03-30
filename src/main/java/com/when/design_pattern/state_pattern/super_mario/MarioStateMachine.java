package com.when.design_pattern.state_pattern.super_mario;

/**
 * @author: when
 * @create: 2020-03-30  16:52
 **/
public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        currentState = State.SMALL;
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void obtainMushroom() {
        System.out.println("Obtain mushroom");
        if (currentState.equals(State.SMALL)) {
            this.currentState = State.SUPER;
            this.score += 100;
        }
    }

    public void obtainCape() {
        System.out.println("Obtain cape");
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.CAPE;
            this.score += 200;
        }
    }

    public void obtainFireFlower() {
        System.out.println("Obtain fire flower");
        this.currentState = State.FIRE;
        this.score += 300;
    }

    public void meetMonster() {
        System.out.println("Meet monster");
        if (currentState.equals(State.SUPER)) {
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }
        if (currentState.equals(State.CAPE)) {
            this.currentState = State.SMALL;
            this.score -= 200;
            return;
        }
        if (currentState.equals(State.FIRE)) {
            this.currentState = State.SMALL;
            this.score -= 300;
            return;
        }
    }
}
