package com.when.design_pattern.state_pattern;

/**
 * @author: when
 * @create: 2019-06-12  16:29
 * @Description: TODO:
 **/
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
