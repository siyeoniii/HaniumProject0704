package com.siyeon.haniumproject

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gallery_layout)

        title = "지난 사진/영상"

        var buttonReturn = findViewById<ImageButton>(R.id.button_return)
        buttonReturn.setOnClickListener {
            finish()
        }
    }
}