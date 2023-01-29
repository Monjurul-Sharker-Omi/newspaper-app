package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dailystarweb extends AppCompatActivity {

    private WebView dailystar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailystarweb);
        dailystar = (WebView) findViewById(R.id.webview_dailystar);
        dailystar.setWebViewClient(new MyWebViewClient());
        String url= "https://epaper.thedailystar.net/";
        dailystar.getSettings().setJavaScriptEnabled(true);
        dailystar.loadUrl(url);
    }

    public class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed() {
        if (dailystar.canGoBack()) {
            dailystar.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

