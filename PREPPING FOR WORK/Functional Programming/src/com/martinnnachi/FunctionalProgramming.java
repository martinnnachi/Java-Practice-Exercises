package com.martinnnachi;

import java.util.function.Function;

public class FunctionalProgramming {
    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        int result = myTriple.apply( 8 );
        System.out.println( result );
    }

    protected static class MyMath {
        public static int triple(int number) {
            return number * 3;
        }
    }
}
