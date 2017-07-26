package com.hongyan.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.hongyan.androiddemo.R;
import com.hongyan.widget.NavigationView;
import com.hongyan.widget.loading.LoadingDialog;
import com.hongyan.widget.tost.IToast;

/**
 * com.jp.base.BaseActivity
 */
public abstract class BaseActivity extends Activity {

    private LoadingDialog dialog;
    private NavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setContentView(int ResLayout) {
        View rootView = LayoutInflater.from(this).inflate(R.layout.activity_base, null, false);
        LinearLayout rootLayout = (LinearLayout) rootView.findViewById(R.id.contentLayout);
        navigationView = (NavigationView) rootView.findViewById(R.id.navigation);
        View contentView = LayoutInflater.from(this).inflate(ResLayout, null, false);
        rootLayout.addView(contentView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(rootView);
        navigationView.setOnBackClickListener(new NavigationView.OnBackClickListener() {
            @Override
            public void callBack() {
                finish();
            }
        });
    }

    protected void setTitle(String title) {
        navigationView.setTitle(title);
    }

    public void showSuccessToast(String message) {
        IToast.showSuccessToast(message);
    }

    public void showErrorToast(String message) {
        IToast.showWarnToast(message);
    }

    public void startLoading() {
        if (dialog == null) {
            dialog = new LoadingDialog(this);
        }
        dialog.show();
    }

    public void cancelLoading() {
        if (dialog == null) {
            cancelLoading();
        }
        dialog.dismiss();
    }

}
