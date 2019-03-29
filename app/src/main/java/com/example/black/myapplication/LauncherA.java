package com.example.black.myapplication;

import android.app.ExpandableListActivity;
import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.ArrayAdapter;

public class LauncherA extends LauncherActivity {
    
    String[] names = {"设置参数类型","查看星际兵种"};
    Class<?>[] clazzs = {PreferenceActivity.class , ExpandableListActivity.class};

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate (icicle);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this,android.R.layout.simple_expandable_list_item_1,names);
        setListAdapter (arrayAdapter);
    }

    @Override
    protected Intent intentForPosition(int position) {
        return new Intent (LauncherA.this,clazzs[position]);
    }
}
