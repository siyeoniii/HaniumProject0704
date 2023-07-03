package com.siyeon.haniumproject

import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class CctvActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cctv_layout)

        title = "CCTV 확인"

        var buttonReturn = findViewById<ImageButton>(R.id.button_return)
        buttonReturn.setOnClickListener {
            finish()
        }
    }

}