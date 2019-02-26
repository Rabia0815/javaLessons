package com.epam.lesson2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the weight in pound: ");

        int pound = scanner.nextInt();
        double kilo = pound * 0.4536;
        double gram = (kilo - (int)kilo)*1000;

        System.out.println("Weight in kilos is " + (int)kilo + " kilos " + (int)gram + " grams.");

    }
}
