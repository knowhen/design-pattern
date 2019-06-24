package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  16:14
 * @Description: TODO:
 **/
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quack createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quack createReadHeadDuck() {
        return new ReadHeadDuck();
    }

    @Override
    public Quack createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quack createRubberDuck() {
        return new RubberDuck();
    }
}
