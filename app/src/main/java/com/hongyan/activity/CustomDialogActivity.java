package com.hongyan.activity;

import android.os.Bundle;
import android.view.View;

import com.hongyan.androiddemo.R;
import com.hongyan.base.BaseActivity;
import com.hongyan.widget.dialog.ConfirmDialog;

public class CustomDialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        setTitle(getString(R.string.activity_custom_dialog));
    }

    public void onClick01(View v) {
        final ConfirmDialog dialog = new ConfirmDialog(CustomDialogActivity.this);
        dialog.show();
        dialog.setContent("你好，明天", "取消", "确定");
        dialog.setLeftListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setRightListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

}
