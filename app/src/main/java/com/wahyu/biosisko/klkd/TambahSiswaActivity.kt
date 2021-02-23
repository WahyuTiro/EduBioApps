package com.wahyu.biosisko.klkd

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bitvale.lavafab.Child
import com.wahyu.biosisko.MainActivity
import com.wahyu.biosisko.R
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_tambah_siswa.*
import kotlinx.android.synthetic.main.dialog_layout.view.*

class TambahSiswaActivity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_siswa)

        loadData()

        with(lava_fab_tbSiswa) {
            setLavaBackgroundResColor(R.color.biru)
            setParentOnClickListener { lava_fab_tbSiswa.trigger() }
            setChildOnClickListener(Child.TOP) {
                addSiswa()
            }
            setChildOnClickListener(Child.LEFT) {
                val  intent = Intent(context, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
                this@TambahSiswaActivity.finish()
            }
        }

    }

    fun addSiswa(){
        //Inflate the dialog with custom view
        val mDialogView = LayoutInflater.from(this).inflate(R.layout.dialog_layout, null)
        //AlertDialogBuilder
        val mBuilder = AlertDialog.Builder(this)
            .setView(mDialogView)
        //show dialog
        val  mAlertDialog = mBuilder.show()
        //login button click of custom layout
        mDialogView.dialogBtnTambah.setOnClickListener {
            //get text from EditTexts of custom layout
            val name = mDialogView.dialogNameEt.text.toString().trim()
            val nisn = mDialogView.dialogNisnEt.text.toString().trim()
            if (!name.isEmpty() && !nisn.isEmpty() ) {
                try {
                    val items = HashMap<String, Any>()
                    items.put("nama", name)
                    items.put("nisn", nisn)
                    db.collection("data").document(nisn).set(items)
                        .addOnSuccessListener {
                            Toast.makeText(this, "Successfully uploaded to the database :)", Toast.LENGTH_LONG).show()
                            mAlertDialog.dismiss()
                        }.addOnFailureListener {
                                exception: java.lang.Exception -> Toast.makeText(this, exception.toString(), Toast.LENGTH_LONG).show()
                        }
                }catch (e:Exception) {
                    Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
                }
            }else {
                Toast.makeText(this, "Please fill up the fields :(", Toast.LENGTH_LONG).show()
            }
        }
        //cancel button click of custom layout
        mDialogView.dialogBtnBatal.setOnClickListener {
            //dismiss dialog
            mAlertDialog.dismiss()
        }
    }

    fun loadData(){
        db.collection("data")
            .get()
            .addOnSuccessListener { result ->
//                val data = ""
                for (document in result) {

                    val data_name = document.data["nama"]
                    val data_nis = document.data["nisn"]
                    Log.d("exis", "${document.id} => ${document.data}")

                    var content = data_nis.toString()
                    content += " : " + data_name.toString() +"\n"
                    data.append(content)
                }

            }
            .addOnFailureListener { exception ->
                Log.d("noexis", "Error getting documents: ", exception)
            }

    }

}
