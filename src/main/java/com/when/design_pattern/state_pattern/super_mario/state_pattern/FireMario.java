package com.when.design_pattern.state_pattern.super_mario.state_pattern;

/**
 * @author: when
 * @create: 2020-03-30  19:26
 **/
public class FireMario implements Mario {
    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
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
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
