package com.when.design_pattern.composite_pattern.human_resource;

/**
 * @author: when
 * @create: 2020-03-18  10:22
 **/
public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
