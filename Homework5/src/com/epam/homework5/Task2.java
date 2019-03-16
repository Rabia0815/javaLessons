package com.epam.homework5;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arrayInt = createArrayInt(30);
        System.out.println("Array -> " + Arrays.toString(arrayInt));
        summOfOdds(arrayInt);
    }

    static int[] createArrayInt(int size) {
        if (size < 1) {
            return null;
        }
        int[] arrayInt = new int[size];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * 29);
        }
        Arrays.sort(arrayInt);
        return arrayInt;
    }

    static void summOfOdds(int [] array) {
        int counter = 0; int sum = 0;
        {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    counter = counter + 1;
                    sum = sum + array[i];
                }
            }
            System.out.println("The Sum of Odd Numbers in this Array = " + sum);
            System.out.println("The Sum of Odd Numbers in this Array = " + counter);
        }
    }
}

