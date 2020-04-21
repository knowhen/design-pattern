package com.when.design_pattern.command_pattern.appliance.command;

import com.when.design_pattern.command_pattern.appliance.device.CellingFan;

/**
 * @author: when
 * @create: 2019-06-05  10:46
 * @Description: TODO:
 **/
public class CellingFanHighCommand extends CellingFanCommand {

    public CellingFanHighCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    int getSpeed() {
        return CellingFan.HIGH;
    }
}
