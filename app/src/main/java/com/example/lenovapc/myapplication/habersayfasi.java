package com.example.lenovapc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by Lenova pc on 17.06.2017.
 */

public class habersayfasi extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haberlayout);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        WebView webView =(WebView) findViewById(R.id.webview) ;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
