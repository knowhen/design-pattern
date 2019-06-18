package com.when.design_pattern.state_pattern;

/**
 * @author: when
 * @create: 2019-06-12  15:40
 * @Description: TODO:
 **/
public class App {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(20);
        System.out.println(machine);

        buyGumballs(15, machine);
    }

    private static void buyGumballs(int n, GumballMachine machine) {
        for (int i = 0; i < n; i++) {
            machine.insertQuarter();
            machine.turnCrank();
            System.out.println(machine);
        }
    }
}
