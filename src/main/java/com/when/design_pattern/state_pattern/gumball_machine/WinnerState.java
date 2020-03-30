package com.when.design_pattern.state_pattern.gumball_machine;

/**
 * @author: when
 * @create: 2019-06-14  08:39
 * @Description: TODO:
 **/
public class WinnerState implements State {
    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't giving you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("Your are a winner! You get two gumballs for your quarter");
        machine.releaseBall();
        if (machine.getGumballNumber() == 0) {
            machine.setState(machine.getSoldOutState());
        } else {
            machine.releaseBall();
            if (machine.getGumballNumber() > 0) {
                machine.setState(machine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs");
                machine.setState(machine.getSoldOutState());
            }
        }
    }
}
