package com.angle.samples;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.angle.statusbarlib.StatusBarUtil;

public class GradientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient);

        StatusBarUtil.setTranslucentStatus(this);

        View statusBarView = findViewById(R.id.statusBarView);
        ViewGroup.LayoutParams layoutParams = statusBarView.getLayoutParams();
        layoutParams.height = getStatusBarHeight();
        statusBarView.setLayoutParams(layoutParams);
    }


    /**
     * 获取状态栏高度的方法
     *
     * @return 状态栏高度
     */
    public static int getStatusBarHeight() {
        Resources resources = Resources.getSystem();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        return resources.getDimensionPixelSize(resourceId);
    }
}
