package com.alkchimovich.warsawrotbart

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


open class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        Thread.sleep(1500)
        finish()

    }
}