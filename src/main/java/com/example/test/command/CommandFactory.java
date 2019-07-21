package com.example.test.command;

public class CommandFactory {

    public static Command from(String command, String ... additionalParameters) {
        switch (command) {
            case "area": return new CalculateAreaCommand(additionalParameters);
            case "showall": return new ShowAllCommand();
            case "hello": return new HelloCommand();
            case "exit": return new ExitCommand();
            default:
               return new HelpCommand(command);
        }
    }
}
