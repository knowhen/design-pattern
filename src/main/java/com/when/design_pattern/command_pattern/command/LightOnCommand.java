package com.when.design_pattern.command_pattern.command;

import com.when.design_pattern.command_pattern.device.Light;

/**
 * @author: when
 * @create: 2019-06-05  09:42
 * @Description: TODO:
 **/
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
