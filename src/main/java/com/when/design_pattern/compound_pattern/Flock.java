package com.when.design_pattern.compound_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: when
 * @create: 2019-06-19  16:31
 * @Description: TODO:
 **/
public class Flock implements Quack {
    private List<Quack> ducks = new ArrayList<>();

    public void add(Quack quack) {
        ducks.add(quack);
    }

    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quack quack = (Quack) iterator.next();
            quack.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quack> iterator = ducks.iterator();
        while(iterator.hasNext()) {
            Quack duck = iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
