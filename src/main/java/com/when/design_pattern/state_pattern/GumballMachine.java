package com.when.design_pattern.state_pattern;

/**
 * @author: when
 * @create: 2019-06-12  15:53
 * @Description: TODO:
 **/
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int gumballNumber = 0;

    public GumballMachine(int gumballNumber) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.gumballNumber = gumballNumber;
        if (gumballNumber > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (gumballNumber != 0) {
            gumballNumber -= 1;
        }
    }

    public void refill(int gumballNumber) {
        this.gumballNumber = gumballNumber;
        this.state = noQuarterState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getGumballNumber() {
        return gumballNumber;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state.getClass().getSimpleName() +
                ", gumballNumber=" + gumballNumber +
                '}';
    }
}
