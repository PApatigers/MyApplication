package com.example.black.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Titlefragment extends Fragment {

    private ImageButton mButton;
    private TextView titlename;
    private Activity activity;
    private static String ARG_PARAM = "param_key";
    private String mParam;

    //定义一个回调接口用以改变title文字


    @Override
    public void onAttach(Context context) {
        super.onAttach (context);
        activity = (Activity) context;
        //mParam = getArguments ( ).getString (ARG_PARAM);
    }

    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        mButton = (ImageButton)view.findViewById(R.id.id_title_left_btn);
        titlename =(TextView) view.findViewById (R.id.title);
        mButton.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "i am an ImageButton in TitleFragment ! ", Toast.LENGTH_SHORT).show();
                activity.finish ();
            }
        });

//        Bundle bundle = this.getArguments ();
//        if (bundle.getString ("title") != null){
//            String title_name = bundle.getString ("title");
//            titlename.setText (title_name);
//        }
//        else{
//            Log.e ("tag","bundle is null" );
//        }

        return view;
    }

//    public static Titlefragment newInstance(String str) {
//        Titlefragment frag = new Titlefragment ();
//        Bundle bundle = new Bundle();
//        bundle.putString(ARG_PARAM, str);
//        frag.setArguments(bundle);   //设置参数
//        return frag;
//    }

}
