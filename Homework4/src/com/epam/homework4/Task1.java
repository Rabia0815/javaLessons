package com.epam.homework4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = scanner.nextLine();
        System.out.println("Unique chars ->" + getUniqueCharacters(str1));
    }

    public static String getUniqueCharacters(String str1) {
        String result = "";
        for (int index = 0; index < str1.length(); index++) {
            if (result.indexOf(str1.charAt(index)) == -1) {
                result = result + str1.charAt(index);
            }

        }
        return result;
    }
}
