package com.wahyu.biosisko.Quiz

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wahyu.biosisko.R


class HomeQuizActivity : AppCompatActivity() {

    private var txtHighScore: TextView? = null

    private var mhighscore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_home)

        txtHighScore = findViewById(R.id.highscore)
        loadHighScore()


        val startQuiz = findViewById<Button>(R.id.button_play)
        startQuiz.setOnClickListener {
            startActivityForResult(Intent(applicationContext, PlayQuizActivity::class.java),
                    REQUEST_CODE
            )
        }

        val exitQuiz = findViewById<Button>(R.id.button_exit)
        exitQuiz.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Konfirmasi Keluar")
            alert.setIcon(R.drawable.quiz)
            alert.setMessage("Apakah ingin keluar dari Quiz?")
            alert.setPositiveButton("Yes") { dialog, i ->
                Toast.makeText(applicationContext, "Sampai jumpa lagi", Toast.LENGTH_SHORT).show()
                finish()
            }
            alert.setNegativeButton("No") { dialog, i ->
                Toast.makeText(applicationContext, "Batal", Toast.LENGTH_SHORT).show()
                dialog.cancel()
            }
            alert.show();
        }

    }

    private fun updateScore(score: Int) {
        mhighscore = score
        txtHighScore!!.text = "My High Score : $mhighscore"

        val preferences = getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putInt(HIGH_SCORE, mhighscore)
        editor.apply()

    }

    private fun loadHighScore() {
        val preferences = getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        mhighscore = preferences.getInt(HIGH_SCORE, 0)
        txtHighScore!!.text = "My High Score: $mhighscore"

    }

    companion object {

        private val REQUEST_CODE = 1
        val PREFS = "shared_prefs"
        val HIGH_SCORE = "high_score"
    }
}
