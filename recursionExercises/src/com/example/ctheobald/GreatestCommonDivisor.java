package com.example.ctheobald;

public class GreatestCommonDivisor {

    public static int greatestCommonDivisor(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        if (b > a) {
            b = b - a;
        } else {
            a = a - b;
        }
        if (b == a) {
            return b;
        } else {
            return (greatestCommonDivisor(a, b));
        }

    }
}
