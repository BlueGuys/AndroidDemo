package com.hongyan.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hongyan.anim.AnimationActivity;
import com.hongyan.base.BaseActivity;
import com.hongyan.res.ResourceActivity;
import com.hongyan.utils.UtilActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick01(View v) {
        startActivity(new Intent(MainActivity.this, ResourceActivity.class));
    }

    public void onClick02(View v) {
        startActivity(new Intent(MainActivity.this, AnimationActivity.class));
    }

    public void onClick03(View v) {
        startActivity(new Intent(MainActivity.this, UtilActivity.class));
    }

    public void onClick04(View v) {

    }
}
