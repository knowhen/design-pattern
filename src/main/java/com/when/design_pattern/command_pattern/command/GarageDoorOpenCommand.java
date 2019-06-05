package com.when.design_pattern.command_pattern.command;

import com.when.design_pattern.command_pattern.device.GarageDoor;

/**
 * @author: when
 * @create: 2019-06-05  09:47
 * @Description: TODO:
 **/
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
