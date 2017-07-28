package com.hongyan.activity;

import android.os.Bundle;
import android.view.View;

import com.hongyan.androiddemo.R;
import com.hongyan.base.BaseActivity;
import com.hongyan.widget.canvas.CanvasTestView;

public class CanvasActivity extends BaseActivity {

    private CanvasTestView view;
    private int type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        setTitle(getString(R.string.activity_canvas));
        view = (CanvasTestView) findViewById(R.id.canvas);
    }

    public void onClick01(View v) {
        view.update(++type);
    }

}
