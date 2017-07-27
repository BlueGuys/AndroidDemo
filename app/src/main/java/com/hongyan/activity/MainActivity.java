package com.hongyan.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hongyan.androiddemo.R;
import com.hongyan.anim.AnimationActivity;
import com.hongyan.base.BaseActivity;
import com.hongyan.res.ResourceActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.activity_main));
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
        startActivity(new Intent(MainActivity.this, CustomViewActivity.class));
    }
}
