package com.when.design_pattern.state_pattern.super_mario.look_up_table;

import com.when.design_pattern.state_pattern.super_mario.conditional_branch.State;

/**
 * @author: when
 * @create: 2020-03-30  19:04
 **/
public class App {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushroom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
