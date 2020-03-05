package com.when.design_pattern.prototype_pattern.shape;

/**
 * @author: when
 * @create: 2020-03-05  10:36
 **/
public class Circle extends Shape {
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Draw a circle");
    }
}
