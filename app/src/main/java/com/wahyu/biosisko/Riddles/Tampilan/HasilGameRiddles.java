package com.wahyu.biosisko.Riddles.Tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wahyu.biosisko.R;
import com.wahyu.biosisko.Riddles.model.*;

import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_101;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_11;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_21;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_31;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_41;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_51;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_61;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_71;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_81;
import static com.wahyu.biosisko.Riddles.Tampilan.PlayGameRiddles.SOAL_91;

public class HasilGameRiddles extends AppCompatActivity {
    TextView editRid1;
    TextView editRid2;
    TextView editRid3;
    TextView editRid4;
    TextView editRid5;
    TextView editRid6;
    TextView editRid7;
    TextView editRid8;
    TextView editRid9;
    TextView editRid10;
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
        setContentView(R.layout.activity_riddles_hasil);
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

        editRid1 = findViewById(R.id.editRid1);
        editRid2 = findViewById(R.id.editRid2);
        editRid3 = findViewById(R.id.editRid3);
        editRid4 = findViewById(R.id.editRid4);
        editRid5 = findViewById(R.id.editRid5);
        editRid6 = findViewById(R.id.editRid6);
        editRid7 = findViewById(R.id.editRid7);
        editRid8 = findViewById(R.id.editRid8);
        editRid9 = findViewById(R.id.editRid9);
        editRid10 = findViewById(R.id.editRid10);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            jawabanRiddles1 j1 = extras.getParcelable(SOAL_11);
            jawabanRiddles2 j2 = extras.getParcelable(SOAL_21);
            jawabanRiddles3 j3 = extras.getParcelable(SOAL_31);
            jawabanRiddles4 j4 = extras.getParcelable(SOAL_41);
            jawabanRiddles5 j5 = extras.getParcelable(SOAL_51);
            jawabanRiddles6 j6 = extras.getParcelable(SOAL_61);
            jawabanRiddles7 j7 = extras.getParcelable(SOAL_71);
            jawabanRiddles8 j8 = extras.getParcelable(SOAL_81);
            jawabanRiddles9 j9 = extras.getParcelable(SOAL_91);
            jawabanRiddles10 j10 = extras.getParcelable(SOAL_101);

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

            if (soal11.equals("NEURON UNIPOLAR")){
                this.ket1.setText(benar);
                setScore(1);
            }
            else{
                this.ket1.setText(salah);
                this.ket1.setTextColor(Color.RED);
            }


            if (soal21.equals("1")){
                this.ket2.setText(benar);
                setScore(1);
            }
            else if (soal21.equals("SATU")){
                this.ket2.setText(benar);
                setScore(1);
            }
            else if (soal21.equals("NOMOR 1")){
                this.ket2.setText(benar);
                setScore(1);
            }
            else if (soal21.equals("NOMOR SATU")){
                this.ket2.setText(benar);
                setScore(1);
            }
            else{
                this.ket2.setText(salah);
                this.ket2.setTextColor(Color.RED);
            }


            if (soal31.equals("GENDANG TELINGA")){
                this.ket3.setText(benar);
                setScore(1);
            }
            else{
                this.ket3.setText(salah);
                this.ket3.setTextColor(Color.RED);
            }


            if (soal41.equals("1")){
                this.ket4.setText(benar);
                setScore(1);
            }
            else if (soal41.equals("SATU")){
                this.ket4.setText(benar);
                setScore(1);
            }
            else if (soal41.equals("NOMOR 1")){
                this.ket4.setText(benar);
                setScore(1);
            }
            else if (soal41.equals("NOMOR SATU")){
                this.ket4.setText(benar);
                setScore(1);
            }
            else{
                this.ket4.setText(salah);
                this.ket4.setTextColor(Color.RED);
            }


            if (soal51.equals("KELENJAR KERINGAT")){
                this.ket5.setText(benar);
                setScore(1);
            }
            else{
                this.ket5.setText(salah);
                this.ket5.setTextColor(Color.RED);
            }


            if (soal61.equals("8")){
                this.ket6.setText(benar);
                setScore(1);
            }
            else if (soal61.equals("DELAPAN")){
                this.ket6.setText(benar);
                setScore(1);
            }
            else if (soal61.equals("NOMOR 8")){
                this.ket6.setText(benar);
                setScore(1);
            }
            else if (soal61.equals("NOMOR DELAPAN")){
                this.ket6.setText(benar);
                setScore(1);
            }
            else{
                this.ket6.setText(salah);
                this.ket6.setTextColor(Color.RED);
            }



            if (soal71.equals("4")){
                this.ket7.setText(benar);
                setScore(1);
            }
            else if (soal71.equals("EMPAT")){
                this.ket7.setText(benar);
                setScore(1);
            }
            else if (soal71.equals("NOMOR 4")){
                this.ket7.setText(benar);
                setScore(1);
            }
            else if (soal71.equals("NOMOR EMPAT")){
                this.ket7.setText(benar);
                setScore(1);
            }
            else{
                this.ket7.setText(salah);
                this.ket7.setTextColor(Color.RED);
            }



            if (soal81.equals("LH")){
                this.ket8.setText(benar);
                setScore(1);
            }
            else if (soal81.equals("LH MENSTIMULASI SEKRESI ASI")){
                this.ket8.setText(benar);
                setScore(1);
            }
            else if (soal81.equals("LH MENSTIMULASI SEKRESI AIR SUSU")){
                this.ket8.setText(benar);
                setScore(1);
            }
            else{
                this.ket8.setText(salah);
                this.ket8.setTextColor(Color.RED);
            }


            if (soal91.equals("INSULIN")){
                this.ket9.setText(benar);
                setScore(1);
            }
            if (soal91.equals("HORMON INSULIN")){
                this.ket9.setText(benar);
                setScore(1);
            }
            else{
                this.ket9.setText(salah);
                this.ket9.setTextColor(Color.RED);
            }
            if (soal101.equals("LOBUS FRONTAL")){
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
            

            this.editRid1.setText(soal11);
            this.editRid2.setText(soal21);
            this.editRid3.setText(soal31);
            this.editRid4.setText(soal41);
            this.editRid5.setText(soal51);
            this.editRid6.setText(soal61);
            this.editRid7.setText(soal71);
            this.editRid8.setText(soal81);
            this.editRid9.setText(soal91);
            this.editRid10.setText(soal101);
        }
    }

    public void handlehome(View view) {
        Intent intent = new Intent(this, HomeGameRiddles.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, HomeGameRiddles.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

}