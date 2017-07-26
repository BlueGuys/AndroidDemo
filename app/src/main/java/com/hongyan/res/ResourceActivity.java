package com.hongyan.res;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.hongyan.androiddemo.R;
import com.hongyan.base.BaseActivity;
import com.hongyan.res.drawable.DrawableActivity;

public class ResourceActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        setTitle(getString(R.string.activity_resource));
    }

    public void onClick01(View v) {
        startActivity(new Intent(ResourceActivity.this, DrawableActivity.class));
    }

    public void onClick02(View v) {

    }

    public void onClick03(View v) {
    }

    public void onClick04(View v) {
        Toast.makeText(this, "Button04", Toast.LENGTH_SHORT).show();
    }

}
