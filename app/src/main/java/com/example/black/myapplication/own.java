package com.example.black.myapplication;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class own extends AppCompatActivity{

    private TextView nick;
    private Toolbar toolbar;
    private TextView textView;
    private TextView fabu;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener ( ) {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId ( )) {
                case R.id.navigation_home:
                    Intent intent = new Intent (own.this,MainActivity.class);
                    startActivity (intent);
                    return true;
                case R.id.navigation_dashboard:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView (R.layout.own);

//        toolbar = (Toolbar)findViewById (R.id.toolbar);
////        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById (R.id.own_menu);

        navigation.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener);


        nick=findViewById (R.id.nickname);
        nick.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(own.this,login.class);
                startActivityForResult (intent,1);
                //own.this.finish ();
            }
        });

        fabu = findViewById (R.id.fabu);
        fabu.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (own.this,Ball_activity.class);
                startActivity (intent);
                own.this.finish ();
            }
        });
    }

    @Override
    public void onActivityResult(int requestcode , int resultcode , Intent intent){
        if (requestcode == 1 && resultcode == 2){
            Bundle bundle = intent.getExtras();
            String data = bundle.getString ("username");
            nick.setText (data);

        }
    }


}
