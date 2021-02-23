package com.wahyu.biosisko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyu.biosisko.playvideos.*
import kotlinx.android.synthetic.main.activity_menu_video.*
import kotlinx.android.synthetic.main.activity_menu_video.backtodash1

class MenuVideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_video)

        cardVideo1.setOnClickListener {
            val intent = Intent(this, VideoSatu::class.java)
            startActivity(intent)
        }

        cardVideo2.setOnClickListener {
            val intent = Intent(this, VideoDua::class.java)
            startActivity(intent)
        }

        cardVideo3.setOnClickListener {
            val intent = Intent(this, VideoTiga::class.java)
            startActivity(intent)
        }

        backtodash1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@MenuVideoActivity.finish()
        }
    }
}