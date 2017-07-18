package com.hongyan.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hongyan.widget.loading.LoadingDialog;
import com.hongyan.widget.tost.IToast;

/**
 * com.jp.base.BaseActivity
 */
public abstract class BaseActivity extends Activity {

    private LoadingDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
