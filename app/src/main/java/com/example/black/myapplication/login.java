package com.example.black.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class login extends AppCompatActivity {

    private Button re;
    private EditText editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e ("tag","正在Create");
        super.onCreate (savedInstanceState);
        setContentView (R.layout.login);

        re = findViewById (R.id.re);
        editText = findViewById (R.id.user_edit);
        re.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String username = editText.getText ().toString ();
                Intent intent = getIntent ();
                intent.putExtra ("username",username);

            }
        });

        Bundle bundle = new Bundle ();
        bundle.putString("title","登录");
        Titlefragment titlefragment = new Titlefragment ();
        titlefragment.setArguments (bundle);
        getSupportFragmentManager ()
                .beginTransaction ()
                .add (R.id.test,new Titlefragment ())
                .commit ();

    }

    //okthhp实现登录
    void http_login(String username , String password){
        OkHttpClient client = new OkHttpClient ();
        FormBody formBody = new FormBody.Builder ()
                .add ("username",username)
                .add ("password",password)
                .build ();
        Request request = new Request.Builder ()
                .get ()
                .url("http://47.100.202.93/music/login.php")
                .post (formBody)
                .build ();
        Call call =client.newCall (request);
        // TODO: 2019/3/19 登录 
        call.enqueue (new Callback ( ) {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });


    }

    @Override
    protected void onStart() {
        Log.e ("tag","正在start");
        super.onStart ( );

    }

    @Override
    protected void onResume() {
        super.onResume ( );
        Log.e ("tag","正在resume");
    }

    @Override
    protected void onPause() {
        Log.e ("tag","正在pause");
        super.onPause ( );

    }

    @Override
    protected void onStop() {
        Log.e ("tag","正在stop");
        super.onStop ( );

    }

    @Override
    protected  void onDestroy(){
        Log.e ("tag","正在destroy");
        super.onDestroy ();

    }

    public void change(String a){

    }
}
