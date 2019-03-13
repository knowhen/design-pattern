package com.when.design_pattern.strategy_pattern;

/**
 * @author: when
 * @create: 2019-03-12  08:37
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.swim();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.swim();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
