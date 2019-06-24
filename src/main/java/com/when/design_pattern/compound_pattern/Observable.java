package com.when.design_pattern.compound_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: when
 * @create: 2019-06-19  17:08
 * @Description: TODO:
 **/
public class Observable implements QuackObservable {
    private QuackObservable duck;
    private List<Observer> observers = new ArrayList<>();

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }

    public Iterator<Observer> getObservers() {
        return observers.iterator();
    }
}
