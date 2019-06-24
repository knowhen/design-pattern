package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  15:21
 * @Description: TODO:
 **/
public class App {
    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate(duckFactory);
    }
}
