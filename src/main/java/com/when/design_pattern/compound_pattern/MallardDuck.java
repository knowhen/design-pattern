package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  15:50
 * @Description: TODO:
 **/
public class MallardDuck implements Quack {
    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack, quack, quack!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
