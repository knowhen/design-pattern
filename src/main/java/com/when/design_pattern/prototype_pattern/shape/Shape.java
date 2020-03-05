package com.when.design_pattern.prototype_pattern.shape;

/**
 * @author: when
 * @create: 2020-03-05  10:35
 **/
public abstract class Shape implements Cloneable {
    private int id;
    protected String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    abstract void draw();

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
