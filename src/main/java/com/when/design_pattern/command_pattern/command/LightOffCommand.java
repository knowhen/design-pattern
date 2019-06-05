package com.when.design_pattern.command_pattern.command;

import com.when.design_pattern.command_pattern.device.Light;

/**
 * @author: when
 * @create: 2019-06-05  10:12
 * @Description: TODO:
 **/
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
