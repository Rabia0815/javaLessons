package com.epam.lesson2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three digit number to reverse");
        int number = scanner.nextInt();
        int reverse = 0;

        while(number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }

        System.out.println("Reversed number is " + reverse);





    }
}
