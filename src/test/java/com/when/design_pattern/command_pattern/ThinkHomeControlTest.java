package com.when.design_pattern.command_pattern;

import com.when.design_pattern.command_pattern.appliance.ThinkHomeControl;
import com.when.design_pattern.command_pattern.appliance.command.Command;
import com.when.design_pattern.command_pattern.appliance.command.LightOffCommand;
import com.when.design_pattern.command_pattern.appliance.command.LightOnCommand;
import com.when.design_pattern.command_pattern.appliance.device.Light;
import org.junit.Before;
import org.junit.Test;

public class ThinkHomeControlTest {
    private ThinkHomeControl control;

    @Before
    public void setUp() {
        control = new ThinkHomeControl();
        // init receivers
        Light livingRoomLight = new Light("Living room");

        // create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        // macro commands
        Command[] commands = {livingRoomLightOn, livingRoomLightOff};

        // set commands
        control.setCommand(0, livingRoomLightOn);
        control.setCommand(1, livingRoomLightOff);
    }

    @Test
    public void testExecuteCommands() {
        System.out.println(control.toString());
        // receiver execute action
        for (int i = 0; i < 2; i++) {
            System.out.println("-------");
            control.onButtonWasPushed(i);
            control.undoCommandWasPushed();
        }
    }

}