package com.siyeon.haniumproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonAlarmActivity = findViewById<Button>(R.id.bt_home_alarm)
        buttonAlarmActivity.setOnClickListener {
            var intent = Intent(applicationContext, AlarmActivity::class.java)
            startActivity(intent)
        }

        var buttonCCTVActivity = findViewById<Button>(R.id.bt_home_cctv)
        buttonCCTVActivity.setOnClickListener {
            var intent = Intent(applicationContext, CCTVActivity::class.java)
            startActivity(intent)
        }

        var buttonGalleryActivity = findViewById<Button>(R.id.bt_home_gallery)
        buttonGalleryActivity.setOnClickListener {
            var intent = Intent(applicationContext, GalleryActivity::class.java)
            startActivity(intent)
        }

        var buttonFacilityActivity = findViewById<Button>(R.id.bt_home_facility)
        buttonFacilityActivity.setOnClickListener {
            var intent = Intent(applicationContext, FacilityActivity::class.java)
            startActivity(intent)
        }
    }


}

