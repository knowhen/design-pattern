package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  16:12
 * @Description: TODO:
 **/
public abstract class AbstractDuckFactory {
    public abstract Quack createMallardDuck();

    public abstract Quack createReadHeadDuck();

    public abstract Quack createDuckCall();

    public abstract Quack createRubberDuck();
}
