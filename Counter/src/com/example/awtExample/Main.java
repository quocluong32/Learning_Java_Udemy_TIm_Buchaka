package com.example.awtExample;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CountDown countDown = new CountDown();

        CountdownThread t1 = new CountdownThread(countDown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countDown);
        t1.setName("Thread 2");

        t1.start();
        t2.start();
    }

}

class CountDown {
    private int i;
    public synchronized void doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.PURPLE;
                break;
            default:
                color = ThreadColor.GREEN;
        }

        synchronized (this) {
            for(i = 10; i > 0; i--) {
                System.out.println(color  + Thread.currentThread().getName() + ": i = " + i);
            }
        }

    }
}

class CountdownThread extends Thread {
    private CountDown threadCountdown;

    public CountdownThread(CountDown countDown) {
        threadCountdown = countDown;
    }

    public void run () {
        threadCountdown.doCountdown();
    }
}
