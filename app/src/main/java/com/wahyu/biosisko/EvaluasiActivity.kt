package com.wahyu.biosisko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyu.biosisko.CrossWords.Tampilan.HomeGameCrossword
import com.wahyu.biosisko.Matching.Tampilan.HomeGameMatching
import com.wahyu.biosisko.Riddles.Tampilan.HomeGameRiddles
import com.wahyu.biosisko.Quiz.HomeQuizActivity
import kotlinx.android.synthetic.main.activity_evaluasi.*

class EvaluasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_evaluasi)

        backtodash1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@EvaluasiActivity.finish()
        }

        cardQuiz.setOnClickListener {
            val intent = Intent(this, HomeQuizActivity::class.java)
            startActivity(intent)
        }

        cardDiskusi.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        cardMatching.setOnClickListener {
            val intent = Intent(this, HomeGameMatching::class.java)
            startActivity(intent)
        }

        cardRiddles.setOnClickListener {
            val intent = Intent(this, HomeGameRiddles::class.java)
            startActivity(intent)
        }

        cardTTS.setOnClickListener {
            val intent = Intent(this, HomeGameCrossword::class.java)
            startActivity(intent)
        }
    }
}
