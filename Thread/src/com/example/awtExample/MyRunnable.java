package com.example.awtExample;

import static com.example.awtExample.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRnnable's implementation.");
    }
}
