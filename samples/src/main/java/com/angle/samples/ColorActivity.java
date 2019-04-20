package com.angle.samples;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.angle.statusbarlib.StatusBarUtil;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        StatusBarUtil.setStatusBarColor(this, "#D81B60");
    }
}
