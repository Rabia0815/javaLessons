package com.epam.lesson3;

public class Task2 {
    public static void main(String[] args) {
        for (int c = 1; c <= 4; c++) {
            for (int d = 1; d <= c; d++) {
                System.out.print(" ");
            }

            for (int e = 4; e >= c; e--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
