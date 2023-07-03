package com.siyeon.haniumproject

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CctvActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cctv_layout)

        title = "CCTV 확인"

        var buttonReturn = findViewById<Button>(R.id.button_return)
        buttonReturn.setOnClickListener {
            finish()
        }
    }
}