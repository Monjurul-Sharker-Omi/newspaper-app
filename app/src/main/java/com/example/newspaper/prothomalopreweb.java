package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class prothomalopreweb extends AppCompatActivity {

    private WebView prothomalopre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prothomalopreweb);
        prothomalopre = (WebView) findViewById(R.id.webview_prothomalopre);
        prothomalopre.setWebViewClient(new MyWebViewClient());
        String url= "https://epaper.prothomalo.com/";
        prothomalopre.getSettings().setJavaScriptEnabled(true);
        prothomalopre.loadUrl(url);
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
        if (prothomalopre.canGoBack()) {
            prothomalopre.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
