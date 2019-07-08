package com.example.lynn.pong;

import static com.example.lynn.pong.MainActivity.*;

public class MyThread implements Runnable {

    private void pause(double seconds) {
        try {
            Thread.sleep((int)(seconds*1000));
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    @Override
    public void run() {

    }

}
