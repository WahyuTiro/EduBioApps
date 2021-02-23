package com.wahyu.biosisko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=2000 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        
        Handler().postDelayed({

            startActivity(Intent(this,IntroActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}