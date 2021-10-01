package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("AnotherValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("AnotherValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("myIntArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("myIntArray= " + Arrays.toString(anotherArray));
        modifyArray(myIntArray);
        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("myIntArray= " + Arrays.toString(anotherArray));
    }

    private static void modifyArray (int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }

}