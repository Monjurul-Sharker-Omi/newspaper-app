package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class prothomaloweb extends AppCompatActivity {

    private WebView prothomalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prothomaloweb);
        prothomalo = (WebView) findViewById(R.id.webview_prothomalo);
        prothomalo.setWebViewClient(new MyWebViewClient());
        String url= "https://www.prothomalo.com/todays-paper";
        prothomalo.getSettings().setJavaScriptEnabled(true);
        prothomalo.loadUrl(url);
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
        if (prothomalo.canGoBack()) {
            prothomalo.goBack();
        } else {
            super.onBackPressed();
        }
    }

}
