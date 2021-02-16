package com.martinnnachi;

import java.util.function.Function;

public class ReturningFunctions {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Hello Functional!";

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println( greeter.apply() );

        Function<Integer, Integer> timesTwo = MyMath.createMultiplier( 2 );
        Function<Integer, Integer> timesThree = MyMath.createMultiplier( 3 );
        Function<Integer, Integer> timesFour = MyMath.createMultiplier( 4 );

        System.out.println(timesTwo.apply( 6 ));
        System.out.println(timesThree.apply( 6 ));
        System.out.println(timesFour.apply( 6 ));
    }

    protected static class MyMath {
        protected static int timesTwo(int x) {
            return x * 2;
        }

        protected static int timesThree(int x) {
            return x * 3;
        }

        protected static int timesFour(int x) {
            return x * 4;
        }

        public static Function<Integer, Integer> createMultiplier(int y) { //creating functions on the fly
            return (Integer x) -> x * y;
        }
    }
}
