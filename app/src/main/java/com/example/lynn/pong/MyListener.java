package com.example.lynn.pong;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import static com.example.lynn.pong.MainActivity.*;

public class MyListener implements View.OnTouchListener {
    public float offsetX;
    public float offsetY;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)view.getLayoutParams();

        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            offsetY = motionEvent.getRawY() - params.topMargin;
        } else if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
            params.topMargin = (int)(motionEvent.getRawY() - offsetY);

            view.setLayoutParams(params);
        }

        return (true);
    }

}
