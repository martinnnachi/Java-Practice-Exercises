package com.martinnnachi;

public class Recursion {

    public static void main(String[] args) {
        countDown( 10 );
        System.out.println( "======" );
        countUp( 1 ,1000);
    }

    public static void countDown(int x) {
        if (x < 0) {
            System.out.println( "Done!" );
            return;
        }
        System.out.println( x );
        countDown( x - 1 );
    }

    public static void countUp(int x, int end) {
        if (x > end) {
            System.out.println( "Done!" );
            return;
        }

        System.out.println( x );
        countUp( x + 1, end );
    }
}
