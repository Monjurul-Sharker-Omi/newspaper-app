package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class janakanthaweb extends AppCompatActivity {

    private WebView jankantha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janakanthaweb);
        jankantha = (WebView) findViewById(R.id.webview_janakantha);
        jankantha.setWebViewClient(new MyWebViewClient());
        String url= "http://www.edailyjanakantha.com/";
        jankantha.getSettings().setJavaScriptEnabled(true);
        jankantha.loadUrl(url);
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
        if (jankantha.canGoBack()) {
            jankantha.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
