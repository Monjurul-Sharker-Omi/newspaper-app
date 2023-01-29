package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class samakalweb extends AppCompatActivity {

    private WebView samakal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samakalweb);
        samakal = (WebView) findViewById(R.id.webview_samakal);
        samakal.setWebViewClient(new MyWebViewClient());
        String url= "http://epaper.samakal.com";
        samakal.getSettings().setJavaScriptEnabled(true);
        samakal.loadUrl(url);
        samakal.getSettings().setLoadWithOverviewMode(true);
        samakal.getSettings().setUseWideViewPort(true);
        samakal.getSettings().setBuiltInZoomControls(true);
        samakal.getSettings().setDisplayZoomControls(false);
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
        if (samakal.canGoBack()) {
            samakal.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
