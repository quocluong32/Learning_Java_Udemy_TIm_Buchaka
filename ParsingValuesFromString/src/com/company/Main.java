package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "202342";

        int number = Integer.parseInt(numberAsString);
        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println(numberAsString.getClass().getSimpleName());
        System.out.println(((Object)number).getClass().getName());
        System.out.println(((Object)numberDouble).getClass().getName() );
    }
}
