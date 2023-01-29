package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bdpratidinweb extends AppCompatActivity {

    private WebView bdpratidin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdpratidinweb);
        bdpratidin = (WebView) findViewById(R.id.webview_bdpratidin);
        bdpratidin.setWebViewClient(new MyWebViewClient());
        String url= "https://www.ebdpratidin.com/";
        bdpratidin.getSettings().setJavaScriptEnabled(true);
        bdpratidin.loadUrl(url);
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
        if (bdpratidin.canGoBack()) {
            bdpratidin.goBack();
        } else {
            super.onBackPressed();
        }
    }


}
