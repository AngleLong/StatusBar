package com.angle.samples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.angle.statusbarlib.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置状态栏的颜色
        StatusBarUtil.setStatusBarColor(this, "#584706");
    }

    /**
     * 演示带有DrawerLayout的布局
     */
    public void btnDrawerLayout(View view) {
        Intent intent = new Intent(this, DrawerLayoutActivity.class);
        startActivity(intent);
    }

    /**
     * 演示顶部是图片的布局
     */
    public void btnImage(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }

    /**
     * 指定文字颜色
     */
    public void btnColor(View view) {
        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }

    /**
     * 指定文字颜色
     */
    public void btnStatusColor(View view) {
        Intent intent = new Intent(this, StatusTextActivity.class);
        startActivity(intent);
    }

    /**
     * 渐变标题栏的实现
     */
    public void gradientStatusColor(View view) {
        Intent intent = new Intent(this, GradientActivity.class);
        startActivity(intent);
    }
}
