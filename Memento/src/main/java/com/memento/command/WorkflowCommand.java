package com.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
