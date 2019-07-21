package com.example.test.shape;

public class Circle implements Shape {

    private final int r;

    public Circle(int r) {
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
