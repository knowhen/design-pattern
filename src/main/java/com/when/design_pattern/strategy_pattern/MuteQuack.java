package com.when.design_pattern.strategy_pattern;

/**
 * @author: when
 * @create: 2019-03-12  08:33
 **/
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
