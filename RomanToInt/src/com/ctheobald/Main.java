package com.ctheobald;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RomanToInteger object = new RomanToInteger();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a Roman Numeral: ");

        String userInput = myObj.nextLine();  // Read user input

        System.out.println("Arabic Integer form of Roman Numeral " + userInput + " is " + object.romanToDecimal(userInput));
    }
}
