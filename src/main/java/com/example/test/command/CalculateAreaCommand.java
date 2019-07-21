package com.example.test.command;

import com.example.test.buffer.AreaCalculationBuffer;
import com.example.test.shape.Circle;
import com.example.test.shape.Rectangle;
import com.example.test.shape.Shape;
import com.example.test.shape.Square;

public class CalculateAreaCommand implements Command {

    private final Shape shape;
    private final String[] shapeParameters;

    public CalculateAreaCommand(String[] shapeParameters) {
        switch (shapeParameters[0]) {
            case "square":
                shape = new Square(Integer.parseInt(shapeParameters[1]));
                break;
            case "rectangle":
                shape = new Rectangle(Integer.parseInt(shapeParameters[1]),
                        Integer.parseInt(shapeParameters[2]));
                break;
            case "circle":
                shape = new Circle(Integer.parseInt(shapeParameters[1]));
                break;
            default:
                throw new IllegalArgumentException("Could not calculate area");
        }
        this.shapeParameters = shapeParameters;
    }

    @Override
    public void execute() {
        final double result = shape.calculateArea();
        AreaCalculationBuffer.getInstance().add(result, shapeParameters);
    }
}
