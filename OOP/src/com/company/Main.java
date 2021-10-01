package com.company;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        

        Car porches = new Car();
        Car holden = new Car();
        porches.setModel("Carrera");
        System.out.println(porches.getModel());
    }
}
