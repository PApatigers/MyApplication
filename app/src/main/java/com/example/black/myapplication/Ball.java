package com.example.black.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.jar.Attributes;

public class Ball extends View {

    Paint p = new Paint ();
    public float c_x = 40;
    public float c_y = 50;

    public Ball(Context context){
        super(context);
        Log.e("tag","执行1");
    }
    public Ball(Context context , Attributes set){
        super(context, (AttributeSet) set);
        Log.e("tag","执行2");
    }
    public Ball(Context context , Attributes set , int a ){
        super(context, (AttributeSet) set,a);
        Log.e("tag","执行3");}

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw (canvas);

        //绘制小球
        p.setColor (Color.BLACK);
        canvas.drawCircle (c_x,c_y,15,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        this.c_x =  motionEvent.getX ();
        this.c_y = motionEvent.getY ();
        this.invalidate ();
        return true;
    }
}
