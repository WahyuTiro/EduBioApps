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
import kotlinx.android.synthetic.main.activity_glosarium.*

class GlosariumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glosarium)

        val db = FirebaseFirestore.getInstance()

        val docRef = db.collection("materi").document("glosarium")
        docRef.get()
            .addOnSuccessListener { document ->
                if (document != null){
                    progress_bar_glosarium.visibility = View.GONE
                    Log.i("data", "DocumentSnapshot data :${document.data}")
                    var store = document.getString("isi")
                    web_glosarium.loadData(store!!, "text/html", "UTF-8")
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

        backtohome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@GlosariumActivity.finish()
        }
    }
}
