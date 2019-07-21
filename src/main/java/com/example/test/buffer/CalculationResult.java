package com.example.test.buffer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculationResult {
    private final double result;
    private final String[] shapeParameters;

    public CalculationResult(double result, String[] shapeParameters) {
        this.result = result;
        this.shapeParameters = shapeParameters;
    }

    public String toString() {
        final List<String> collect = Stream.of(shapeParameters)
                .collect(Collectors.toList());
        collect.add(Double.toString(result));
        return String.join(" ", collect);
    }
}
