package com.epam.homework5;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arrayInt = createArrayInt(30);
        System.out.println("Array -> " + Arrays.toString(arrayInt));
        System.out.println("Reversed Array -> " + Arrays.toString(reverseArray(arrayInt)));
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

   static int[] reverseArray (int[] array) {
       if (array == null || array.length < 2) {
           return array;
     }
    int [] newArrayInt = Arrays.copyOf(array, array.length);
       for(int i=0; i<array.length/2; i++){
           int temp = newArrayInt[i];
           newArrayInt[i] = array[array.length -i -1];
           newArrayInt[array.length -i -1] = temp;
       }
       return newArrayInt;
  }
}
