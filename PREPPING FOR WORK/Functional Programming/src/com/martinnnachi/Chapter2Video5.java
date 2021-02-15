package com.martinnnachi;

import java.util.function.BiFunction;

public class Chapter2Video5 {
    public static void main(String[] args) {
        System.out.println( MyMath.combine2and3( MyMath::add ) );
        System.out.println( MyMath.combine2and3( MyMath::subtract ) );
        System.out.println( MyMath.combine2and3( (x, y) -> 2 * x + 2 * y ) );

    }

    private static class MyMath {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int combine2and3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply( 2, 3 );
        }
    }
}
