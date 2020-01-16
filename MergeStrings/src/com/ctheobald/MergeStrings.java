package com.ctheobald;

import java.util.Scanner;

public class MergeStrings {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter first String:");
        String a = scanner.nextLine();

        if(a.length()<1 || a.length()>25000) {
            System.out.println("String not valid.");
            return;
        }

        System.out.println("Please enter second String:");
        String b = scanner.nextLine();

        if(b.length()<1 || b.length()>25000) {
            System.out.println("String not valid.");
            return;
        }

        System.out.println(a);
        System.out.println(b);

        System.out.println("Merged String: " + mergeStrings(a,b));

    }

    public static String mergeStrings(String a, String b) {

        StringBuilder mergedString = new StringBuilder();

        for (int i = 0; i<a.length() || i<b.length(); i++) {

            if (i < a.length()) {
                mergedString.append(a.charAt(i));
            }

            if (i < b.length()) {
                mergedString.append(b.charAt(i));
            }
        }

        return mergedString.toString();
    }
}
