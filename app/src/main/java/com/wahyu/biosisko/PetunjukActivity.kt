package com.wahyu.biosisko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_petunjuk.*

class PetunjukActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petunjuk)

        val db = FirebaseFirestore.getInstance()

        val docRef = db.collection("kikd").document("petunjuk")
        docRef.get()
            .addOnSuccessListener { document ->
                if (document != null){
                    progress_bar_petunjuk.visibility = View.GONE
                    Log.i("data", "DocumentSnapshot data :${document.data}")
                    var store = document.getString("isi")
                    web_petunjuk.loadData(store!!, "text/html", "UTF-8")
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

        backtopenda.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@PetunjukActivity.finish()
        }
    }
}
