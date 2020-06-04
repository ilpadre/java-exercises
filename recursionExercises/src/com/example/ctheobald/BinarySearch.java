package com.example.ctheobald;

public class BinarySearch {

    public static int binarySearch(int value, int[] sortedArray, int lowerBound, int upperBound) {

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
                //System.out.println(value + " found at index " + midPoint);
                return midPoint;
            }

            if (sortedArray.length == 1 && sortedArray[midPoint] != value) {
                System.out.println("Value does not exist in array.");
                return -1;
            }
            return binarySearch(value, sortedArray, lowerBound, upperBound);
        }
    }
}
