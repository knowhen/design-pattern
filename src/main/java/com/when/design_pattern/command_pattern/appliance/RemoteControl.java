package com.when.design_pattern.command_pattern.appliance;

import com.when.design_pattern.command_pattern.appliance.command.Command;
import com.when.design_pattern.command_pattern.appliance.command.NoCommand;

/**
 * @author: when
 * @create: 2019-06-05  09:40
 * @Description: TODO:
 **/
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoCommandWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot" + i + "] " + onCommands[i].getClass().getSimpleName() + "   "
                    + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return buffer.toString();
    }
}
