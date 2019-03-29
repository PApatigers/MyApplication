package com.example.black.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ball_activity extends Activity{

    @Override
    protected  void onCreate(Bundle sa){
        super.onCreate (sa);
        setContentView (R.layout.ball);

        LinearLayout linearLayout = findViewById (R.id.ball_dock);
        final Ball drawView = new Ball (this);
        drawView.setMinimumHeight (500);
        drawView.setMinimumWidth (300);
        linearLayout.addView (drawView);

    }
}
