package com.when.design_pattern.command_pattern;

import com.when.design_pattern.command_pattern.appliance.RemoteControl;
import com.when.design_pattern.command_pattern.appliance.command.*;
import com.when.design_pattern.command_pattern.command.*;
import com.when.design_pattern.command_pattern.appliance.device.CellingFan;
import com.when.design_pattern.command_pattern.appliance.device.GarageDoor;
import com.when.design_pattern.command_pattern.appliance.device.Light;
import org.junit.Before;
import org.junit.Test;

public class RemoteControlTest {
    private RemoteControl remoteControl;

    @Before
    public void setUp() {
        remoteControl = new RemoteControl();
        // init receivers
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        CellingFan cellingFan = new CellingFan("Drawing room");

        // create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        Command cellingFanHigh = new CellingFanHighCommand(cellingFan);
        Command cellingFanMiddle = new CellingFanMiddleCommand(cellingFan);
        Command cellingFanLow = new CellingFanLowCommand(cellingFan);
        Command cellingFanOff = new CellingFanOffCommand(cellingFan);
        // macro commands
        Command[] onCommands = {livingRoomLightOn, kitchenLightOn, garageDoorOpen};
        Command[] offCommands = {livingRoomLightOff, kitchenLightOff, garageDoorClose};
        Command macroCommandOn = new MacroCommand(onCommands);
        Command macroCommandOff = new MacroCommand(offCommands);

        // set commands
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(3, cellingFanHigh, cellingFanOff);
        remoteControl.setCommand(4, cellingFanMiddle, cellingFanOff);
        remoteControl.setCommand(5, cellingFanLow, cellingFanOff);
        remoteControl.setCommand(6, macroCommandOn, macroCommandOff);
    }

    @Test
    public void testExecuteCommands() {
        System.out.println(remoteControl.toString());
        // receiver execute action
        for (int i = 0; i < 7; i++) {
            System.out.println("-------");
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            remoteControl.undoCommandWasPushed();
        }
    }
}