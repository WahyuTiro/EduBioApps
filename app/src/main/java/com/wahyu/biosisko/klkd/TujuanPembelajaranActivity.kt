package com.wahyu.biosisko.klkd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.wahyu.biosisko.MainActivity
import com.wahyu.biosisko.R
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_tujuan_pembelajaran.*

class TujuanPembelajaranActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tujuan_pembelajaran)


        val db = FirebaseFirestore.getInstance()

        val docRef = db.collection("kikd").document("tujuan_pembelajaran")
        docRef.get()
            .addOnSuccessListener { document ->
                if (document != null){
                    progress_bar_tp.visibility = View.GONE
                    Log.i("data", "DocumentSnapshot data :${document.data}")
                    var store = document.getString("isi")
                    web_tp.loadData(store!!, "text/html", "UTF-8")
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

        backtoklkd4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@TujuanPembelajaranActivity.finish()
        }
    }
}
