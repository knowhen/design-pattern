package com.when.design_pattern.state_pattern.super_mario.state_pattern;

/**
 * @author: when
 * @create: 2020-03-30  19:18
 **/
public class SmallMario implements Mario {
    private MarioStateMachine stateMachine;

    public SmallMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushroom() {
        System.out.println("Obtain mushroom.");
        stateMachine.setCurrentState(new SuperMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        System.out.println(getName() + " meet monster.");
        // do nothing
    }
}
