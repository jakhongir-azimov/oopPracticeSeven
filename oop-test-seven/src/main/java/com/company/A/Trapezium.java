package com.company.A;

public class Trapezium extends GeometricFigure {
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return ((sideA + sideB) / 2) * high;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + 2 * high;
    }
}
