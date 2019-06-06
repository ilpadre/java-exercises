package com.ctheobald;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word:");

        String word = userInput.nextLine();
        System.out.println(word + "...That's a great word!");


        char a = 'a';
        char A = 'A';

        char [][] letterA = {
                {' ', 'A', 'A', ' '},
                {'A', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', 'A'},
                {'A', ' ', ' ', 'A'},
                {'A', ' ', ' ', 'A'}

        };

        char b = 'b';
        char B = 'B';

        char[][] letterB = {
                {'B', 'B', 'B', ' '},
                {'B', ' ', ' ', 'B'},
                {'B', ' ', ' ', 'B'},
                {'B', 'B', 'B', ' '},
                {'B', ' ', ' ', 'B'},
                {'B', 'B', 'B', 'B'}

        };

        char c = 'c';
        char C = 'C';

        String[][] letterC = {
                {" ", "C", "C", "C"},
                {"C", " ", " ", " "},
                {"C", " ", " ", " "},
                {"C", " ", " ", " "},
                {"C", " ", " ", " "},
                {" ", "C", "C", "C"}

        };

        char d = 'd';
        char D = 'D';

        String[][] letterD = {
                {"D", "D", "D", " "},
                {"D", " ", " ", "D"},
                {"D", " ", " ", "D"},
                {"D", " ", " ", "D"},
                {"D", " ", " ", "D"},
                {"D", "D", "D", " "}

        };

        char e = 'e';
        char E = 'E';

        String[][] letterE = {
                {"E", "E", "E", "E"},
                {"E", " ", " ", " "},
                {"E", "E", "E", " "},
                {"E", " ", " ", " "},
                {"E", " ", " ", " "},
                {"E", "E", "E", "E"}

        };

        char f = 'f';
        char F = 'F';

        String[][] letterF = {
                {"F", "F", "F", "F"},
                {"F", " ", " ", " "},
                {"F", "F", "F", " "},
                {"F", " ", " ", " "},
                {"F", " ", " ", " "},
                {"F", " ", " ", " "}

        };

        char g = 'g';
        char G = 'G';

        String[][] letterG = {
                {" ", "G", "G", "G"},
                {"G", " ", " ", " "},
                {"G", " ", " ", " "},
                {"G", " ", "G", "G"},
                {"G", " ", " ", "G"},
                {" ", "G", "G", " "}

        };

        char h = 'h';
        char H = 'H';

        String[][] letterH = {
                {"H", " ", " ", "H"},
                {"H", " ", " ", "H"},
                {"H", "H", "H", "H"},
                {"H", " ", " ", "H"},
                {"H", " ", " ", "H"},
                {"H", " ", " ", "H"}

        };

        char xi = 'i';
        char XI = 'I';

        String[][] letterI = {
                {"I", "I", "I", " "},
                {" ", "I", " ", " "},
                {" ", "I", " ", " "},
                {" ", "I", " ", " "},
                {" ", "I", " ", " "},
                {"I", "I", "I", " "}

        };

        char j = 'j';
        char J = 'J';

        String[][] letterJ = {
                {"J", "J", "J", "J"},
                {" ", " ", "J", " "},
                {" ", " ", "J", " "},
                {" ", " ", "J", " "},
                {"J", " ", "J", " "},
                {" ", "J", " ", " "}

        };

        char k = 'k';
        char K = 'K';

        String[][] letterK = {
                {"K", " ", " ", "K"},
                {"K", " ", "K", " "},
                {"K", "K", " ", " "},
                {"K", "K", " ", " "},
                {"K", " ", "K", " "},
                {"K", " ", " ", "K"}

        };

        char l = 'l';
        char L = 'L';

        String[][] letterL = {
                {"L", " ", " ", " "},
                {"L", " ", " ", " "},
                {"L", " ", " ", " "},
                {"L", " ", " ", " "},
                {"L", " ", " ", " "},
                {"L", "L", "L", "L"}

        };

        char m = 'm';
        char M = 'M';

        String[][] letterM = {
                {"M", " ", "M", " "},
                {"M", "M", "M", " "},
                {"M", " ", "M", " "},
                {"M", " ", "M", " "},
                {"M", " ", "M", " "},
                {"M", " ", "M", " "}

        };

        char xn = 'n';
        char XN = 'N';

        String[][] letterN = {
                {"N", " ", " ", "N"},
                {"N", "N", " ", "N"},
                {"N", " ", "N", "N"},
                {"N", " ", " ", "N"},
                {"N", " ", " ", "N"},
                {"N", " ", " ", "N"}

        };

        char o = 'o';
        char O = 'O';

        String[][] letterO = {
                {" ", "O", "O", " "},
                {"O", " ", " ", "O"},
                {"O", " ", " ", "O"},
                {"O", " ", " ", "O"},
                {"O", " ", " ", "O"},
                {" ", "O", "O", " "}

        };

        char p = 'p';
        char P = 'P';

        String[][] letterP = {
                {"P", "P", "P", " "},
                {"P", " ", " ", "P"},
                {"P", " ", " ", "P"},
                {"P", "P", "P", " "},
                {"P", " ", " ", " "},
                {"P", " ", " ", " "}

        };

        char q = 'q';
        char Q = 'Q';

        String[][] letterQ = {
                {" ", "Q", "Q", " "},
                {"Q", " ", " ", "Q"},
                {"Q", " ", " ", "Q"},
                {"Q", " ", " ", "Q"},
                {"Q", " ", "Q", " "},
                {" ", "Q", " ", "Q"}

        };

        char r = 'r';
        char R = 'R';

        String[][] letterR = {
                {"R", "R", "R", " "},
                {"R", " ", " ", "R"},
                {"R", "R", "R", " "},
                {"R", "R", " ", " "},
                {"R", " ", "R", " "},
                {"R", " ", " ", "R"}

        };

        char s = 's';
        char S = 'S';

        String[][] letterS = {
                {" ", "S", "S", "S"},
                {" ", "S", " ", " "},
                {" ", "S", "S", "S"},
                {" ", " ", " ", "S"},
                {" ", "S", "S", "S"},
                {" ", " ", " ", " "}

        };

        char t = 't';
        char T = 'T';

        String[][] letterT = {
                {"T", "T", "T", " "},
                {" ", "T", " ", " "},
                {" ", "T", " ", " "},
                {" ", "T", " ", " "},
                {" ", "T", " ", " "},
                {" ", "T", " ", " "}

        };

        char u = 'u';
        char U = 'U';

        String[][] letterU = {
                {"U", " ", " ", "U"},
                {"U", " ", " ", "U"},
                {"U", " ", " ", "U"},
                {"U", " ", " ", "U"},
                {"U", " ", " ", "U"},
                {" ", "U", "U", " "}

        };

        char v = 'v';
        char V = 'V';

        String[][] letterV = {
                {"V", " ", "V", " "},
                {"V", " ", "V", " "},
                {"V", " ", "V", " "},
                {"V", " ", "V", " "},
                {" ", "V", " ", " "},
                {" ", " ", " ", " "}

        };

        char w = 'w';
        char W = 'W';

        String[][] letterW = {
                {"W", " ", "W", " "},
                {"W", " ", "W", " "},
                {"W", " ", "W", " "},
                {"W", " ", "W", " "},
                {"W", "W", "W", " "},
                {"W", " ", "W", " "}

        };

        char x = 'x';
        char X = 'X';

        String[][] letterX = {
                {"X", " ", " ", "X"},
                {"X", " ", " ", "X"},
                {" ", "X", "X", " "},
                {" ", "X", "X", " "},
                {"X", " ", " ", "X"},
                {"X", " ", " ", "X"}

        };

        char y = 'y';
        char Y = 'Y';

        String[][] letterY = {
                {"Y", " ", "Y", " "},
                {"Y", " ", "Y", " "},
                {"Y", " ", "Y", " "},
                {" ", "Y", " ", " "},
                {" ", "Y", " ", " "},
                {" ", "Y", " ", " "}

        };

        char z = 'z';
        char Z = 'Z';

        String[][] letterZ = {
                {"Z", "Z", "Z", "Z"},
                {" ", " ", " ", "Z"},
                {" ", " ", "Z", " "},
                {" ", "Z", " ", " "},
                {"Z", " ", " ", " "},
                {"Z", "Z", "Z", "Z"}

        };

        char space = ' ';

        String[][] letterSpace = {
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}

        };


        String str = word;
        for (int i = 0, n = str.length(); i < n; i++) {
            char letter = str.charAt(i);
            //System.out.println(letter);
            if (Character.isLetter(letter) || letter == space) {
            } else System.out.println("Please enter only letters");
        }

        char [][] wordBanner = new char [(6)][(str.length()*4)];

        char [][] letterGrid = null;
        //String[] both = ObjectArrays.concat(first, second, String.class);
        int lastYIndex = 0;

        for (int i = 0, n = str.length(); i < n; i++) {
                char letter = str.charAt(i);
            switch(letter) {
                case 'A':
                case 'a':
                    letterGrid = letterA;
                    break;

                case 'B':
                case 'b':
                    letterGrid = letterB;
                    break;
                default:
                    break;

            }
            if (letter == a || letter == A) {
                //letterGrid = letterA;
                //printLetter(letterA);

                //System.arraycopy(letterA, 0, wordBanner, offset, letterA.length);
                //offset += letterA.length;
                //for (int ii = 0; ii < 6; ii++) wordBanner[ii] = letterA[ii];
            } else if (letter == b || letter == B) {
                //printLetter(letterB);
                //System.arraycopy(letterB, 0, wordBanner, offset, letterB.length);
                //for (int ii = 0; ii < 6; ii++) wordBanner[ii] = letterB[ii];
            } else if (letter == c || letter == C) {
                //printLetter(letterC);
                //System.arraycopy(letterC, 0, wordBanner, offset, letterC.length);
            } else if (letter == d || letter == D) {
                //printLetter(letterD);
                //System.arraycopy(letterD, 0, wordBanner, offset, letterD.length);
            } else if (letter == e || letter == E) {
                //printLetter(letterE);
                //System.arraycopy(letterE, 0, wordBanner, offset, letterE.length);
            } else if (letter == f || letter == F) {
                //printLetter(letterF);
                //System.arraycopy(letterF, 0, wordBanner, offset, letterF.length);
            } else if (letter == g || letter == G) {
                //printLetter(letterG);
                //System.arraycopy(letterG, 0, wordBanner, offset, letterG.length);
            } else if (letter == h || letter == H) {
                //printLetter(letterH);
                //System.arraycopy(letterH, 0, wordBanner, offset, letterH.length);
            } else if (letter == xi || letter == XI) {
                //printLetter(letterI);
                //System.arraycopy(letterI, 0, wordBanner, offset, letterI.length);
            } else if (letter == j || letter == J) {
                //printLetter(letterJ);
                //System.arraycopy(letterJ, 0, wordBanner, offset, letterJ.length);
            } else if (letter == k || letter == K) {
                //printLetter(letterK);
                //System.arraycopy(letterK, 0, wordBanner, offset, letterK.length);
            } else if (letter == l || letter == L) {
                //printLetter(letterL);
                //System.arraycopy(letterL, 0, wordBanner, offset, letterL.length);
            } else if (letter == m || letter == M) {
                //printLetter(letterM);
                //System.arraycopy(letterM, 0, wordBanner, offset, letterM.length);
            } else if (letter == xn || letter == XN) {
                //printLetter(letterN);
                //System.arraycopy(letterN, 0, wordBanner, offset, letterN.length);
            } else if (letter == o || letter == O) {
                //printLetter(letterO);
                //System.arraycopy(letterO, 0, wordBanner, offset, letterO.length);
            } else if (letter == p || letter == P) {
                //printLetter(letterP);
                //System.arraycopy(letterP, 0, wordBanner, offset, letterP.length);
            } else if (letter == q || letter == Q) {
                //printLetter(letterQ);
                //System.arraycopy(letterQ, 0, wordBanner, offset, letterQ.length);
            } else if (letter == r || letter == R) {
                //printLetter(letterR);
                //System.arraycopy(letterR, 0, wordBanner, offset, letterR.length);
            } else if (letter == s || letter == S) {
                //printLetter(letterS);
                //System.arraycopy(letterS, 0, wordBanner, offset, letterS.length);
            }else if (letter == t || letter == T) {
                //printLetter(letterT);
                //System.arraycopy(letterT, 0, wordBanner, offset, letterT.length);
            }else if (letter == u || letter == U) {
                //printLetter(letterU);
                //System.arraycopy(letterU, 0, wordBanner, offset, letterU.length);
            }else if (letter == v || letter == V) {
                //printLetter(letterV);
                //System.arraycopy(letterV, 0, wordBanner, offset, letterV.length);
            }else if (letter == w || letter == W) {
                //printLetter(letterW);
                //System.arraycopy(letterW, 0, wordBanner, offset, letterW.length);
            }else if (letter == x || letter == X) {
                //printLetter(letterX);
                //System.arraycopy(letterX, 0, wordBanner, offset, letterX.length);
            }else if (letter == y || letter == Y) {
                //printLetter(letterY);
                //System.arraycopy(letterY, 0, wordBanner, offset, letterY.length);
            }else if (letter == z || letter == Z) {
                //printLetter(letterZ);
                //System.arraycopy(letterZ, 0, wordBanner, offset, letterZ.length);
            } else if (letter == space) {
                //printLetter(letterSpace);
                //System.arraycopy(letterSpace, 0, wordBanner, offset, letterSpace.length);
            }

            //CreateLineGrid(wordBanner, letterGrid, word.length());

            lastYIndex = AddLetterGrid(wordBanner, lastYIndex, letterGrid);

            //System.out.println(wordBanner[0].length);
            //System.out.println(wordBanner[1].length);

        }

        printLetter(wordBanner);

//        printLetter(letterA);
//        System.out.println();
//
//        printLetter(letterB);
//        System.out.println();
//
//        printLetter(letterC);
//        System.out.println();
//
//        printLetter(letterD);
//        System.out.println();
//
//        printLetter(letterE);
//        System.out.println();
//
//        printLetter(letterF);
//        System.out.println();
//
//        printLetter(letterG);
//        System.out.println();
//
//        printLetter(letterH);
//        System.out.println();
//
//        printLetter(letterI);
//        System.out.println();
//
//        printLetter(letterJ);
//        System.out.println();
//
//        printLetter(letterK);
//        System.out.println();
//
//        printLetter(letterL);
//        System.out.println();
//
//        printLetter(letterM);
//        System.out.println();
//
//        printLetter(letterN);
//        System.out.println();
//
//        printLetter(letterO);
//        System.out.println();
//
//        printLetter(letterP);
//        System.out.println();
//
//        printLetter(letterQ);
//        System.out.println();
//
//        printLetter(letterR);
//        System.out.println();
//
//        printLetter(letterS);
//        System.out.println();
//
//        printLetter(letterT);
//        System.out.println();
//
//        printLetter(letterU);
//        System.out.println();
//
//        printLetter(letterV);
//        System.out.println();
//
//        printLetter(letterW);
//        System.out.println();
//
//        printLetter(letterX);
//        System.out.println();
//
//        printLetter(letterY);
//        System.out.println();
//
//        printLetter(letterZ);
//        System.out.println();


//        for (int i = 0; i < letterS.length; i++) {
//            for (int j = 0; j < letterS[i].length; j++) {
//                System.out.print(letterS[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < letterO.length; i++) {
//            for (int j = 0; j < letterO[i].length; j++) {
//                System.out.print(letterO[i][j] + " ");
//            }
//            System.out.println();
//        }



//        letterS [0][0] = " ";
//        letterS [0][1] = "S";
//        letterS [0][2] = "S";
//        letterS [0][3] = "S";
//        letterS [1][0] = " ";
//        letterS [1][1] = "S";
//        letterS [1][2] = " ";
//        letterS [1][3] = " ";

        //System.out.println(letterS[0][1]);



//        for (int i=0; i < letterS.length; i++) {
//            for (int j=0; j < letterS.length; j++) {
//                //System.out.println("Enter a number.");
//                //int x = input.nextInt();
//                //letterS[i][j] = x;
//                System.out.print(letterS[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int i = 0; i<6; i++)
//            for(int j = 0; j<4; j++)
//
//
//        for(int i = 0; i<6; i++)
//        {
//            for(int j = 0; j<4; j++)
//            {
//                System.out.print(letterS[i][j]);
//            }
    }

    public static char [][] printLetter(char[][] letterGiven) {
        for (int i = 0; i < letterGiven.length; i++) {
            for (int j = 0; j < letterGiven[i].length; j++) {
                System.out.print(letterGiven[i][j] + " ");
            }
            System.out.println();

        } return letterGiven;

    }

//    private static void CreateLineGrid(String[][] wordBanner, String[][] letterGrid, int wordLength)
//    {
//        int xDimension = 6;
//        int yDimension = 4 * wordLength;
//        int lastIndex = 0;
//        for (int i = 0; i < wordLength; i++)
//        {
//            char letter = wordCharArray[i];
//            LetterGrid letterGrid = new LetterGrid(letter);
//            lastIndex = AddLetterGrid(lastIndex, letterGrid);
//        }
//    }

    private static int AddLetterGrid(char[][] wordBanner, int lastIndex, char[][] letterGrid)
    {
        int lastYIndex = 0;
        if (lastIndex > 0)
        {
            lastIndex++;
        }
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                lastYIndex = lastIndex + j;
                wordBanner[i][lastYIndex] = letterGrid[i][j];
            }
        }

        return lastYIndex;
    }
}
