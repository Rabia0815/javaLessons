package com.epam.homework7;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", height =" + height + ", width =" + width;
    }

    @Override
    public double calcArea() {
        double area = height*width;
        return area;
    }
}
