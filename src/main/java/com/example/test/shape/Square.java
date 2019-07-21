package com.example.test.shape;

public class Square implements Shape {

    private final int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return (double) a * a;
    }
}
