package com.example.ctheobald;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(10));
        System.out.println(factorial(12));
        System.out.println(factorial(15));
//        System.out.println(factorial(26));

        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(11));
        System.out.println(fibonacci(12));
//        System.out.println(fibonacci(100));

    }

    public static long factorial(long n) {
        if (n<=1) {
            return 1;
        }

        long m = n-1;

        while(m > 1) {
            n = n * m;
            m--;
        }
        return n;
    }

    public static long fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }

    }


}
