package com.example.lynn.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static int width;
    public static int height;
    public static Bar leftBar;
    public static Bar rightBar;
    public static Point center;
    public static MyThread myThread;
    public static boolean left;
    public static boolean up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MediaPlayer mp = MediaPlayer.create(this,R.raw.bounce);

        mp.start();

        setContentView(myView = new MyView(this));
    }

    public void onDestroy() {
        super.onDestroy();

        myThread.stop();
    }
}
