package com.martinnnachi;

public class Recursion {
    public static void main(String[] args) {
        printFactorial( 1 );
        printFib( 4 );

        int[] array1 = {2,34,5,67,9};
        System.out.println(arraySum( array1 ));

    }


    public static int factorial(int n) {
        if (n >= 1) {
            return n * factorial( n - 1 );
        } else {
            return 1;
        }
    }

    public static void printFactorial(int n) {
        int fact = factorial( n );
        System.out.println( "The result is: " + fact );
    }

    public static int fib(int n) {
        if (n >= 3) {
            return fib( n - 1 ) + fib( n - 2 );
        } else {
            return 1;
        }
    }

    public static void printFib(int n) {
        int fibo = fib( n );
        System.out.println( "Result of the fibonacci sequence is: " + fibo );
    }

    public static int arraySum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += i;
        }
        return total;
    }

    public static void printArraySum(int[] array) {
        for(int x : array) {
            System.out.println(x);
        }
    }
}
