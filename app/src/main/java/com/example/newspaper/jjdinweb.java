package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;

public class jjdinweb extends AppCompatActivity {

    private WebView jjdin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jjdinweb);
        jjdin = (WebView) findViewById(R.id.webview_jjdin);
        jjdin.setWebViewClient(new MyWebViewClient());
        String url= "http://www.ejjdin.com/";
        jjdin.getSettings().setJavaScriptEnabled(true);
        jjdin.loadUrl(url);
        jjdin.getSettings().setLoadWithOverviewMode(true);
        jjdin.getSettings().setUseWideViewPort(true);
        jjdin.getSettings().setBuiltInZoomControls(true);
        jjdin.getSettings().setDisplayZoomControls(false);
    }

    public class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed() {
        if (jjdin.canGoBack()) {
            jjdin.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
