package com.when.design_pattern.state_pattern.super_mario.state_pattern;

/**
 * @author: when
 * @create: 2020-03-30  19:19
 **/
public class MarioStateMachine {
    private int score;
    private Mario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Mario getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Mario currentState) {
        this.currentState = currentState;
    }

    public void obtainMushroom() {
        this.currentState.obtainMushroom();
    }

    public void obtainCape() {
        this.currentState.obtainCape();
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }

    public void meetMonster() {
        this.currentState.meetMonster();
    }
}
