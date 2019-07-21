package com.example.test.command;

public class HelpCommand implements Command {

    private final String commandString;

    public HelpCommand(String commandString) {
        this.commandString = commandString;
    }

    @Override
    public void execute() {
        System.out.println("Invalid command: " + commandString + ". Available commands are: area, showall, hello, exit");
    }
}
