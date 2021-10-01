package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculateScore(32, true );

    }

    public static void calculateScore(int score) {
        System.out.println("calculate Score " + score);
    }

    public static void  calculateScore(double score) {
        System.out.println(score);
    }

    public static int calculateScore(int score, boolean isSecond) {
        return score;
    }
}
