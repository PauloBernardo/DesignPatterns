package com.company.Command;

import java.util.ArrayList;
import java.util.Collections;

public class CommandsPool {
    private final ArrayList<Command> commands;

    public CommandsPool() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void addAndExecuteCommand(Command command) throws Exception {
        this.addCommand(command);
        this.executeLastCommand();
    }

    public void popCommand() {
        if (this.commands.size() > 0)
            this.commands.remove(this.commands.size() - 1);
    }

    public void removeAllCommands() {
        this.commands.clear();
    }

    public void executeLastCommand() throws Exception {
        if (this.commands.size() > 0)
            this.commands.get(this.commands.size() - 1).execute();
    }

    public void undoLastCommand() throws Exception {
        if (this.commands.size() > 0)
            this.commands.get(this.commands.size() - 1).undo();
    }

    public void undoAndRemoveLastCommand() throws Exception {
        this.undoLastCommand();
        this.popCommand();
    }

    public void executeAllCommands() throws Exception {
        for(Command command: commands) {
            command.execute();
        }
    }

    public void undoAllCommands() throws Exception {
        Collections.reverse(commands);
        for(Command command: commands) {
            command.undo();
        }
        Collections.reverse(commands);
    }
}
