package com.example.awtExample;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("Olynpian", 8, 12);
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry.");
        }

        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry.");
        }
    }
}
