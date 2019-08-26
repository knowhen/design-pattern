package com.when.design_pattern.command_pattern;

import com.when.design_pattern.command_pattern.command.Command;
import com.when.design_pattern.command_pattern.command.NoCommand;

/**
 * @author: when
 * @create: 2019-06-29  08:26
 * @Description: TODO:
 **/
public class ThinkHomeControl {
    private Command[] commands;
    private Command undoCommand;

    public ThinkHomeControl() {
        this.commands = new Command[2];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < commands.length; i++) {
            commands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand) {
        commands[slot] = onCommand;
    }

    public void onButtonWasPushed(int slot) {
        commands[slot].execute();
        undoCommand = commands[slot];
    }

    public void offButtonWasPushed(int slot) {
        commands[slot].execute();
        undoCommand = commands[slot];
    }

    public void undoCommandWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < commands.length; i++) {
            buffer.append("[slot" + i + "] " + commands[i].getClass().getSimpleName() + "   "
                    + commands[i].getClass().getSimpleName() + "\n");
        }
        return buffer.toString();
    }


}
