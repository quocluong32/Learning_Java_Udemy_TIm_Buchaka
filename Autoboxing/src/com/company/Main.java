package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 11; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i < 11; i++) {
            System.out.println(intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;
        int myInt = myIntValue;
        myInt = 50;
        System.out.println(myInt);
        System.out.println(myIntValue);

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl < 10; dbl+= 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(myDoubleValues.get(i));
        }
    }
}
