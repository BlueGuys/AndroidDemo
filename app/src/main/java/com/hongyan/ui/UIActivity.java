package com.hongyan.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.hongyan.androiddemo.R;
import com.hongyan.base.BaseActivity;

/**
 * com.hongyan.ui.UIActivity
 */
public class UIActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
    }

    public void onClick01(View v){
        Toast.makeText(this,"Button01",Toast.LENGTH_SHORT).show();
    }

    public void onClick02(View v){
        Toast.makeText(this,"Button02",Toast.LENGTH_SHORT).show();
    }

    public void onClick03(View v){
        Toast.makeText(this,"Button03",Toast.LENGTH_SHORT).show();
    }
}
