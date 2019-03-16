package com.epam.homework5;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = createArrayInt(10);
        System.out.println("Array 1 -> " + Arrays.toString(array1));
        SplitArrays(array1);
    }

    static int[] createArrayInt(int size) {
        if (size < 1)
            return null;

        int[] arrayInt = new int[size];
        for(int i = 0; i< arrayInt.length; i++) {
            arrayInt[i] = (int)((Math.random()-0.5)*2 * size);
        }
        Arrays.sort(arrayInt);
        return arrayInt;
    }

    static void SplitArrays(int[] array) {

        int[] arrayPositive = new int[CountPositiveValues(array)];
        int[] arrayNegative = new int[CountNegativeValues(array)];

        int positiveIndex = 0;
        int negativeIndex = 0;
        for(int i=0; i< array.length; i++) {
            if(array[i] < 0)
                arrayNegative[negativeIndex++] = array[i];
            else
                arrayPositive[positiveIndex++] = array[i];
        }

        System.out.println("Array Negative -> " + Arrays.toString(arrayNegative));
        System.out.println("Array Positive -> " + Arrays.toString(arrayPositive));
    }

    static int CountPositiveValues(int[] array) {
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] >= 0)
                count++;
        }
        return count;
    }

    static int CountNegativeValues(int[] array) {
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] < 0)
                count++;
        }
        return count;
    }
    }

