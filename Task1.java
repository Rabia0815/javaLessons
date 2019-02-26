package com.epam.lesson2;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 and number 2: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Before swap " + num1 + " and " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap the first number is " + num1 + " and the second number is " + num2);


    }
}