package com.epam.lesson2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount of money you want to deposit: ");
        int money = scanner.nextInt();

        System.out.println("For how many months: ");
        int month = scanner.nextInt();

        System.out.println("Interest rate: ");
        int rate = scanner.nextInt();

        double interest = (money / 100 * rate) / 12 * month;

        System.out.println("If you deposit " + money + " for " + month + " months " + " with " + rate + " interest rate ");
        System.out.println("Your interest will be " + interest);
    }
}
