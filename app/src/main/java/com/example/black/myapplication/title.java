package com.example.black.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.jar.Attributes;

public class title extends LinearLayout {

    Button btnLeft;
    TextView textView;

    public title(Context content , Attributes attributes){
        super(content, (AttributeSet) attributes);
        init(content);
    }

    private void init(final Context context) {
        LayoutInflater.from(context).inflate(R.layout.title_bar, this);
        btnLeft = (Button) findViewById(R.id.btn_left);
        //btnRight = (Button) findViewById(R.id.btn_right);
        textView = (TextView) findViewById(R.id.title);

        btnLeft.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
