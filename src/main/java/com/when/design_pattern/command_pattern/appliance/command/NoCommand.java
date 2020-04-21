package com.when.design_pattern.command_pattern.appliance.command;

/**
 * @author: when
 * @create: 2019-06-05  10:05
 * @Description: TODO:
 **/
public class NoCommand implements Command {
    @Override
    public void execute() {
        // do nothing
    }

    @Override
    public void undo() {
        // do nothing
    }
}
