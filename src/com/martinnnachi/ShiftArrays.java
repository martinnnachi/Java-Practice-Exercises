package com.martinnnachi;

import java.util.ArrayList;

public class ShiftArrays {
    public static void main(String[] args) {
        int[] oldArray = {11, 15, 13, 10, 45, 20};
        int[] newArray = shiftArrayLeft( oldArray );
        printArray( newArray );

        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add( "martin" );
        list.add("Glo");
        System.out.println(list.get( 1 ));

    }

    public static int[] shiftArrayLeft(int[] array1) {
        int[] array2 = new int[array1.length];
        for (int i = 1; i < array1.length; i++) {
            array2[i - 1] = array1[i];
        }
        array2[array1.length - 1] = array1[0];
        return array2;
    }

    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.print( x + "," );
        }
    }
}
