package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  17:49
 * @Description: TODO:
 **/
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist observed that: " + duck + " just quacked.");
    }

}
