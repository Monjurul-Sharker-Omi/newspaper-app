package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class independentweb extends AppCompatActivity {

    private WebView independent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_independentweb);
        independent = (WebView) findViewById(R.id.webview_independent);
        independent.setWebViewClient(new MyWebViewClient());
        String url= "http://www.eindependentbd.com/";
        independent.getSettings().setJavaScriptEnabled(true);
        independent.loadUrl(url);
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
        if (independent.canGoBack()) {
            independent.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
