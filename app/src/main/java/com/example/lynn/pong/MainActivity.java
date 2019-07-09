package com.example.lynn.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static int width;
    public static int height;
    public static Bar leftBar;
    public static Bar rightBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MediaPlayer mp = MediaPlayer.create(this,R.raw.bounce);

        mp.start();

        setContentView(myView = new MyView(this));
    }
}
