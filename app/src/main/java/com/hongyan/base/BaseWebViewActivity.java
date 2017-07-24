package com.hongyan.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hongyan.androiddemo.R;
import com.hongyan.utils.SerializableHashMapUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/**
 * com.jp.base.BaseWebViewActivity
 *
 * @author wangning
 * @version 2.1.0
 * @date 2017/7/6:08:27
 * @desc
 */
public class BaseWebViewActivity extends BaseActivity {


    public static final String TITLE = "title";
    public static final String URL = "url";
    public static final String PARAMS = "params";
    private WebView mWebView;
    private String mTitle;
    private String mUrl;
    private SerializableHashMapUtils mParamsMap;


    public static void startActivity(Context context, String title, String url, SerializableHashMapUtils map) {
        Intent intent = new Intent(context, BaseWebViewActivity.class);
        intent.putExtra(TITLE, title);
        intent.putExtra(URL, url);
        intent.putExtra(PARAMS, map);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        initData();
        load();
        initContent();
    }

    protected void initData() {
        Intent intent = getIntent();
        mTitle = intent.getStringExtra(TITLE);
        mUrl = intent.getStringExtra(URL);
        mParamsMap = (SerializableHashMapUtils) intent.getSerializableExtra(PARAMS);
    }

    private void load() {
        if (mWebView == null) {
            return;
        }
        if (mUrl == null || mUrl.length() == 0) {
            return;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(mUrl);
        String connector = mUrl.contains("?") ? "&" : "?";
        builder.append(connector);
        builder.append(mapToUrlParams(mParamsMap.getMap()));
        mWebView.loadUrl(builder.toString());
    }

    public static String mapToUrlParams(HashMap<String, String> map) {
        StringBuilder result = new StringBuilder();
        if (map != null) {
            for (String headerName : map.keySet()) {
                result.append(headerName);
                result.append("=");
                String headerValue = map.get(headerName);
                if (headerValue != null) {
                    try {
                        result.append(URLEncoder.encode(headerValue, "UTF-8"));

                    } catch (UnsupportedEncodingException e) {
                    } catch (Exception e) {
                    }
                }

                result.append("&");
            }
        }
        return result.toString();
    }

    private void initContent() {
        mWebView = (WebView) findViewById(R.id.webView);
        try {
            mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);
            mWebView.getSettings().setAllowFileAccess(true);
            mWebView.getSettings().setDomStorageEnabled(true);
            mWebView.getSettings().setGeolocationEnabled(true);
            mWebView.getSettings().setSupportZoom(true);
            mWebView.getSettings().setSupportMultipleWindows(true);
            mWebView.getSettings().setUseWideViewPort(true);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            mWebView.getSettings().setTextZoom(100);

            if (Build.VERSION.SDK_INT >= 19) {
                mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
            }
            mWebView.requestFocus(View.FOCUS_DOWN);

            mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
//            mWebView.setDownloadListener(new WebViewDownLoadListener());
            mWebView.setWebViewClient(mWebViewClient);
//            mWebView.setWebChromeClient(mClient);
        } catch (Exception e) {

        }
    }

    private WebViewClient mWebViewClient = new WebViewClient() {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (mWebView != null) {
                mWebView.loadUrl(url);
                return true;
            }
            return super.shouldOverrideUrlLoading(view, url);
        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    };

}
