package com.when.design_pattern.compound_pattern;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
