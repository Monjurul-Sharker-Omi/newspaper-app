package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;

public class newageweb extends AppCompatActivity {

    private WebView newage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newageweb);
        newage = (WebView) findViewById(R.id.webview_newage);
        newage.setWebViewClient(new MyWebViewClient());
        String url= "https://epaper.newagebd.net/";
        newage.getSettings().setJavaScriptEnabled(true);
        newage.loadUrl(url);
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
        if (newage.canGoBack()) {
            newage.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
