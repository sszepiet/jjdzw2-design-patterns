package com.example.test.command;

public class HelloCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Welcome to Area Calculator. Please enter a command.");
    }
}
