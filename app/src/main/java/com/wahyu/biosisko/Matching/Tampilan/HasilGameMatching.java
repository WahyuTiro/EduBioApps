package com.wahyu.biosisko.Matching.Tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wahyu.biosisko.R;
import com.wahyu.biosisko.Matching.model.*;

import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_101;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_11;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_21;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_31;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_41;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_51;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_61;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_71;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_81;
import static com.wahyu.biosisko.Matching.Tampilan.PlayGameMatching.SOAL_91;

public class HasilGameMatching extends AppCompatActivity {
    TextView editMath1;
    TextView editMath2;
    TextView editMath3;
    TextView editMath4;
    TextView editMath5;
    TextView editMath6;
    TextView editMath7;
    TextView editMath8;
    TextView editMath9;
    TextView editMath10;
    TextView ket1, ket2, ket3, ket4, ket5, ket6, ket7, ket8, ket9, ket10, hasil;
    String benar = "*Jawaban Benar";
    String salah = "*Jawaban Salah";
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = (this.score) + score*10;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_hasil);
        ket1 = findViewById(R.id.ket1);
        ket2 = findViewById(R.id.ket2);
        ket3 = findViewById(R.id.ket3);
        ket4 = findViewById(R.id.ket4);
        ket5 = findViewById(R.id.ket5);
        ket6 = findViewById(R.id.ket6);
        ket7 = findViewById(R.id.ket7);
        ket8 = findViewById(R.id.ket8);
        ket9 = findViewById(R.id.ket9);
        ket10 = findViewById(R.id.ket10);
        hasil = findViewById(R.id.score);

        editMath1 = findViewById(R.id.editMath1);
        editMath2 = findViewById(R.id.editMath2);
        editMath3 = findViewById(R.id.editMath3);
        editMath4 = findViewById(R.id.editMath4);
        editMath5 = findViewById(R.id.editMath5);
        editMath6 = findViewById(R.id.editMath6);
        editMath7 = findViewById(R.id.editMath7);
        editMath8 = findViewById(R.id.editMath8);
        editMath9 = findViewById(R.id.editMath9);
        editMath10 = findViewById(R.id.editMath10);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            jawabanMatching1 j1 = extras.getParcelable(SOAL_11);
            jawabanMatching2 j2 = extras.getParcelable(SOAL_21);
            jawabanMatching3 j3 = extras.getParcelable(SOAL_31);
            jawabanMatching4 j4 = extras.getParcelable(SOAL_41);
            jawabanMatching5 j5 = extras.getParcelable(SOAL_51);
            jawabanMatching6 j6 = extras.getParcelable(SOAL_61);
            jawabanMatching7 j7 = extras.getParcelable(SOAL_71);
            jawabanMatching8 j8 = extras.getParcelable(SOAL_81);
            jawabanMatching9 j9 = extras.getParcelable(SOAL_91);
            jawabanMatching10 j10 = extras.getParcelable(SOAL_101);

            String soal11 = j1.getSoal11().toUpperCase();
            String soal21 = j2.getSoal21().toUpperCase();
            String soal31 = j3.getSoal31().toUpperCase();
            String soal41 = j4.getSoal41().toUpperCase();
            String soal51 = j5.getSoal51().toUpperCase();
            String soal61 = j6.getSoal61().toUpperCase();
            String soal71 = j7.getSoal71().toUpperCase();
            String soal81 = j8.getSoal81().toUpperCase();
            String soal91 = j9.getSoal91().toUpperCase();
            String soal101 = j10.getSoal101().toUpperCase();

            if (soal11.equals("G")){
                this.ket1.setText(benar);
                setScore(1);
            }
            else{
                this.ket1.setText(salah);
                this.ket1.setTextColor(Color.RED);
            }
            if (soal21.equals("I")){
                this.ket2.setText(benar);
                setScore(1);
            }
            else{
                this.ket2.setText(salah);
                this.ket2.setTextColor(Color.RED);
            }
            if (soal31.equals("A")){
                this.ket3.setText(benar);
                setScore(1);
            }
            else{
                this.ket3.setText(salah);
                this.ket3.setTextColor(Color.RED);
            }
            if (soal41.equals("C")){
                this.ket4.setText(benar);
                setScore(1);
            }
            else{
                this.ket4.setText(salah);
                this.ket4.setTextColor(Color.RED);
            }
            if (soal51.equals("F")){
                this.ket5.setText(benar);
                setScore(1);
            }
            else{
                this.ket5.setText(salah);
                this.ket5.setTextColor(Color.RED);
            }
            if (soal61.equals("H")){
                this.ket6.setText(benar);
                setScore(1);
            }
            else{
                this.ket6.setText(salah);
                this.ket6.setTextColor(Color.RED);
            }
            if (soal71.equals("J")){
                this.ket7.setText(benar);
                setScore(1);
            }
            else{
                this.ket7.setText(salah);
                this.ket7.setTextColor(Color.RED);
            }
            if (soal81.equals("B")){
                this.ket8.setText(benar);
                setScore(1);
            }
            else{
                this.ket8.setText(salah);
                this.ket8.setTextColor(Color.RED);
            }
            if (soal91.equals("D")){
                this.ket9.setText(benar);
                setScore(1);
            }
            else{
                this.ket9.setText(salah);
                this.ket9.setTextColor(Color.RED);
            }
            if (soal101.equals("E")){
                this.ket10.setText(benar);
                setScore(1);
            }
            else{
                this.ket10.setText(salah);
                this.ket10.setTextColor(Color.RED);
            }


            if (getScore() < 0){
                setScore(0);
                this.hasil.setText(String.valueOf(getScore()));
            }else {
                this.hasil.setText(String.valueOf(getScore()));
            }

            this.editMath1.setText(soal11);
            this.editMath2.setText(soal21);
            this.editMath3.setText(soal31);
            this.editMath4.setText(soal41);
            this.editMath5.setText(soal51);
            this.editMath6.setText(soal61);
            this.editMath7.setText(soal71);
            this.editMath8.setText(soal81);
            this.editMath9.setText(soal91);
            this.editMath10.setText(soal101);
        }
    }

    public void handlehome(View view) {
        Intent intent = new Intent(this, HomeGameMatching.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, HomeGameMatching.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}