package com.hongyan.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hongyan.base.BaseActivity;
import com.hongyan.ui.UIActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick01(View v) {
        startActivity(new Intent(MainActivity.this, UIActivity.class));
    }

    public void onClick02(View v) {
        Toast.makeText(this, "Button02", Toast.LENGTH_SHORT).show();
    }

    public void onClick03(View v) {
        Toast.makeText(this, "Button03", Toast.LENGTH_SHORT).show();
    }

    public void onClick04(View v) {
        Toast.makeText(this, "Button04", Toast.LENGTH_SHORT).show();
    }
}
