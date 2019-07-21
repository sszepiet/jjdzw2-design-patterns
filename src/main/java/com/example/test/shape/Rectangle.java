package com.example.test.shape;

public class Rectangle implements Shape {

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private final int a;
    private final int b;

    @Override
    public double calculateArea() {
        return (double) a * b;
    }
}
