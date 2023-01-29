package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class inqilabweb extends AppCompatActivity {

    private WebView inqilab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inqilabweb);
        inqilab = (WebView) findViewById(R.id.webview_inqilab);
        inqilab.setWebViewClient(new MyWebViewClient());
        String url= "http://www.dailyinqilab.com/epaper/";
        inqilab.getSettings().setJavaScriptEnabled(true);
        inqilab.loadUrl(url);
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
        if (inqilab.canGoBack()) {
            inqilab.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
