package com.example.lynn.pong;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.widget.RelativeLayout;

import static com.example.lynn.pong.MainActivity.*;

public class MyView extends RelativeLayout {
    private Paint paint;

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

        paint = new Paint();

        paint.setColor(0xFF000000);

        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(center.x,center.y,50,paint);
    }

}
