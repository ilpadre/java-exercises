package com.example.ctheobald;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Choose a recursion algorithm: \n" +
                "1 : Factorial\n" +
                "2 : Fibonacci\n" +
                "3 : Greatest Common Divisor\n" +
                "4 : Binary Search\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option to select the algorithm: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter an number between 1 and 25: ");
                    long inputFact = scanner.nextLong();
                    scanner.nextLine();
                    if ((inputFact > 0) && (inputFact <= 25)) {
                        System.out.println("The factorial of " + inputFact + " is " + Factorial.factorial(inputFact));
                        break;
                    } else {
                        System.out.println("Sorry you did not enter a number between 1 and 25.");
                        break;
                    }
                case 2:
                    System.out.println("Enter an number between 1 and 20: ");
                    int inputFib = scanner.nextInt();
                    scanner.nextLine();
                    if ((inputFib > 0) && (inputFib <= 20)) {
                        switch(inputFib) {
                            case 1:
                                System.out.println("The " + inputFib + "st Fibonacci number is " + Fibonacci.fibonacci(inputFib));
                                break;
                            case 2:
                                System.out.println("The " + inputFib + "nd Fibonacci number is " + Fibonacci.fibonacci(inputFib));
                                break;
                            case 3:
                                System.out.println("The " + inputFib + "rd Fibonacci number is " + Fibonacci.fibonacci(inputFib));
                                break;
                            default:
                                System.out.println("The " + inputFib + "th Fibonacci number is " + Fibonacci.fibonacci(inputFib));
                                break;
                        }
                    } else {
                        System.out.println("Sorry you did not enter a number between 1 and 20.");
                        break;
                    }
                case 3:
                    System.out.println("Enter first integer: ");
                    int int1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter second integer: ");
                    int int2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("The Greatest Common Divisor of " + int1 + " and " + int2 + " is " + GreatestCommonDivisor.greatestCommonDivisor(int1, int2));
                    break;
                case 4:
                    System.out.println("Enter the length of the array:");
                    int length = scanner.nextInt();
                    int [] myArray = new int[length];
                    System.out.println("Enter the elements of the array:");

                    for(int i=0; i<length; i++ ) {
                        myArray[i] = scanner.nextInt();
                    }

                    Arrays.sort(myArray);

                    System.out.println("Sorted Array: " + Arrays.toString(myArray));

                    System.out.println("Which value would you like you search for? ");
                    int value = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Performing Binary Search...");
                    System.out.println(value + " found at index " + BinarySearch.binarySearch(value, myArray, 0, myArray.length));
                    break;
            }
        }

    }
}
