package com.when.design_pattern.command_pattern.command;

import com.when.design_pattern.command_pattern.device.CellingFan;

/**
 * @author: when
 * @create: 2019-06-05  11:03
 * @Description: TODO:
 **/
public class CellingFanLowCommand extends CellingFanCommand {

    public CellingFanLowCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    int getSpeed() {
        return CellingFan.LOW;
    }
}
