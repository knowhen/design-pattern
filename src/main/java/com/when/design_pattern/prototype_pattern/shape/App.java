package com.when.design_pattern.prototype_pattern.shape;

/**
 * @author: when
 * @create: 2020-03-05  10:38
 **/
public class App {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape(1);
        clonedShape.draw();
    }
}
