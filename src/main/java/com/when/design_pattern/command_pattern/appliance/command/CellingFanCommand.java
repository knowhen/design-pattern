package com.when.design_pattern.command_pattern.appliance.command;

import com.when.design_pattern.command_pattern.appliance.device.CellingFan;

/**
 * @author: when
 * @create: 2019-06-05  10:56
 * @Description: TODO:
 **/
public abstract class CellingFanCommand implements Command {
    protected CellingFan cellingFan;
    protected int preSpeed;

    public CellingFanCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        preSpeed = cellingFan.getSpeed();
        int speed = getSpeed();
        cellingFan.setSpeed(speed);
    }

    @Override
    public void undo() {
        if(preSpeed == CellingFan.HIGH) {
            cellingFan.setHigh();
        } else if(preSpeed == CellingFan.MIDDLE) {
            cellingFan.setMiddle();
        } else if(preSpeed == CellingFan.LOW) {
            cellingFan.setLow();
        } else if(preSpeed == CellingFan.OFF) {
            cellingFan.off();
        }
    }

    abstract int getSpeed();
}
