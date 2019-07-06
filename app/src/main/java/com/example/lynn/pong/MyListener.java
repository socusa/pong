package com.example.lynn.pong;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import static com.example.lynn.pong.MainActivity.*;

public class MyListener implements View.OnTouchListener {

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)view.getLayoutParams();


        return (true);
    }

}
