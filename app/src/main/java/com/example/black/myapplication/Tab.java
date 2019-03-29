package com.example.black.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class Tab extends FragmentActivity {
    private FragmentTabHost fragmentTabHost;

    @Override
    protected void onCreate(Bundle saveinstace){
        super.onCreate (saveinstace);
        setContentView (R.layout.test_tab);

        fragmentTabHost = (FragmentTabHost)findViewById (android.R.id.tabhost);
        fragmentTabHost.setup (this,getSupportFragmentManager (),R.id.realtabcontent);
        return ;
    }
}
