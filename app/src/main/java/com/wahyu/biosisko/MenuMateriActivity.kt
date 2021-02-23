package com.wahyu.biosisko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyu.biosisko.klkd.GlosariumActivity
import com.wahyu.biosisko.materi.*
import kotlinx.android.synthetic.main.activity_menu_materi.*
import kotlinx.android.synthetic.main.activity_menu_materi.backtodash1

class MenuMateriActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_materi)

        cardSistemSaraf.setOnClickListener {
            val intent = Intent(this, SistemSaraf::class.java)
            startActivity(intent)
        }

        cardGangguanSistemRegulasi.setOnClickListener {
            val intent = Intent(this, GangguanSistemRegulasi::class.java)
            startActivity(intent)
        }

        cardSistemHormon.setOnClickListener {
            val intent = Intent(this, SistemHormon::class.java)
            startActivity(intent)
        }

        cardSistemIndera.setOnClickListener {
            val intent = Intent(this, SistemIndera::class.java)
            startActivity(intent)
        }

        cardGlosarium.setOnClickListener {
            val intent = Intent(this, GlosariumActivity::class.java)
            startActivity(intent)
        }

        backtodash1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@MenuMateriActivity.finish()
        }
    }
}
