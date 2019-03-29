package com.example.black.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener ( ) {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId ( )) {
                case R.id.navigation_home:
                    mTextMessage.setText (R.string.title_home);
                    MainActivity.this.finish ();
                    return true;
                case R.id.navigation_dashboard:
                    Intent intent = new Intent (MainActivity.this , own.class);
                    startActivity (intent);
                    MainActivity.this.finish ();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

//        LinearLayout linearLayout = findViewById (R.id.ball_dock);
//        final Ball drawView = new Ball (this);
//        drawView.setMinimumHeight (500);
//        drawView.setMinimumWidth (300);
//        linearLayout.addView (drawView);

        mTextMessage = (TextView) findViewById (R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById (R.id.navigation);
        navigation.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener);
    }

}
