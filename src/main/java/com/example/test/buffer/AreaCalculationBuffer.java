package com.example.test.buffer;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculationBuffer {

    private static final AreaCalculationBuffer INSTANCE = new AreaCalculationBuffer();

    private final List<CalculationResult> results = new ArrayList<>();

    private AreaCalculationBuffer() {
    }

    public void add(double result, String[] shapeParameters) {
        results.add(new CalculationResult(result, shapeParameters));
    }

    public List<CalculationResult> getResults() {
        return results;
    }

    public static AreaCalculationBuffer getInstance() {
        return INSTANCE;
    }
}
