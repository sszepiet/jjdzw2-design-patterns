package com.example.test;

import com.example.test.command.Command;
import com.example.test.command.CommandFactory;
import com.example.test.command.HelloCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaCalculator {

    public static void main(String[] args) {
        boolean ok = true;
        Scanner s = new Scanner(System.in);
        new HelloCommand().execute();
        while (ok) {
            String commandString = s.nextLine();
            final String[] splitCommand = commandString.split(" ");
            final Command result = CommandFactory.from(splitCommand[0], removeFirstElementFromArray(splitCommand));
            result.execute();
        }
        s.close();
    }

    private static String[] removeFirstElementFromArray(String[] strings) {
        final List<String> arrayAsList = Stream.of(strings)
                .collect(Collectors.toList());
        arrayAsList.remove(0);
        return arrayAsList.toArray(new String[]{});
    }
}
