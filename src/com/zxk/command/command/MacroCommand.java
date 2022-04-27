package com.zxk.command.command;

import java.util.LinkedList;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class MacroCommand implements Command {
    private LinkedList<Command> commands = new LinkedList<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void append(Command command) {
        if (command != this) {
            commands.addLast(command);
        }
    }
    public void undo(){
        if (!commands.isEmpty()) {
            commands.removeLast();
        }
    }
    public void clear(){
        commands.clear();
    }
}
