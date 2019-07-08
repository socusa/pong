package com.example.lynn.pong;

import android.content.Context;
import android.widget.RelativeLayout;

import static com.example.lynn.pong.MainActivity.*;

public class Bar extends RelativeLayout {

    public Bar(Context context,
               int startx,
               int starty) {
        super(context);

        LayoutParams layoutParams = new LayoutParams(50,400);

        layoutParams.leftMargin = startx;
        layoutParams.topMargin = starty;

        setLayoutParams(layoutParams);
    }

    public boolean hasCollided() {
        LayoutParams layoutParams = (LayoutParams)getLayoutParams();

        int starty = layoutParams.topMargin;
        int stopy = starty + 400;

        return(false);
    }

}
