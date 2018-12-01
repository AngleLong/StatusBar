package com.angle.samples;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.angle.statusbarlib.StatusBarUtil;

public class StatusTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_text);

        /*
         * 先来明确几点问题：
         * 1.设置深色的文字一般是状态栏比较白的那种才这么做；
         * 2.对于部分4.0~6.0的手机没有办法修改相应的状态栏颜色；
         * 这里还有几点问题说明一下：
         * 1.如果是小米和魅族的手机，在4.0~6.0可以做到修改状态栏文字的颜色为深色。
         *   但是其他手机不能做到修改为深色，所以我迂回的在你上传的颜色值上添加了一个10%的蒙层做的；
         * 2.还有为了保证你的手机内容不被顶上去，希望你在Application，或者你的Activity的主题上添加
         *   android:fitsSystemWindows="true"以确保屏幕不被顶上去。
         * 3.如果对10%的蒙层不是很满意，请修改StatusBarUtil的96行处的内容
         */
        StatusBarUtil.setStatusBarMode(this, true, Color.parseColor("#ffffff"));
    }
}
