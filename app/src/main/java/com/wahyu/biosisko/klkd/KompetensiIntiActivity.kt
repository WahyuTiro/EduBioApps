package com.wahyu.biosisko.klkd

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wahyu.biosisko.MainActivity
import com.wahyu.biosisko.R
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_kompetensi_inti.*


class KompetensiIntiActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kompetensi_inti)

        val db = FirebaseFirestore.getInstance()

        val docRef = db.collection("kikd").document("kompetensi_inti")
        docRef.get()
            .addOnSuccessListener { document ->
                if (document != null){
                    progress_bar_ki.visibility = View.GONE
                    Log.i("data", "DocumentSnapshot data :${document.data}")
                    var store = document.getString("isi")
                    web_ki.loadData(store!!, "text/html", "UTF-8")
                }
                else{
                    Log.i("data", "No document")
                    Toast.makeText(this, "error no document", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { exception ->
                Log.i("data", "get failed with ", exception)
                Toast.makeText(this, "error$exception", Toast.LENGTH_SHORT).show()
            }

        backtoklkd3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@KompetensiIntiActivity.finish()
        }
    }
}
