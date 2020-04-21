package com.when.design_pattern.command_pattern.appliance.device;

/**
 * @author: when
 * @create: 2019-06-05  10:42
 * @Description: TODO:
 **/
public class CellingFan {
    public static final int HIGH = 3;
    public static final int MIDDLE = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public void setSpeed(int speed) {
        if (speed == CellingFan.HIGH) {
            setHigh();
        } else if (speed == CellingFan.MIDDLE) {
            setMiddle();
        } else if (speed == CellingFan.LOW) {
            setLow();
        } else if (speed == CellingFan.OFF) {
            off();
        }
    }

    public CellingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void setHigh() {
        this.speed = HIGH;
        System.out.println(location + "'s celling fan is on high.");
    }

    public void setMiddle() {
        this.speed = MIDDLE;
        System.out.println(location + "'s celling fan is on middle.");
    }

    public void setLow() {
        this.speed = LOW;
        System.out.println(location + "'s celling fan is on low.");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(location + "'s celling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
