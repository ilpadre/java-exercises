package com.ctheobald;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 20 + 1);
        }

        System.out.println(Arrays.toString(randomArray));

        bubbleSort(randomArray);

        System.out.println(Arrays.toString(randomArray));
        

    }

    public static void bubbleSort(int array[])
    {
        for (int i = (array.length - 1); i >= 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (array[j-1] > array[j])
                {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                } } } }
}
