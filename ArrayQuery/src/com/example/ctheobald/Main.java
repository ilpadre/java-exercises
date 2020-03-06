package com.example.ctheobald;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the size of the list you wish to create.");

        String sizeOfArray = reader.readLine();

        if (isInteger(sizeOfArray)) {
            System.out.println("Please enter " + sizeOfArray + " integers separated by a space:");

            String arrayInput = reader.readLine();

            String [] stringArray = (arrayInput.split(" "));

            int size = stringArray.length;

            int [] arr = new int [size];

            for (int i = 0; i<size; i++) {
                arr[i] = Integer.parseInt(stringArray[i]);
            }

            System.out.println(Arrays.toString(arr));



            boolean quit = false;

            while(!quit) {
                System.out.println("Please enter an command (Insert or Delete or Quit):");

                String command = reader.readLine();

                switch (command.toUpperCase()) {
                    case "DELETE":
                        System.out.println("Which index would you like to delete?");
                        String deleteInput = reader.readLine();
                        if (!deleteInput.isEmpty()) {
                            int index = Integer.parseInt(deleteInput);
                            if(index >= arr.length) {
                                System.out.println("That index does not exist");
                            } else {
                                arr = deleteElement(arr, index);
                                System.out.println(Arrays.toString(arr));
                            }
                        }
                        break;
                    case "INSERT":
                        System.out.println("Please enter the index and value for the insert as INDEX VALUE");
                        String insertInput = reader.readLine();
                        if (!insertInput.isEmpty()) {
                            List<String> insertInputList;
                            insertInputList = Arrays.asList(insertInput.split(" "));
                            if (Integer.parseInt(insertInputList.get(0)) > arr.length){
                                System.out.println("Sorry you can only expand the array by 1 index at a time.  Your index cannot be greater than " + arr.length);
                            } else {
                                int index = Integer.parseInt(insertInputList.get(0));
                                int value = Integer.parseInt(insertInputList.get(1));
                                arr = insertElement(arr, index, value);
                                System.out.println(Arrays.toString(arr));
                            }
                        }
                        break;
                    case "QUIT":
                        quit = true;
                        break;
                    default:
                        System.out.println("That is not a valid command.");
                }

            }
        } else {
            System.out.println("You did not enter an integer.  Please try again.");
        }
    }

    public static boolean isInteger(String string) {

        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int[] deleteElement(int [] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        int[] newArray = new int[arr.length -1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i== index) {
                continue;
            }

            newArray[k++] = arr[i];
        }
        return newArray;
    }

    public static int[] insertElement(int[] arr, int index, int value) {

        int newArray[] = new int[arr.length + 1];

        for (int i=0; i < arr.length +1; i++) {
            if ( i < index){
                newArray[i] = arr[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }
}



