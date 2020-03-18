package com.when.design_pattern.composite_pattern.human_resource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-18  10:24
 **/
public class Department extends HumanResource {
    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for (HumanResource hr : subNodes) {
            totalSalary += hr.calculateSalary();
        }
        return totalSalary;
    }

    public void addSubNode(HumanResource humanResource) {
        subNodes.add(humanResource);
    }
}
