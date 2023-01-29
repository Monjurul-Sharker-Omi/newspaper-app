package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class observerweb extends AppCompatActivity {

    private WebView observer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observerweb);
        observer = (WebView) findViewById(R.id.webview_observer);
        observer.setWebViewClient(new MyWebViewClient());
        String url= "https://epaper.observerbd.com/";
        observer.getSettings().setJavaScriptEnabled(true);
        observer.loadUrl(url);
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
        if (observer.canGoBack()) {
            observer.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
