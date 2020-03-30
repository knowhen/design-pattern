package com.when.design_pattern.state_pattern.super_mario.state_pattern;

/**
 * @author: when
 * @create: 2020-03-30  19:22
 **/
public class SuperMario implements Mario {
    private MarioStateMachine stateMachine;

    public SuperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushroom() {

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
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
