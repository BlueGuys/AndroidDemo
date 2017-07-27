package com.hongyan.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hongyan.androiddemo.R;
import com.hongyan.base.BaseActivity;

public class CustomViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        setTitle(getString(R.string.activity_custom_view));
    }

    public void onClick01(View v) {
        startActivity(new Intent(CustomViewActivity.this, CustomDialogActivity.class));
    }

}
