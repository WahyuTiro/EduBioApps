package com.wahyu.biosisko.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.bitvale.lavafab.Child
import com.wahyu.biosisko.*
import com.google.firebase.firestore.FirebaseFirestore
import com.wahyu.biosisko.MainActivity
import kotlinx.android.synthetic.main.activity_sistem_saraf.*

class SistemSaraf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistem_saraf)

        val db = FirebaseFirestore.getInstance()

        val docRef = db.collection("materi").document("sistem_saraf")
        docRef.get()
                .addOnSuccessListener { document ->
                    if (document != null){
                        progress_bar_saraf.visibility = View.GONE
                        Log.i("data", "DocumentSnapshot data :${document.data}")
                        var store = document.getString("isi")
                        web_saraf.loadData(store!!, "text/html", "UTF-16")
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

        with(lava_fab_saraf) {
            setLavaBackgroundResColor(R.color.biru)
            setParentOnClickListener { lava_fab_saraf.trigger() }
            setChildOnClickListener(Child.TOP) {
                val  intent = Intent(context, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
                this@SistemSaraf.finish()
            }
            setChildOnClickListener(Child.LEFT) {
                val  intent = Intent(context, LoginActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
                this@SistemSaraf.finish()
            }
        }
    }
}
