package com.hongyan.base;

import android.app.Application;

/**
 * com.hongyan.base.BaseApplication
 */
public class BaseApplication extends Application{

    private static BaseApplication _instance;

    @Override
    public void onCreate() {
        super.onCreate();
        _instance = this;
    }

    public static BaseApplication getInstance() {
        return _instance;
    }
}
