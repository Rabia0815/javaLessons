package com.epam.homework4;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive decimal number:");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Please enter more than 0");
        } else if (n == 0 || n ==1)  {
            System.out.println(n);}
        else {
            System.out.println("Binary number -> " + decimalToBinary(n));
        }
    }
        public static String decimalToBinary(int n){
            String result = "";
            while (n > 0) {
                result = (n % 2) + result;
                n = n / 2;
            }
            return result;
        }
    }


