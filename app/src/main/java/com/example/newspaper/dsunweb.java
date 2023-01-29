package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dsunweb extends AppCompatActivity {

    private WebView dsun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsunweb);
        dsun = (WebView) findViewById(R.id.webview_dsun);
        dsun.setWebViewClient(new MyWebViewClient());
        String url= "http://www.edailysun.com/";
        dsun.getSettings().setJavaScriptEnabled(true);
        dsun.loadUrl(url);
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
        if (dsun.canGoBack()) {
            dsun.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
