package com.ctheobald;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IntToRoman object = new IntToRoman();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an Integer: ");

        int userInput = myObj.nextInt();  // Read user input

        if (userInput <= 0 || userInput > 3999) {
            System.out.println("Please enter an Integer between 1-3999.");
        } else {
            System.out.println("Roman Numeral Form of " + userInput + " is " + object.intToRoman(userInput));
        }


    }
}
