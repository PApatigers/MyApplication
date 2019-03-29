package com.example.black.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

import java.util.ArrayList;

public class register extends Activity {

    private ViewPager viewPager;
    private ArrayList<View> pageview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView (R.layout.register);


//        viewPager=findViewById (R.id.viewPager);
//        LayoutInflater layoutInflater = getLayoutInflater ();
//        View view1 = layoutInflater.inflate (R.layout.normal_register,null);
//        View view2 = layoutInflater.inflate (R.layout.wuye_register,null);
//
//        pageview = new ArrayList<View> ();
//        pageview.add (view1);
//        pageview.add (view2);
//
//        PagerAdapter pagerAdapter  = new PagerAdapter ( ) {
//            @Override
//            public int getCount() {
//                return pageview.size ();
//            }
//
//            @Override
//            //判断是否由对象生成界面
//            public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
//                return view == o;
//            }
//
//        };
//        viewPager.setAdapter (pagerAdapter);
//        viewPager.setCurrentItem (0);
        //viewPager.addOnPageChangeListener(new MyOnPageChangeListener());
    }

//    public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
//
//        @Override
//        public void onPageSelected(int arg0) {
//            Animation animation = null;
//            switch (arg0) {
//                case 0:
//                    /**
//                     * TranslateAnimation的四个属性分别为
//                     * float fromXDelta 动画开始的点离当前View X坐标上的差值
//                     * float toXDelta 动画结束的点离当前View X坐标上的差值
//                     * float fromYDelta 动画开始的点离当前View Y坐标上的差值
//                     * float toYDelta 动画开始的点离当前View Y坐标上的差值
//                     **/
//                    animation = new TranslateAnimation(one, 0, 0, 0);
//                    break;
//                case 1:
//                    animation = new TranslateAnimation(offset, one, 0, 0);
//                    break;
//            }
//        }
//
//        @Override
//        public void onPageScrolled(int arg0, float arg1, int arg2) {
//        }
//
//        @Override
//        public void onPageScrollStateChanged(int arg0) {
//        }
//    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.normal_layout:
                //点击"视频“时切换到第一页
                viewPager.setCurrentItem(0);
                break;
            case R.id.wuye_layout:
                //点击“音乐”时切换的第二页
                viewPager.setCurrentItem(1);
                break;
        }
    }


}
