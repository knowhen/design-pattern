package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  16:02
 * @Description: TODO:
 **/
public class QuackCounter implements Quack {
    private Quack duck;
    private static int quackCount;

    public QuackCounter(Quack duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public static int getQuackCount() {
        return quackCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
