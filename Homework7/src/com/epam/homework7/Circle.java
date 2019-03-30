package com.epam.homework7;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
}
