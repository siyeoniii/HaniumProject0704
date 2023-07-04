package com.siyeon.haniumproject

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class CctvActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cctv_layout)

        // java activity 파일 삭제하고 입력한 코드
        val webView = findViewById<WebView>(R.id.webView)
        webView.apply {
            webViewClient = WebViewClient()
            webChromeClient = WebChromeClient()
            settings.javaScriptEnabled = true
        }

        webView.loadUrl("https://www.youtube.com/watch?v=6Dbq05hchX4")
        //여기까지


        title = "CCTV 확인"

        var buttonReturn = findViewById<ImageButton>(R.id.button_return)
        buttonReturn.setOnClickListener {
            finish()
        }
    }



}