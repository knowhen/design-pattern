package com.when.design_pattern.state_pattern.super_mario.state_pattern;

/**
 * @author: when
 * @create: 2020-03-30  19:25
 **/
public class CapeMario implements Mario {
    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushroom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {
        System.out.println(getName() + " meet monster.");
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 200);
    }
}
