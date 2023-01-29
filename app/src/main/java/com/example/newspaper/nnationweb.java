package com.example.newspaper;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;

public class nnationweb extends AppCompatActivity {

    private WebView nnation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nnationweb);
        nnation = (WebView) findViewById(R.id.webview_nnation);
        nnation.setWebViewClient(new MyWebViewClient());
        String url= "http://ep.thedailynewnation.com/";
        nnation.getSettings().setJavaScriptEnabled(true);
        nnation.loadUrl(url);
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
        if (nnation.canGoBack()) {
            nnation.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
