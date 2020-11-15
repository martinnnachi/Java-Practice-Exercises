package com.martinnnachi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        Tests tests = new Tests();
        System.out.println( tests.divide( 50, 3 ) );
//        System.out.println(tests.product());
        System.out.println( tests.calculations( 125, 24 ) );
//        tests.timesTable();
        System.out.println( (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5) );
        System.out.println( tests.areaAndPerimeter( 7.5 ) );
        System.out.println( "========================" );
//        System.out.println(tests.average());
        System.out.println( tests.areaOfRectangle( 5.6, 8.5 ) );
        System.out.println( tests.swap( 23, 4 ) );
        System.out.println();
        System.out.println( System.getProperty( "java.version" ) );
        System.out.println( System.getProperty( "java.runtime.version" ) );
        System.out.println( System.getProperty( "java.home" ) );
        System.out.println( System.getProperty( "java.vendor.url" ) );
        System.out.println();
//        tests.compareNumbers();
        System.out.println();
//        System.out.println(tests.areaHexagon( 6 ));
//        System.out.println(tests.areaOfPolygon());
//        System.out.println(tests.distance());
        System.out.println();
//        tests.reverseString2();
        tests.count( "Hello, my name is martin and i'm 40 years old. How old are you??" );
        System.out.println();
        tests.threeDigits();

//        for (String string: Charset.availableCharsets().keySet()){
//            System.out.println(string);
//        }

//        Console cons;
//        if ((cons = System.console()) != null) {
//            char[] pass_word = null;
//            try {
//                pass_word = cons.readPassword( "Input your password: " );
//                System.out.println( "Your password is: " + new String( pass_word ) );
//            } finally {
//                if (pass_word != null) {
//                    Arrays.fill( pass_word, ' ' );
//                }
//            }
//        } else {
//            throw new RuntimeException( "Cannot retrieve password...No console" );
//        }

//        int n;
//        char s1, s2, s3;
//        Scanner in = new Scanner( System.in );
//        System.out.print( "Input number: " );
//        n = in.nextInt();
//        System.out.printf( "%d + %d%d + %d%d%d\n", n, n, n, n, n, n );

        System.out.format( "\ncurrent date time: %tc%n\n", System.currentTimeMillis() );

//        tests.oddNumbers( 99 );
//        tests.checkEven();
        tests.divisible( 100 );
        System.out.println( "\n" );

//        String number;
//        Scanner scanner = new Scanner( System.in );
//        System.out.print("Enter a number(String): ");
//        number = scanner.nextLine();
//
//        int convert = Integer.parseInt( number );
//        System.out.println("The integer value is: " + convert);

        System.out.println( tests.testRightmostDigit( 5, 10, 15 ) );
        System.out.println();
//        tests.convertSeconds();
        System.out.println();
//       tests.range();


//        String x = "my name is gloria giramiya and i am a software developer";
//        char[] y = x.toCharArray();
//        int size = y.length;
//
//        y[0] = (char) (y[0] - 32);
//        int i = 1;
//        while (i != size) {
//            if (y[i] == ' ') {
//                y[i + 1] = (char) (y[i + 1] - 32);
//                i++;
//            }
//        }
//        System.out.println( x );
//        System.out.println(y);

//        tests.reverseWord( "swert" );
//        System.out.println();
//        System.out.println(tests.sameDigit());
        System.out.println();
//        tests.capitalize();
//        tests.penultimate();
        System.out.println();
        System.out.println( tests.compareTwoNumbers( 18, 42 ) );
        System.out.println();
        tests.primeNumberSum();

        String str1 = "Python";
        String str2 = "Tutorial";

        System.out.println( str1.substring( 1 ) + str2.substring( 1 ) );

        System.out.println();

        String str = "nnachi";
        int len = str.length();
        if (len >= 3) {
            System.out.println( str.substring( 0, 3 ) );
        } else if (len == 1) {
            System.out.println( str.charAt( 0 ) + "##" );
        } else {
            System.out.println( "###" );
        }


        tests.stringTest( "Python", "" );

        System.out.println( tests.intArrayTestTen() );
        System.out.println( "===============" );
        tests.twoArrays();
        System.out.println( "===============" );
        System.out.println( Arrays.toString( tests.newArrayList() ) );
        System.out.println( "===============" );
        System.out.println( tests.findNumberInArray() );
        System.out.println( "===============" );
        tests.largerValue();
        System.out.println( "===============" );
        tests.swapArray();
        System.out.println( "===============" );
        tests.test82();
        System.out.println( "===============" );
        tests.test83();
//        tests.lastThreeCharacters();
//        tests.test86();
        System.out.println( "===============" );
        tests.printNumber( 754 );
        System.out.println( "\nCurrent system environment" );
        System.out.println( System.getenv() );
        System.out.println( "\n\nCurrent system properties" );
        System.out.println( System.getProperties() );
        System.out.println( "===============" );
        System.out.println( tests.firstWord( "Hello how are you?" ) );
        System.out.println( "===============" );
        tests.countEvenAndOdd();
        System.out.println( "===============" );
        tests.find10and20();
        System.out.println( "===============" );
        tests.exercise95();
        System.out.println( "===============" );
        tests.checkNum();
        System.out.println( "===============" );
        System.out.println( "Checking if a value appears 3 times and not next to each other: " + tests.numAppearsThreeTimes() );
        System.out.println( tests.exercise101() );
        System.out.println( "===============" );
        System.out.println( tests.exercise102() );
        System.out.println( "===============" );
        tests.exercise103();
        System.out.println( "===============" );
        tests.exercise105();


    }


}
