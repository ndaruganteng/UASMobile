package com.example.uasmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class mainsplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainsplash)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@mainsplash, MainActivity::class.java)
            startActivity(intent)
        }, 2000)

    }
}