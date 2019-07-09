package com.example.lynn.pong;

import android.content.Context;
import android.graphics.Point;
import android.widget.RelativeLayout;

import static com.example.lynn.pong.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        Point size = Util.sizeOfScreen(context);

        width = size.x;
        height = size.y;

        leftBar = new Bar(context,0,100);
        rightBar = new Bar(context,width-50,100);

        leftBar.setOnTouchListener(listener);
        rightBar.setOnTouchListener(listener);

        addView(leftBar);
        addView(rightBar);

        setWillNotDraw(false);
    }

}
