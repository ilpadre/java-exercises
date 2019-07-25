package com.ctheobald;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word:");

        String word = userInput.nextLine();
        System.out.println(word + "...That's a great word!");
        System.out.println();


        char[][] letterA = {
                {' ', 'A', 'A', ' ', ' '},
                {'A', ' ', ' ', 'A', ' '},
                {'A', 'A', 'A', 'A', ' '},
                {'A', ' ', ' ', 'A', ' '},
                {'A', ' ', ' ', 'A', ' '},
                {'A', ' ', ' ', 'A', ' '}

        };


        char[][] letterB = {
                {'B', 'B', 'B', ' ', ' '},
                {'B', ' ', ' ', 'B', ' '},
                {'B', ' ', ' ', 'B', ' '},
                {'B', 'B', 'B', ' ', ' '},
                {'B', ' ', ' ', 'B', ' '},
                {'B', 'B', 'B', 'B', ' '}

        };


        char[][] letterC = {
                {' ', 'C', 'C', 'C', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {' ', 'C', 'C', 'C', ' '}

        };


        char[][] letterD = {
                {'D', 'D', 'D', ' ', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', ' ', ' ', 'D', ' '},
                {'D', 'D', 'D', ' ', ' '}

        };


        char[][] letterE = {
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', ' ', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '}

        };


        char[][] letterF = {
                {'F', 'F', 'F', 'F', ' '},
                {'F', ' ', ' ', ' ', ' '},
                {'F', 'F', 'F', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '}

        };


        char[][] letterG = {
                {' ', 'G', 'G', 'G', ' '},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', 'G', 'G', ' '},
                {'G', ' ', ' ', 'G', ' '},
                {' ', 'G', 'G', ' ', ' '}

        };


        char[][] letterH = {
                {'H', ' ', ' ', 'H', ' '},
                {'H', ' ', ' ', 'H', ' '},
                {'H', 'H', 'H', 'H', ' '},
                {'H', ' ', ' ', 'H', ' '},
                {'H', ' ', ' ', 'H', ' '},
                {'H', ' ', ' ', 'H', ' '}

        };


        char[][] letterI = {
                {'I', 'I', 'I', ' ', ' '},
                {' ', 'I', ' ', ' ', ' '},
                {' ', 'I', ' ', ' ', ' '},
                {' ', 'I', ' ', ' ', ' '},
                {' ', 'I', ' ', ' ', ' '},
                {'I', 'I', 'I', ' ', ' '}

        };


        char[][] letterJ = {
                {'J', 'J', 'J', 'J', ' '},
                {' ', ' ', 'J', ' ', ' '},
                {' ', ' ', 'J', ' ', ' '},
                {' ', ' ', 'J', ' ', ' '},
                {'J', ' ', 'J', ' ', ' '},
                {' ', 'J', ' ', ' ', ' '}

        };


        char[][] letterK = {
                {'K', ' ', ' ', 'K', ' '},
                {'K', ' ', 'K', ' ', ' '},
                {'K', 'K', ' ', ' ', ' '},
                {'K', 'K', ' ', ' ', ' '},
                {'K', ' ', 'K', ' ', ' '},
                {'K', ' ', ' ', 'K', ' '}

        };


        char[][] letterL = {
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', 'L', 'L', 'L', ' '}

        };


        char[][] letterM = {
                {'M', ' ', 'M', ' ', ' '},
                {'M', 'M', 'M', ' ', ' '},
                {'M', ' ', 'M', ' ', ' '},
                {'M', ' ', 'M', ' ', ' '},
                {'M', ' ', 'M', ' ', ' '},
                {'M', ' ', 'M', ' ', ' '}

        };


        char[][] letterN = {
                {'N', ' ', ' ', 'N', ' '},
                {'N', 'N', ' ', 'N', ' '},
                {'N', ' ', 'N', 'N', ' '},
                {'N', ' ', ' ', 'N', ' '},
                {'N', ' ', ' ', 'N', ' '},
                {'N', ' ', ' ', 'N', ' '}

        };


        char[][] letterO = {
                {' ', 'O', 'O', ' ', ' '},
                {'O', ' ', ' ', 'O', ' '},
                {'O', ' ', ' ', 'O', ' '},
                {'O', ' ', ' ', 'O', ' '},
                {'O', ' ', ' ', 'O', ' '},
                {' ', 'O', 'O', ' ', ' '}

        };


        char[][] letterP = {
                {'P', 'P', 'P', ' ', ' '},
                {'P', ' ', ' ', 'P', ' '},
                {'P', ' ', ' ', 'P', ' '},
                {'P', 'P', 'P', ' ', ' '},
                {'P', ' ', ' ', ' ', ' '},
                {'P', ' ', ' ', ' ', ' '}

        };

        char[][] letterQ = {
                {' ', 'Q', 'Q', ' ', ' '},
                {'Q', ' ', ' ', 'Q', ' '},
                {'Q', ' ', ' ', 'Q', ' '},
                {'Q', ' ', ' ', 'Q', ' '},
                {'Q', ' ', 'Q', ' ', ' '},
                {' ', 'Q', ' ', 'Q', ' '}

        };

        char[][] letterR = {
                {'R', 'R', 'R', ' ', ' '},
                {'R', ' ', ' ', 'R', ' '},
                {'R', 'R', 'R', ' ', ' '},
                {'R', 'R', ' ', ' ', ' '},
                {'R', ' ', 'R', ' ', ' '},
                {'R', ' ', ' ', 'R', ' '}

        };

        char[][] letterS = {
                {' ', 'S', 'S', 'S', ' '},
                {' ', 'S', ' ', ' ', ' '},
                {' ', 'S', 'S', 'S', ' '},
                {' ', ' ', ' ', 'S', ' '},
                {' ', 'S', 'S', 'S', ' '},
                {' ', ' ', ' ', ' ', ' '}

        };


        char[][] letterT = {
                {'T', 'T', 'T', ' ', ' '},
                {' ', 'T', ' ', ' ', ' '},
                {' ', 'T', ' ', ' ', ' '},
                {' ', 'T', ' ', ' ', ' '},
                {' ', 'T', ' ', ' ', ' '},
                {' ', 'T', ' ', ' ', ' '}

        };

        char[][] letterU = {
                {'U', ' ', ' ', 'U', ' '},
                {'U', ' ', ' ', 'U', ' '},
                {'U', ' ', ' ', 'U', ' '},
                {'U', ' ', ' ', 'U', ' '},
                {'U', ' ', ' ', 'U', ' '},
                {' ', 'U', 'U', ' ', ' '}

        };

        char[][] letterV = {
                {'V', ' ', 'V', ' ', ' '},
                {'V', ' ', 'V', ' ', ' '},
                {'V', ' ', 'V', ' ', ' '},
                {'V', ' ', 'V', ' ', ' '},
                {' ', 'V', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}

        };

        char[][] letterW = {
                {'W', ' ', 'W', ' ', ' '},
                {'W', ' ', 'W', ' ', ' '},
                {'W', ' ', 'W', ' ', ' '},
                {'W', ' ', 'W', ' ', ' '},
                {'W', 'W', 'W', ' ', ' '},
                {'W', ' ', 'W', ' ', ' '}

        };

        char[][] letterX = {
                {'X', ' ', ' ', 'X', ' '},
                {'X', ' ', ' ', 'X', ' '},
                {' ', 'X', 'X', ' ', ' '},
                {' ', 'X', 'X', ' ', ' '},
                {'X', ' ', ' ', 'X', ' '},
                {'X', ' ', ' ', 'X', ' '}

        };

        char[][] letterY = {
                {'Y', ' ', 'Y', ' ', ' '},
                {'Y', ' ', 'Y', ' ', ' '},
                {'Y', ' ', 'Y', ' ', ' '},
                {' ', 'Y', ' ', ' ', ' '},
                {' ', 'Y', ' ', ' ', ' '},
                {' ', 'Y', ' ', ' ', ' '}

        };

        char[][] letterZ = {
                {'Z', 'Z', 'Z', 'Z', ' '},
                {' ', ' ', ' ', 'Z', ' '},
                {' ', ' ', 'Z', ' ', ' '},
                {' ', 'Z', ' ', ' ', ' '},
                {'Z', ' ', ' ', ' ', ' '},
                {'Z', 'Z', 'Z', 'Z', ' '}

        };

        char[][] letterSpace = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}

        };


        String str = word;
        for (int i = 0, n = str.length(); i < n; i++) {
            char letter = str.charAt(i);
            if (Character.isLetter(letter) || letter == ' ') {
            } else System.out.println("Please enter only letters");
        }

        char[][] wordBanner = new char[(6)][(str.length() * 5)];

        char[][] letterGrid = null;
        int lastYIndex = 0;

        for (int i = 0, n = str.length(); i < n; i++) {
            char letter = str.charAt(i);
            switch (letter) {
                case 'A':
                case 'a':
                    letterGrid = letterA;
                    break;

                case 'B':
                case 'b':
                    letterGrid = letterB;
                    break;

                case 'C':
                case 'c':
                    letterGrid = letterC;
                    break;

                case 'D':
                case 'd':
                    letterGrid = letterD;
                    break;

                case 'E':
                case 'e':
                    letterGrid = letterE;
                    break;

                case 'F':
                case 'f':
                    letterGrid = letterF;
                    break;

                case 'G':
                case 'g':
                    letterGrid = letterG;
                    break;

                case 'H':
                case 'h':
                    letterGrid = letterH;
                    break;

                case 'I':
                case 'i':
                    letterGrid = letterI;
                    break;

                case 'J':
                case 'j':
                    letterGrid = letterJ;
                    break;

                case 'K':
                case 'k':
                    letterGrid = letterK;
                    break;

                case 'L':
                case 'l':
                    letterGrid = letterL;
                    break;

                case 'M':
                case 'm':
                    letterGrid = letterM;
                    break;

                case 'N':
                case 'n':
                    letterGrid = letterN;
                    break;

                case 'O':
                case 'o':
                    letterGrid = letterO;
                    break;

                case 'P':
                case 'p':
                    letterGrid = letterP;
                    break;

                case 'Q':
                case 'q':
                    letterGrid = letterQ;
                    break;

                case 'R':
                case 'r':
                    letterGrid = letterR;
                    break;

                case 'S':
                case 's':
                    letterGrid = letterS;
                    break;

                case 'T':
                case 't':
                    letterGrid = letterT;
                    break;

                case 'U':
                case 'u':
                    letterGrid = letterU;
                    break;

                case 'V':
                case 'v':
                    letterGrid = letterV;
                    break;

                case 'W':
                case 'w':
                    letterGrid = letterW;
                    break;

                case 'X':
                case 'x':
                    letterGrid = letterX;
                    break;

                case 'Y':
                case 'y':
                    letterGrid = letterY;
                    break;

                case 'Z':
                case 'z':
                    letterGrid = letterZ;
                    break;

                case ' ':
                    letterGrid = letterSpace;
                    break;

                default:
                    break;

            }

            lastYIndex = AddLetterGrid(wordBanner, lastYIndex, letterGrid);


        }

        printLetter(wordBanner);

    }

    public static char[][] printLetter(char[][] letterGiven) {
        for (int i = 0; i < letterGiven.length; i++) {
            for (int j = 0; j < letterGiven[i].length; j++) {
                System.out.print(letterGiven[i][j] + " ");
            }
            System.out.println();

        }
        return letterGiven;

    }


    private static int AddLetterGrid(char[][] wordBanner, int lastIndex, char[][] letterGrid) {
        int lastYIndex = 0;
        if (lastIndex > 0) {
            lastIndex++;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                lastYIndex = lastIndex + j;
                wordBanner[i][lastYIndex] = letterGrid[i][j];
            }
        }

        return lastYIndex;
    }
}
