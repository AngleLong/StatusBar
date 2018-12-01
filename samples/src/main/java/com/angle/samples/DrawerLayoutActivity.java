package com.angle.samples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.angle.statusbarlib.StatusBarUtil;

public class DrawerLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);

        StatusBarUtil.setTranslucentStatus(this);
    }
}
