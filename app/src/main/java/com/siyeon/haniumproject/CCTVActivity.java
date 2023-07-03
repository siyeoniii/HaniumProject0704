package com.siyeon.haniumproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CCTVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cctv_layout);

        @SuppressLint("WrongViewCast") Button returnButton = findViewById(R.id.button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new MainActivity();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.setBackgroundColor(125);


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webView.loadDataWithBaseURL("https://aries574.tistory.com/81", "<html><head></head><body>" +"<img src='/stream/video.mjpeg' alt='image'></body></html>",
                "text/html", "UTF-8", "");

    }
}
