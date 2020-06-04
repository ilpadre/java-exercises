package com.example.ctheobald;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int value, int[] sortedArray) {

        int lowerBound = 0;
        int upperBound = sortedArray.length;

        if (upperBound <= lowerBound) {
            return -1;
        } else {
            int midPoint = lowerBound + (upperBound - lowerBound) / 2;
            if (sortedArray[midPoint] < value) {
                lowerBound = midPoint;
            }

            if (sortedArray[midPoint] > value) {
                upperBound = midPoint;
            }
            if (sortedArray[midPoint] == value) {
                System.out.println(value + " found at location " + midPoint);
                return midPoint;
            }

            if (sortedArray.length == 1 && sortedArray[midPoint] != value) {
                System.out.println("Value does not exist in array.");
                return -1;
            }
            return binarySearch(value, Arrays.copyOfRange(sortedArray, lowerBound, upperBound));
        }
    }
}
