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

        setBackgroundColor(0xFF8F0000);
    }

    public boolean hasCollided() {
        LayoutParams layoutParams = (LayoutParams)getLayoutParams();

        int starty = layoutParams.topMargin;
        int stopy = starty + 400;

        if (left) {
            if (center.y >= starty && center.y <= stopy && center.x-50 <= 50) {
                return(true);
            }
        } else {
            if (center.y >= starty && center.y <= stopy && center.x+50 >= width-50) {
                return(true);
            }
        }

        return(false);
    }

}
