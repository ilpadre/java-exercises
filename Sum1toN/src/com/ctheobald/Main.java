package com.ctheobald;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        firstNumber = sc.nextInt();

        for (int i = 0; i <= firstNumber; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of the numbers 1 to " + firstNumber + " = " + sum);


        System.out.println("The sum of the the multiples of 3 or 5 that are less than " + firstNumber + " = " + getTotalSum(firstNumber));
    }

    public static int getTotalSum (int firstNumber) {
        int totalSum = 0;
        for (int i = 1; i <= firstNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                totalSum += i;
                System.out.println(i);
                System.out.println(totalSum);
            }
        }
        return totalSum;
    }

}
