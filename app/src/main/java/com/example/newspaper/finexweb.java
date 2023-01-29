package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class finexweb extends AppCompatActivity {

    private WebView finex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finexweb);
        finex = (WebView) findViewById(R.id.webview_finex);
        finex.setWebViewClient(new MyWebViewClient());
        String url= "https://thefinancialexpress.com.bd/epaper/";
        finex.getSettings().setJavaScriptEnabled(true);
        finex.loadUrl(url);
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
        if (finex.canGoBack()) {
            finex.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
