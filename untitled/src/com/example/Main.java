package com.example;

public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
	// write your code here
        new Thread1().start();
        new Thread2().start();

    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (Main.lock1) {
                System.out.println("Thread 1: Has lock1");
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 1: Waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Has lock1 and lock2");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("Thread 1: Realesed lock 1. Exiting ...");
        }
    }

    private static class Thread2 extends Thread {
        public void run () {
            synchronized (lock1) {
                System.out.println("Thread2: has lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 2: Waiting for lock1");
                synchronized (lock2) {
                    System.out.println("Thread 2: Has lock2 and lock1");
                }
                System.out.println("Thread 2: release lock1");
            }
            System.out.println("Thread 2: Released lock2. Exiting ..");
        }
    }
}

