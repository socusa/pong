package com.example.lynn.pong;

import static com.example.lynn.pong.MainActivity.*;

public class MyThread implements Runnable {
    private Thread thread;
    private boolean keepGoing;

    public MyThread() {
        thread = new Thread(this);

        keepGoing = true;

        thread.start();
    }

    private void pause(double seconds) {
        try {
            Thread.sleep((int)(seconds*1000));
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    public void stop() {
        keepGoing = false;
    }

    @Override
    public void run() {
        while (keepGoing) {
            if (left)
                center.x -= distancex;
            else
                center.x += distancex;

            if (up)
                center.y -= distancey;
            else
                center.y += distancey;

            if (leftBar.hasCollided() || rightBar.hasCollided()) {
                distancex = 20 + (int)(10*Math.random());

                left = !left;
            }

            if (center.y - 50 <= 0 || center.y + 50 >= height-170) {
                distancey = 20 + (int)(10*Math.random());

                up = !up;
            }

            myView.post(new Runnable() {

                @Override
                public void run() {
                    myView.invalidate();
                }

            });

            pause(0.02);
        }

    }

}
