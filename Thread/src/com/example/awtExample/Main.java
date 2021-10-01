package com.example.awtExample;

import static com.example.awtExample.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_PURPLE + "Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread == ");

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "anonymous class's implementation of myRunnableThread");
                try {
                    anotherThread.start();
                    anotherThread.join(6000);
                    System.out.println(ANSI_RED + "Another terminated, or time out so I'm running again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");

    }
}
