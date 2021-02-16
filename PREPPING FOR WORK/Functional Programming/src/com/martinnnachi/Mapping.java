package com.martinnnachi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] wordsArr = {"Hello", "functional", "programming", "is", "cool"};
        List<Integer> listOfIntegers = new ArrayList<>( Arrays.asList( intArray ) );
        List<String> words = new ArrayList<>( Arrays.asList( wordsArr ) );

        Function<Integer, Integer> timesTwo = (x) -> x * 2;
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        };

        Predicate<String> isLongerThan3 = (createLengthTest.apply( 3 ));
        Predicate<String> isLongerThan5 = (createLengthTest.apply( 5 ));

        List<String> longerThan5 = words
                .stream()
                .filter( isLongerThan3 )
                .collect( Collectors.toList());

        System.out.println("Words longer than 5 characters are: " + longerThan5);

        List<Integer> evens = listOfIntegers
                .stream()
                .filter( isEven )
                .collect( Collectors.toList() );
        System.out.println( "Evens: " + evens );

        List<Integer> doubled = listOfIntegers
                .stream()
                .map( timesTwo )
                .collect( Collectors.toList() );
        System.out.println( "Doubled: " + doubled );
    }
}
