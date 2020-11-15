package com.martinnnachi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tests {

    public int divide(int a, int b) {
        return a / b;
    }

    public String product() {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter first number: " );
        int a = scanner.nextInt();
        System.out.println( "Enter second number: " );
        int b = scanner.nextInt();

        return "The product of " + a + " and " + b + " is: " + (a * b);
    }

    public String calculations(int a, int b) {
        return (a + b) + "\n" + (a - b) + "\n" + (a * b) + "\n" + (a / b) + "\n" + (a % b);
    }

    public void timesTable() {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter Number: " );
        int num = scanner.nextInt();
        if (num <= 0 || num > 12) {
            System.out.println( "Please enter a number between 1 - 12" );
        } else {
            for (int i = 0; i < 12; i++) {
                System.out.println( num + " x " + (i + 1) + " = " + (num * (i + 1)) );
            }
        }
    }

    public String areaAndPerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);

        return "Area is: " + area + "\n" + "Perimeter is: " + perimeter;
    }

    public double average() {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter first number: " );
        float num1 = scanner.nextInt();
        System.out.println( "Enter second number: " );
        float num2 = scanner.nextInt();
        System.out.println( "Enter third number: " );
        float num3 = scanner.nextInt();

        return (num1 + num2 + num3) / 3;
    }

    public String areaOfRectangle(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);

        return "Area is: " + area + "\n" + "Perimeter is: " + perimeter;
    }

    public String swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        return "a is: " + a + ", b is: " + b;
    }

    public void compareNumbers() {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter first number: " );
        int num1 = scanner.nextInt();
        System.out.print( "Enter second number: " );
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.printf( "%d == %d\n", num1, num2 );
        }
        if (num1 > num2) {
            System.out.printf( "%d > %d\n", num1, num2 );
        }
        if (num1 < num2) {
            System.out.printf( "%d < %d\n", num1, num2 );
        }
        if (num1 <= num2) {
            System.out.printf( "%d <= %d\n", num1, num2 );
        }
        if (num1 >= num2) {
            System.out.printf( "%d >= %d\n", num1, num2 );
        }
        if (num1 != num2) {
            System.out.println( num1 + " != " + num2 );
        }

    }

    public double areaHexagon(int side) {
        return (6 * (side * side)) / (4 * Math.tan( Math.PI / 6 ));
    }

    public double areaOfPolygon() {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter number of sides: " );
        int side = scanner.nextInt();
        System.out.print( "Enter length of one side: " );
        int length = scanner.nextInt();

        return (side * (length * length)) / (4 * Math.tan( Math.PI / side ));
    }

    public double distance() {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter latitude of coordinate 1: " );
        double lat1 = input.nextDouble();
        System.out.print( "Enter longitude of coordinate 1: " );
        double lon1 = input.nextDouble();
        System.out.print( "Enter latitude of coordinate 2: " );
        double lat2 = input.nextDouble();
        System.out.print( "Enter longitude of coordinate 2: " );
        double lon2 = input.nextDouble();

        lat1 = Math.toRadians( lat1 );
        lon1 = Math.toRadians( lon1 );
        lat2 = Math.toRadians( lat2 );
        lon2 = Math.toRadians( lon2 );
        double RADIUS = 6371.01;


        return RADIUS * Math.acos( Math.sin( lat1 ) * Math.sin( lat2 ) + Math.cos( lat1 ) * Math.cos( lat2 ) * Math.cos( lon1 - lon2 ) );
    }

    public void reverseString() {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter string: " );
        char[] word = input.nextLine().toCharArray();

        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print( word[i] );
        }
    }

    public void reverseString2() {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter string: " );
        String str = input.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt( i );
        }
        System.out.print( "Reversed String is: " );
        System.out.print( reverse );

    }

    public void count(String x) {
        char[] chars = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter( chars[i] )) {
                letter++;
            } else if (Character.isDigit( chars[i] )) {
                num++;
            } else if (Character.isSpaceChar( chars[i] )) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println( "The String is: " + x );
        System.out.println( "Letter: " + letter );
        System.out.println( "Space: " + space );
        System.out.println( "Number: " + num );
        System.out.println( "Other: " + other );
    }

    public void threeDigits() {
        int amount = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        amount++;
                    }
                }
            }
        }
        System.out.println( "Total number of 3-digit numbers is " + amount );
    }

    public void oddNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println( i );
            }
        }
    }

    public void checkEven() {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter number: " );
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println( 1 );
        } else {
            System.out.println( 0 );
        }
    }

    public void divisible(int num) {

        System.out.println( "\nDivided by 3: " );
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) System.out.print( i + ", " );
        }
        System.out.println( "\n\nDivided by 5: " );
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) System.out.print( i + ", " );
        }

        System.out.println( "\n\nDivided by 3 & 5: " );
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) System.out.print( i + ", " );
        }
    }

    public boolean testRightmostDigit(int a, int b, int c) {

        int rightA = a % 10;
        int rightB = b % 10;
        int rightC = c % 10;

        return (rightA == rightB) || (rightB == rightC) || (rightA == rightC);
    }

    public void convertSeconds() {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter seconds: " );
        int seconds = input.nextInt();
        int sec = seconds % 60;
        int hr = seconds / 60;
        int min = hr % 60;
        hr = hr / 60;
        System.out.println( hr + ": " + min + ": " + sec );
    }

    public void range() {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter first number range:  " );
        int a = input.nextInt();
        System.out.print( "Enter second number range: " );
        int b = input.nextInt();
        System.out.print( "Enter divisible number: " );
        int p = input.nextInt();

        for (int i = a; i >= a && i <= b; i++) {
            if (i % p == 0) {
                System.out.println( i );
            }
        }
    }

    public void capitalize() {  // not printing, will come back to it
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter sentence: " );
        String line = input.nextLine();
        String uppercaseLine = "";
        Scanner lineScan = new Scanner( line );
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            uppercaseLine += Character.toUpperCase( word.charAt( 0 ) ) + word.substring( 1 ) + " ";
        }
        System.out.println( uppercaseLine.trim() );

//        String sentence = "my name is martin nnachi and i am a software developer";
//        char[] y = sentence.toCharArray();
//        int size = y.length;
//
//        y[0] = (char) (y[0] - 32);
//        int i = 1;
//        while (i != size) {
//            if (y[i] == ' ') {
//                y[i + 1] = (char) (y[i + 1] - 32);
//                ++i;
//            }
//        }
//        System.out.println( sentence );
    }

    public void reverseWord(String word) {
        word = word.trim();
        String result = "";
        char[] chars = word.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        System.out.println( result.trim() );
    }


    public boolean sameDigit() { // REVIEW CODE
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter number between 25 and 75: " );
        System.out.print( "Enter first number: " );
        int numberOne = input.nextInt();
        System.out.print( "Enter second number: " );
        int numberTwo = input.nextInt();
        if ((numberOne < 25 || numberTwo > 75)) {
            System.out.println( "Please enter valid numbers between 25 and 75: " );
        }

        int firstDigitOne = numberOne / 10;
        int lastDigitOne = numberOne % 10;
        int firstDigitTwo = numberTwo / 10;
        int lastDigitTwo = numberTwo % 10;
        return (firstDigitOne == firstDigitTwo) || (lastDigitOne == lastDigitTwo) || (firstDigitOne == lastDigitTwo) || (lastDigitOne == firstDigitTwo);
    }

    public void penultimate() {
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter new sentence: " );
        String line = input.nextLine();
        String[] words = line.split( "[ ]+" );
        System.out.println( "Penultimate word is: " + words[words.length - 2] );
    }

    public int compareTwoNumbers(int first, int second) {


        if (first == second) {
            return 0;
        } else if (first % 6 == second % 6) {
            return Math.min( first, second );
        }
        return Math.max( first, second );
    }

    public void primeNumberSum() {
        int sum = 1;
        int range = 0;
        int num = 0;
        while (range < 100) {
            num++;
            if (num % 2 != 0) {
                if (isPrime( num )) {
                    sum += num;

                }
            }
            range++;
        }
        System.out.println( "The sum of the prime numbers till 100: " + sum );
    }

    public boolean isPrime(int number) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                break;
            } else {
                System.out.println( primeList.add( i ) );
            }
        }
        return true;
    }

    public void stringTest(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        String result = "";
        result += (len1 >= 1) ? str1.charAt( 0 ) : '#';
        result += (len2 >= 1) ? str2.charAt( len2 - 1 ) : '#';
        System.out.println( result );
    }

    public boolean intArrayTestTen() {
        int[] intArray = {10, -20, 0, 30, 40, 60, 10};
        int len = intArray.length;
        boolean ten;

        if (len < 2) {
            return false;
        }

        return (intArray[0] == 10 || intArray[len - 1] == 10);

    }

    public void twoArrays() {
        int[] intArrayOne = {50, -20, 0, 30, 40, 60, 12};
        int[] intArrayTwo = {12, 20, 10, 20, 30, 50, 11};

        int len1 = intArrayOne.length;
        int len2 = intArrayTwo.length;

        if (len1 >= 2 && len2 >= 2) {
            System.out.println( intArrayOne[0] == intArrayTwo[len2 - 1] || intArrayTwo[0] == intArrayOne[len1 - 1] );
        }


    }

    public int[] newArrayList() {
        int[] arrayOne = {50, -20, 0};
        int[] arrayTwo = {5, -50, 10};
        int[] newArray = new int[2];

        int len2 = arrayTwo.length;

        newArray[0] = arrayOne[0];
        newArray[1] = arrayTwo[len2 - 1];

        return newArray;
    }

    public boolean findNumberInArray() {
        int[] array = {5, 6};
        for (int value : array) {
            if (value == 4 || value == 7) {
                return true;
            }
        }
        return false;
    }

//    public int findIndex(int[] array, int number) {
//        if (array == null) {
//            return -1;
//        }
//
//        int len = array.length;
//        int i = 0;
//        while (i < len) {
//            if (array[i] == number) {
//                return i;
//            } else {
//                i += 1;
//            }
//        }
//        return -1;
//    }

    public void largerValue() {
        int[] array = {20, 30, 40};
        int maxValue = array[0];
        if (array[2] >= maxValue) maxValue = array[2];
        System.out.println( "The larger value is: " + maxValue );
    }

    public void swapArray() {
        int[] array = new int[3];
        array[0] = 20;
        array[1] = 30;
        array[2] = 40;

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println( "New array after swapping is: " + Arrays.toString( array ) );
    }

    public void test82() {
        int[] array = {20, 30, 67, 50, 40};
        int maxValue = array[0];
        int mid = array[array.length / 2];
        if (maxValue <= array[array.length - 1]) {
            maxValue = array[array.length - 1];
        }
        if (maxValue <= mid) {
            maxValue = mid;
        }
        System.out.println( "Largest element between first, middle and last element is: " + maxValue );

    }

    public void test83() {
        int[] array1 = {2, 4, 7, -6};
        int[] array2 = {12, 8, 13, 5};
        StringBuilder result = new StringBuilder();

//        int[] newArray = new int[4];
//        newArray[0] = array1[0] * array2[0];
//        newArray[1] = array1[1] * array2[1];
//        newArray[2] = array1[2] * array2[2];
//        newArray[3] = array1[3] * array2[3];

        System.out.println( "\nArray1: " + Arrays.toString( array1 ) );
        System.out.println( "\nArray2: " + Arrays.toString( array2 ) );

        for (int i = 0; i < array1.length; i++) {
            int num1 = array1[i];
            int num2 = array2[i];
            result.append( num1 * num2 ).append( " " );
        }

        System.out.println( "\nResult: " + result );

    }

    public void lastThreeCharacters() {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter word: " );
        String word = input.nextLine();
        int stringLength = 3;
        if (stringLength > word.length()) {
            stringLength = word.length();
        }
        String subPart = word.substring( word.length() - 3 );
        System.out.println( subPart + word + subPart );
    }

    public void test86() {
        int count = 0;
        Scanner in = new Scanner( System.in );
        int number = in.nextInt();
        while (number != 1) {
            System.out.println( number );
            if (number % 2 == 0) {
                number /= 2;
                count += 1;
            } else {
                number = (3 * number + 1) / 2;
                count += 1;
            }
        }
        System.out.println( count );
        in.close();
    }

    public void readDigits() {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        try {
            int sum = 0;
            String str = br.readLine();
            char[] numStr = str.toCharArray();
            for (int i = 0; i < numStr.length; i++) {
                sum += numStr[i] - '0';
            }
            System.out.println( "Original Number: " + str );
            printNumber( sum );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printNumber(int n) {
        int x, y, z;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println( "Sum of digits of number: " + n );
        if (n < 10) {
            System.out.println( number[n] );
        } else if (n < 100) {
            x = n / 100;
            y = n - x * 10;
            System.out.println( "In English: " + number[x] + " " + number[y] );
        } else {
            x = n / 100;
            y = (n - x * 100) / 10;
            z = n - x * 100 - y * 10;
            System.out.println( "In English: " + number[x] + " " + number[y] + " " + number[z] );
        }
    }

    public boolean firstWord(String sentence) {
        return sentence.startsWith( "Hello" );
    }

    public void countEvenAndOdd() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int countEven = 0;
        int countOdd = 0;
        System.out.println( "Original Array: " + Arrays.toString( numbers ) );
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.printf( "\nNumber of even elements in the array: %d", countEven );
        System.out.printf( "\nNumber of odd elements in the array: %d", countOdd );
        System.out.println( "\n" );
    }

    public void find10and20() {
        int[] nums = {2, 5, 13, 10, 45, 20, 20, 67};
        System.out.println( "Original Array: " + Arrays.toString( nums ) );
        boolean found10 = false;
        boolean found20 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 10 && nums[i + 1] == 10) {
                found10 = true;
            } else if ((nums[i] == 20 && nums[i + 1] == 20)) {
                found20 = true;
            }
        }
        System.out.printf( String.valueOf( found10 != found20 ) );
        System.out.println( "\n" );
    }

    public void exercise95() {
        int n = 5;
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf( i );
        }
        System.out.println( "New Array: " + Arrays.toString( array ) );
    }

    public void checkNum() {
        int[] num = {12, 10, 5, 23, 20, 1};
        boolean test = false;
        int result = 0;
        int ten = 10;
        int twenty = 20;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == ten) {
                test = true;
            }
            if (test && num[i] == twenty) {
                System.out.printf( String.valueOf( true ) );
                result = 1;
            }
        }
        if (result == 0) {
            System.out.printf( String.valueOf( false ) );
        }
        System.out.printf( "\n" );
    }

    public boolean numAppearsThreeTimes() {
        int[] numbers = {1, 3, 1, 3, 1, 4};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                count++;
            }

            if ((numbers[i] == 3) && (numbers[i + 1] == 3)) {
                return false;
            }
        }
        return count == 3;
    }

    public boolean exercise101() {
        int[] array = {20, 12, 10, 67, 10, 43, 10, 20, 13, 10, 20};
        int tens = 0;
        int twenties = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                tens++;
            }
            if (array[i] == 20) {
                twenties++;
            }
        }
        if (tens > twenties) {
            System.out.println( "Tens appears more than twenties" );
            return true;
        }
        System.out.println( "Tens do not appear more than twenties" );
        return false;
    }

    public boolean exercise102() {
        int[] array = {12, 30, 40, 277, 10};

        for (int j : array) {
            if (j == 10 || j == 30) {
                return true;
            }
        }
        return false;
    }

    public void exercise103() {
        int[] array1 = {11, 10, 13, 10, 45, 20, 33, 53};
        int length = array1.length - 1;
        int[] array2 = new int[0];
        while (array1[length] != 10) {
            length--;
            array2 = new int[array1.length - 1 - length];
            for (int i = length + 1; i < array1.length; i++) {
                array2[i - length - 1] = array1[i];
            }
        }
        System.out.println( "New Array = " + Arrays.toString( array2 ) );
    }

    public void exercise105() {
        int[] array = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println( "Original Array: " + Arrays.toString( array ) );

        int result = 0;
        int l = 2;
        int start = 0;
        int end = array.length - l;
        for (; l > 0; l--) {
            if (array[start] != array[end]) {
                result = 1;
            } else {
                start++;
                end++;
            }
        }
        System.out.print( result != 1 );
        System.out.print( "\n" );
    }
}

