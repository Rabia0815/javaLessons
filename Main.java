package com.epam.homework7;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[9];
        for(int i=0; i<3; i++)
        {
            Circle circle = new Circle("red", 5);
            System.out.println(circle.toString());
            shapes[i] = circle;
        }

        for(int i=3; i<7; i++)
        {
            Rectangle rectangle = new Rectangle("blue", 3, 2);
            System.out.println(rectangle.toString());
            shapes[i] = rectangle;
        }

        for(int i=7; i<9; i++)
        {
            Triangle triangle = new Triangle("green", 4, 6, 6);
            System.out.println(triangle.toString());
            shapes[i] = triangle;
        }

        System.out.println("total area = " + getTotalArea(shapes));
        double [] areas = getSpecificArea(shapes);
        System.out.println("circle area = " + areas[0]);
        System.out.println("rectangle area = " + areas[1]);
        System.out.println("triangle area = " + areas[2]);
    }

    public static double getTotalArea(Shape[] shapes)
    {
        double sum = 0;
        for(int i=0; i< shapes.length; i++)
        {
            sum = sum + shapes[i].calcArea();
        }
        return sum;
    }

    public static double[] getSpecificArea(Shape[] shapes)
    {
        double[] sum = new double[3];
        for(int i=0; i< shapes.length; i++)
        {
            if(shapes[i].getClass().getSimpleName().equals("Circle"))
                sum[0] = sum[0] + shapes[i].calcArea();
            if(shapes[i].getClass().getSimpleName().equals("Rectangle"))
                sum[1] = sum[1] + shapes[i].calcArea();
            if(shapes[i].getClass().getSimpleName().equals("Triangle"))
                sum[2] = sum[2] + shapes[i].calcArea();
        }
        return sum;
    }
}