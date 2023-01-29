package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ittefaqweb extends AppCompatActivity {

    private WebView ittefaq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ittefaqweb);
        ittefaq = (WebView) findViewById(R.id.webview_ittefaq);
        ittefaq.setWebViewClient(new MyWebViewClient());
        String url= "https://epaper.ittefaq.com.bd/";
        ittefaq.getSettings().setJavaScriptEnabled(true);
        ittefaq.loadUrl(url);
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
        if (ittefaq.canGoBack()) {
            ittefaq.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
