package com.when.design_pattern.command_pattern.appliance.device;

/**
 * @author: when
 * @create: 2019-06-05  09:39
 * @Description: TODO:
 **/
public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(position +"'s Light is on!");
    }

    public void off() {
        System.out.println(position +"'s Light is off!");
    }
}
