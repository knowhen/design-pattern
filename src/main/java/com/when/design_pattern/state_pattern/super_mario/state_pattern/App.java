package com.when.design_pattern.state_pattern.super_mario.state_pattern;

/**
 * @author: when
 * @create: 2020-03-30  19:34
 **/
public class App {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushroom();
        int score = mario.getScore();
        Mario currentState = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + currentState.getName());
    }
}
