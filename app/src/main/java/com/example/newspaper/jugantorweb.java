package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class jugantorweb extends AppCompatActivity {

    private WebView jugantor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugantorweb);
        jugantor = (WebView) findViewById(R.id.webview_jugantor);
        jugantor.setWebViewClient(new MyWebViewClient());
        String url= "http://epaper.jugantor.com/";
        jugantor.getSettings().setJavaScriptEnabled(true);
        jugantor.loadUrl(url);
        jugantor.getSettings().setLoadWithOverviewMode(true);
        jugantor.getSettings().setUseWideViewPort(true);
        jugantor.getSettings().setBuiltInZoomControls(true);
        jugantor.getSettings().setDisplayZoomControls(false);
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

            super.onBackPressed();
        }

}
