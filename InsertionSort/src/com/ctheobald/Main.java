package com.ctheobald;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 20 + 1);
        }

        System.out.println(Arrays.toString(randomArray));

        insertionSort(randomArray);

        System.out.println(Arrays.toString(randomArray));

    }

    public static int[] insertionSort(int[] array) {
        int i, j, key, temp;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;

            while (j >= 0 && key < array[j]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        return array;
    }
}
