package com.martinnnachi;

import java.util.function.BiFunction;

public class BiFunctionalProgramming {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println( add.apply( 23, 78 ) );

        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println( addThree.apply( 23, 79, 234 ) );

        NoArgFunction<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.apply());

    }

}
