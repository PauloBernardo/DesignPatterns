package com.company.Command;

public interface Command {

    public void execute() throws Exception;
    public void undo() throws Exception;
}
