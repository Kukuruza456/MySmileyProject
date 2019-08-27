package com.example.mysmileyproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import java.util.jar.Attributes;

public class SmileyView extends AppCompatImageView {
    private Paint pinsel;

    public SmileyView(Context context) {
        super(context);

    }

    public SmileyView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pinsel = new Paint();
        pinsel.setColor(Color.rgb(255,0,0));
        pinsel.setStrokeWidth(5);

        canvas.drawLine(0,0,getWidth(),getHeight(), pinsel);
        canvas.drawCircle(getWidth()/2,getHeight()/2,150,pinsel);

    }
}
