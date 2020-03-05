package com.when.design_pattern.prototype_pattern.shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-05  10:39
 **/
public class ShapeCache {
    private static Map<Integer, Shape> cachedShapes = new HashMap<>();

    public static Shape getShape(int shapeId) {
        Shape cachedShape = cachedShapes.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);

        cachedShapes.put(circle.getId(), circle);
    }
}
