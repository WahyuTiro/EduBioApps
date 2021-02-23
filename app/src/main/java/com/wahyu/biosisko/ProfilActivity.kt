package com.wahyu.biosisko

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profil.*


class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)



        imgInstagram.setOnClickListener{
            val uri: Uri = Uri.parse("https://instagram.com/nuraafiaah")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.instagram.android")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/nuraafiaah")
                    )
                )
            }
        }

        imgWhatsapp.setOnClickListener{
            val uri: Uri = Uri.parse("https://api.whatsapp.com/send?phone=6281242182483")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.whatsapp")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                        Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://api.whatsapp.com/send?phone=6281242182483")
                        )
                )
            }
        }

        imgFacebook.setOnClickListener {
            val uri: Uri = Uri.parse("https://facebook.com/")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.facebook.android")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://facebook.com/")
                    )
                )
            }
        }

        backtodash.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@ProfilActivity.finish()
        }

    }
}
