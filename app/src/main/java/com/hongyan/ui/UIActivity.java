package com.hongyan.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.hongyan.androiddemo.R;
import com.hongyan.base.BaseActivity;

public class UIActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
    }

    public void onClick01(View v) {
        startActivity(new Intent(UIActivity.this, UICommonActivity.class));
    }

    public void onClick02(View v) {
        Toast.makeText(this, "Button02", Toast.LENGTH_SHORT).show();
    }

    public void onClick03(View v) {
        startActivity(new Intent(UIActivity.this, UIShapeActivity.class));
    }

    public void onClick04(View v) {
        Toast.makeText(this, "Button01", Toast.LENGTH_SHORT).show();
    }

    public void onClick05(View v) {
        Toast.makeText(this, "Button01", Toast.LENGTH_SHORT).show();
    }

    public void onClick06(View v) {
        Toast.makeText(this, "Button01", Toast.LENGTH_SHORT).show();
    }

    public void onClick07(View v) {
        Toast.makeText(this, "Button01", Toast.LENGTH_SHORT).show();
    }

    public void onClick08(View v) {
        Toast.makeText(this, "Button01", Toast.LENGTH_SHORT).show();
    }

    public void onClick09(View v) {
        Toast.makeText(this, "Button01", Toast.LENGTH_SHORT).show();
    }

}
