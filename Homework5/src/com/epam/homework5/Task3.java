package com.epam.homework5;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayInt = createArrayInt(10);
        int[] arrayInt1 = createArrayInt(10);
        System.out.println("Array 1 -> " + Arrays.toString(arrayInt));
        System.out.println("Array 2 -> " + Arrays.toString(arrayInt1));
        System.out.println("Array 3 -> " + Arrays.toString(sumArrays(arrayInt, arrayInt1)));

    }

    static int[] createArrayInt(int size) {
        if (size < 1) {
            return null;
        }
        int[] arrayInt = new int[size];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * 50);
        }
        Arrays.sort(arrayInt);
        return arrayInt;
    }

    static int[] sumArrays(int[] array1, int[] array2) {
        int[] arrayInt3 = new int[10];
        for (int i = 0; i <= arrayInt3.length - 1; i++) {
            arrayInt3[i] = array1[i] + array2[i];
        }
        return arrayInt3;
    }
}
