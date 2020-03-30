package com.when.design_pattern.state_pattern.gumball_machine;

/**
 * @author: when
 * @create: 2019-06-12  16:31
 * @Description: TODO:
 **/
public class SoldState implements State {
    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
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
        machine.releaseBall();
        if (machine.getGumballNumber() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            System.out.println("Oop, out of gumballs");
            machine.setState(machine.getSoldOutState());
        }

    }
}
