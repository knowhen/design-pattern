package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  15:54
 * @Description: TODO:
 **/
public class DuckSimulator {

    public void simulate(AbstractDuckFactory duckFactory) {

        Quack readHeadDuck = duckFactory.createReadHeadDuck();
        Quack duckCall = duckFactory.createDuckCall();
        Quack rubberDuck = duckFactory.createRubberDuck();
        Quack mallardDuckOne = duckFactory.createMallardDuck();
        Quack mallardDuckTwo = duckFactory.createMallardDuck();
        Quack mallardDuckThree = duckFactory.createMallardDuck();
        Quack gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck simulator: With Composite-Flocks ");

        Flock mallardDuckFlock = new Flock();
        mallardDuckFlock.add(mallardDuckOne);
        mallardDuckFlock.add(mallardDuckTwo);
        mallardDuckFlock.add(mallardDuckThree);

        Flock duckFlock = new Flock();
        duckFlock.add(readHeadDuck);
        duckFlock.add(rubberDuck);
        duckFlock.add(duckCall);
        duckFlock.add(gooseDuck);
        duckFlock.add(mallardDuckFlock);

        Quackologist quackologist = new Quackologist();

        duckFlock.registerObserver(quackologist);

        System.out.println("\nObserve whole duck flock: ");
        simulate(duckFlock);
        System.out.println("The ducks quacked " + QuackCounter.getQuackCount() + " times.");
    }

    public void simulate(Quack quack) {
        quack.quack();
    }
}
