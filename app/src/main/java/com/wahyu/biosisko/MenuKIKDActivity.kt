package com.wahyu.biosisko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyu.biosisko.klkd.*
import kotlinx.android.synthetic.main.activity_menu_kikd.*
import kotlinx.android.synthetic.main.activity_menu_kikd.backtodash1

class MenuKIKDActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_kikd)

        cardKI.setOnClickListener {
            val intent = Intent(this, KompetensiIntiActivity::class.java)
            startActivity(intent)
        }

        cardKD.setOnClickListener {
            val intent = Intent(this, KompetensiDasarActivity::class.java)
            startActivity(intent)
        }

        cardIP.setOnClickListener {
            val intent = Intent(this, IndikatorPembelajaranActivity::class.java)
            startActivity(intent)
        }

        cardTP.setOnClickListener {
            val intent = Intent(this, TujuanPembelajaranActivity::class.java)
            startActivity(intent)
        }

        cardPS.setOnClickListener {
            val intent = Intent(this, TambahSiswaActivity::class.java)
            startActivity(intent)
        }

        backtodash1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@MenuKIKDActivity.finish()
        }
    }
}
