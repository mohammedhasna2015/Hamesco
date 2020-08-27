package com.hamesco.org;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=(WebView)findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://hamseco.com/");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);
        wv.setWebViewClient(new WebViewClient(){

            @Override public void onReceivedError(WebView view, WebResourceRequest request,
                                                  WebResourceError error) {
                super.onReceivedError(view, request, error);

            }
        });
    }

    @Override
    public void onBackPressed() {
        if (wv.canGoBack()) {
            wv.goBack();
        }else {
            super.onBackPressed();
        }
    }
}