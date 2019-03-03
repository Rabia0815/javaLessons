package com.epam.lesson3;

public class Task3 {
    public static void main(String[] args) {
        for (int f = 1; f <= 4; f++) {
            for(int g = 3; g >= f; g--) {
                System.out.print(" ");
            }
            for(int h = 1; h <= f; h++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
