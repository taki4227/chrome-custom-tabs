package com.example.taki.chrome_custom_tabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.simple_button).setOnClickListener {
            startActivity(Intent(this, SimpleCustomTabActivity::class.java))
        }
    }
}
