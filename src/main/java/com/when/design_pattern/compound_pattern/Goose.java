package com.when.design_pattern.compound_pattern;

/**
 * @author: when
 * @create: 2019-06-19  15:58
 * @Description: TODO:
 **/
public class Goose {
    public void honk() {
        System.out.println("Honk, honk, honk!");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
