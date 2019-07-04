package com.ctheobald;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 20 + 1);
        }

        System.out.println(Arrays.toString(randomArray));

        selectionSort(randomArray);

        System.out.println(Arrays.toString(randomArray));

    }

    public static int[] selectionSort (int[] array) {

        int i, j, minValue, minIndex, temp = 0;

        for (i=0; i < array.length; i++) {
            minValue = array[i];
            minIndex = i;

            for (j=i; j < array.length; j++) {
                if(array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }

            if (minValue < array[i]) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        } return array;
    }
}
