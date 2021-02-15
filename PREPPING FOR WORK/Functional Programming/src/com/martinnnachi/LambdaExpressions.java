package com.martinnnachi;

import java.util.function.Function;

public class LambdaExpressions {
    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x; //Ternary Operator

        System.out.println(absoluteValue.apply( -110 ));
    }
}
