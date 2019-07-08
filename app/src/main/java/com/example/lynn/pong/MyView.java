package com.example.lynn.pong;

import android.content.Context;
import android.widget.RelativeLayout;

import static com.example.lynn.pong.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        setWillNotDraw(false);
    }

}
