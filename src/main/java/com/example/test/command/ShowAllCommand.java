package com.example.test.command;

import com.example.test.buffer.AreaCalculationBuffer;

public class ShowAllCommand implements Command {
    @Override
    public void execute() {
        AreaCalculationBuffer.getInstance().getResults()
                .forEach(System.out::println);
    }
}
