package com.when.design_pattern.observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: when
 * @create: 2019-03-13  16:59
 **/
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            lastPressure = currentPressure;
            currentPressure = ((WeatherData) o).getPressure();
            display();
        }
    }

    @Override
    public void display() {

    }
}
