package com.martinnnachi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collecting {
    public static void main(String[] args) {

        String[] wordsArr = {"Hello", "dabus", "functional", "programming", "is", "cool"};

        List<String> words = new ArrayList<>( Arrays.asList( wordsArr ) );

        Map<Integer, List<String>> wordLengthMapOne = words
                .stream()
                .collect( Collectors.groupingBy( String::length ) ); // Method Reference
        System.out.println( wordLengthMapOne );

        Map<Boolean, List<String>> wordLengthMapTwo = words
                .stream()
                .collect( Collectors.partitioningBy( (word) -> word.length() > 5 ) );
        System.out.println(wordLengthMapTwo);
    }
}
