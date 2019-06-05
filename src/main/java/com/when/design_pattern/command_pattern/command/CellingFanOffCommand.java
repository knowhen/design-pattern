package com.when.design_pattern.command_pattern.command;

import com.when.design_pattern.command_pattern.device.CellingFan;

/**
 * @author: when
 * @create: 2019-06-05  11:04
 * @Description: TODO:
 **/
public class CellingFanOffCommand extends CellingFanCommand {

    public CellingFanOffCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    int getSpeed() {
        return CellingFan.OFF;
    }
}
