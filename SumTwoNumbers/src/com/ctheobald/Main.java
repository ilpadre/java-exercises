package com.ctheobald;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;


        System.out.println("The sum of " + firstNumber + "+" + secondNumber + " = " + sum);
    }
}
