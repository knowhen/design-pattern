package com.when.design_pattern.command_pattern.command;

import com.when.design_pattern.command_pattern.device.GarageDoor;

/**
 * @author: when
 * @create: 2019-06-05  10:17
 * @Description: TODO:
 **/
public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
