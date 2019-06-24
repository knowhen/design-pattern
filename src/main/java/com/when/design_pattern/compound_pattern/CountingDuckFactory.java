package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  16:15
 * @Description: TODO:
 **/
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quack createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quack createReadHeadDuck() {
        return new QuackCounter(new ReadHeadDuck());
    }

    @Override
    public Quack createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quack createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
