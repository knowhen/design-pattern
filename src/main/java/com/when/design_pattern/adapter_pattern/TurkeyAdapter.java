package com.when.design_pattern.adapter_pattern;

/**
 * @author: when
 * @create: 2019-06-05  15:21
 * @Description: TODO:
 **/
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
