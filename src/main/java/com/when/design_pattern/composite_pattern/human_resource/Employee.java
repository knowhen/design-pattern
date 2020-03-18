package com.when.design_pattern.composite_pattern.human_resource;

/**
 * @author: when
 * @create: 2020-03-18  10:23
 **/
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
