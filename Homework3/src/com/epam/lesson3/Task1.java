package com.epam.lesson3;

public class Task1 {

    public static void main(String[] args) {
        int row = 4;

        for (int a = 1; a <= row; ++a) {
            for (int b = 1; b <= a; ++b) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a = row; a >= 1; --a) {
            for (int b = 1; b <= a; ++b) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
