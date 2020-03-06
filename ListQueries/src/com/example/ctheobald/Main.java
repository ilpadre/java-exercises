package com.example.ctheobald;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        List<String> stringList;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please enter the size of the list you wish to create.");

            String sizeOfArrayList = reader.readLine();

            if (isInteger(sizeOfArrayList)) {
                System.out.println("Please enter " + sizeOfArrayList + " integers separated by a space:");

                String arrayListInput = reader.readLine();

                stringList = Arrays.asList(arrayListInput.split(" "));

                List<Integer> list = new ArrayList<>(stringList.size());

                for (int i = 0; i<stringList.size(); i++) {
                    list.add(Integer.parseInt(stringList.get(i)));
                }

                System.out.println(list);



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
                                if(index >= list.size()) {
                                    System.out.println("That index does not exist");
                                } else {
                                    list.remove(index);
                                    System.out.println(list);
                                }
                            }
                            break;
                        case "INSERT":
                            System.out.println("Please enter the index and value for the insert as INDEX VALUE");
                            String insertInput = reader.readLine();
                            if (!insertInput.isEmpty()) {
                                List<String> insertInputList;
                                insertInputList = Arrays.asList(insertInput.split(" "));
                                if (Integer.parseInt(insertInputList.get(0)) > list.size()){
                                    System.out.println("Sorry you can only expand the arraylist by 1 index at a time.  Your index cannot be greater than " + list.size());
                                } else {
                                    list.add(Integer.parseInt(insertInputList.get(0)), Integer.parseInt(insertInputList.get(1)));
                                    System.out.println(list);
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


}
