package com.wahyu.biosisko.CrossWords.Tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wahyu.biosisko.R;
import com.wahyu.biosisko.CrossWords.model.*;

import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_1;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_10;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_2;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_3;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_4;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_5;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_6;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_7;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_8;
import static com.wahyu.biosisko.CrossWords.Tampilan.PlayGameCrossword.SOAL_9;

public class HasilGameCrossword extends AppCompatActivity {
    TextView edit11,edit12,edit13,edit14,edit15,edit16,edit17,edit18;
    TextView edit21,edit22,edit23,edit24,edit25,edit26,edit27,edit28;
    TextView edit31,edit32,edit33,edit34,edit35,edit36,edit37,edit38,edit39;
    TextView edit41,edit42,edit43,edit44,edit45,edit46,edit47,edit48,edit49;
    TextView edit51,edit52,edit53,edit54,edit55,edit56,edit57,edit58;
    TextView edit61,edit62,edit63,edit64,edit65,edit66,edit67;
    TextView edit71, edit72,edit73,edit74,edit75,edit76,edit77,edit78,edit79,edit710,edit711;
    TextView edit81,edit82,edit83,edit84,edit85,edit86;
    TextView edit91,edit92,edit93,edit94,edit95;
    TextView edit101,edit102,edit103,edit104,edit105,edit106;
    TextView ket1, ket2, ket3, ket4, ket5, ket6, ket7, ket8,ket9, ket10, hasil;
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
        setContentView(R.layout.activity_cross_hasil);
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

        edit11 = findViewById(R.id.edit11);
        edit12 = findViewById(R.id.edit12);
        edit13 = findViewById(R.id.edit13);
        edit14 = findViewById(R.id.edit14);
        edit15 = findViewById(R.id.edit15);
        edit16 = findViewById(R.id.edit16);
        edit17 = findViewById(R.id.edit17);
        edit18 = findViewById(R.id.edit18);

        edit21 = findViewById(R.id.edit21);
        edit22 = findViewById(R.id.edit22);
        edit23 = findViewById(R.id.edit23);
        edit24 = findViewById(R.id.edit24);
        edit25 = findViewById(R.id.edit25);
        edit26 = findViewById(R.id.edit26);
        edit27 = findViewById(R.id.edit27);
        edit28 = findViewById(R.id.edit28);

        edit31 = findViewById(R.id.edit31);
        edit32 = findViewById(R.id.edit32);
        edit33 = findViewById(R.id.edit33);
        edit34 = findViewById(R.id.edit34);
        edit35 = findViewById(R.id.edit35);
        edit36 = findViewById(R.id.edit36);
        edit37 = findViewById(R.id.edit37);
        edit38 = findViewById(R.id.edit38);
        edit39 = findViewById(R.id.edit39);

        edit41 = findViewById(R.id.edit41);
        edit42 = findViewById(R.id.edit42);
        edit43 = findViewById(R.id.edit43);
        edit44 = findViewById(R.id.edit44);
        edit45 = findViewById(R.id.edit45);
        edit46 = findViewById(R.id.edit46);
        edit47 = findViewById(R.id.edit47);
        edit48 = findViewById(R.id.edit48);
        edit49 = findViewById(R.id.edit49);

        edit51 = findViewById(R.id.edit51);
        edit52 = findViewById(R.id.edit52);
        edit53 = findViewById(R.id.edit53);
        edit54 = findViewById(R.id.edit54);
        edit55 = findViewById(R.id.edit55);
        edit56 = findViewById(R.id.edit56);
        edit57 = findViewById(R.id.edit57);
        edit58 = findViewById(R.id.edit58);

        edit61 = findViewById(R.id.edit61);
        edit62 = findViewById(R.id.edit62);
        edit63 = findViewById(R.id.edit63);
        edit64 = findViewById(R.id.edit64);
        edit65 = findViewById(R.id.edit65);
        edit66 = findViewById(R.id.edit66);
        edit67 = findViewById(R.id.edit67);

        edit71 = findViewById(R.id.edit71);
        edit72 = findViewById(R.id.edit72);
        edit73 = findViewById(R.id.edit73);
        edit74 = findViewById(R.id.edit74);
        edit75 = findViewById(R.id.edit75);
        edit76 = findViewById(R.id.edit76);
        edit77 = findViewById(R.id.edit77);
        edit78 = findViewById(R.id.edit78);
        edit79 = findViewById(R.id.edit79);
        edit710 = findViewById(R.id.edit710);
        edit711 = findViewById(R.id.edit711);

        edit81 = findViewById(R.id.edit81);
        edit82 = findViewById(R.id.edit82);
        edit83 = findViewById(R.id.edit83);
        edit84 = findViewById(R.id.edit84);
        edit85 = findViewById(R.id.edit85);
        edit86 = findViewById(R.id.edit86);

        edit91 = findViewById(R.id.edit91);
        edit92 = findViewById(R.id.edit92);
        edit93 = findViewById(R.id.edit93);
        edit94 = findViewById(R.id.edit94);
        edit95 = findViewById(R.id.edit95);

        edit101 = findViewById(R.id.edit101);
        edit102 = findViewById(R.id.edit102);
        edit103 = findViewById(R.id.edit103);
        edit104 = findViewById(R.id.edit104);
        edit105 = findViewById(R.id.edit105);
        edit106 = findViewById(R.id.edit106);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            jawabanCrossword1 j1 = extras.getParcelable(SOAL_1);
            jawabanCrossword2 j2 = extras.getParcelable(SOAL_2);
            jawabanCrossword3 j3 = extras.getParcelable(SOAL_3);
            jawabanCrossword4 j4 = extras.getParcelable(SOAL_4);
            jawabanCrossword5 j5 = extras.getParcelable(SOAL_5);
            jawabanCrossword6 j6 = extras.getParcelable(SOAL_6);
            jawabanCrossword7 j7 = extras.getParcelable(SOAL_7);
            jawabanCrossword8 j8 = extras.getParcelable(SOAL_8);
            jawabanCrossword9 j9 = extras.getParcelable(SOAL_9);
            jawabanCrossword10 j10 = extras.getParcelable(SOAL_10);

            String soal11 = j1.getSoal11().toUpperCase();
            String soal12 = j1.getSoal12().toUpperCase();
            String soal14 = j1.getSoal14().toUpperCase();
            String soal15 = j1.getSoal15().toUpperCase();
            String soal17 = j1.getSoal17().toUpperCase();
            String soal18 = j1.getSoal18().toUpperCase();

            String soal21 = j2.getSoal21().toUpperCase();
            String soal23 = j2.getSoal23().toUpperCase();
            String soal24 = j2.getSoal24().toUpperCase();
            String soal25 = j2.getSoal25().toUpperCase();
            String soal26 = j2.getSoal26().toUpperCase();
            String soal27 = j2.getSoal27().toUpperCase();
            String soal28 = j2.getSoal28().toUpperCase();

            String soal31 = j3.getSoal31().toUpperCase();
            String soal32 = j3.getSoal32().toUpperCase();
            String soal33 = j3.getSoal33().toUpperCase();
            String soal34 = j3.getSoal34().toUpperCase();
            String soal35 = j3.getSoal35().toUpperCase();
            String soal36 = j3.getSoal36().toUpperCase();
            String soal37 = j3.getSoal37().toUpperCase();
            String soal38 = j3.getSoal38().toUpperCase();
            String soal39 = j3.getSoal39().toUpperCase();

            String soal42 = j4.getSoal42().toUpperCase();
            String soal43 = j4.getSoal43().toUpperCase();
            String soal44 = j4.getSoal44().toUpperCase();
            String soal45 = j4.getSoal45().toUpperCase();
            String soal46 = j4.getSoal46().toUpperCase();
            String soal47 = j4.getSoal47().toUpperCase();
            String soal49 = j4.getSoal49().toUpperCase();

            String soal51 = j5.getSoal51().toUpperCase();
            String soal52 = j5.getSoal52().toUpperCase();
            String soal53 = j5.getSoal53().toUpperCase();
            String soal54 = j5.getSoal54().toUpperCase();
            String soal55 = j5.getSoal55().toUpperCase();
            String soal56 = j5.getSoal56().toUpperCase();
            String soal57 = j5.getSoal57().toUpperCase();
            String soal58 = j5.getSoal58().toUpperCase();

            String soal61 = j6.getSoal61().toUpperCase();
            String soal62 = j6.getSoal62().toUpperCase();
            String soal64 = j6.getSoal64().toUpperCase();
            String soal65 = j6.getSoal65().toUpperCase();
            String soal67 = j6.getSoal67().toUpperCase();

            String soal71 = j7.getSoal71().toUpperCase();
            String soal72 = j7.getSoal72().toUpperCase();
            String soal73 = j7.getSoal73().toUpperCase();
            String soal74 = j7.getSoal74().toUpperCase();
            String soal75 = j7.getSoal75().toUpperCase();
            String soal76 = j7.getSoal76().toUpperCase();
            String soal77 = j7.getSoal77().toUpperCase();
            String soal78 = j7.getSoal78().toUpperCase();
            String soal79 = j7.getSoal79().toUpperCase();
            String soal710 = j7.getSoal710().toUpperCase();
            String soal711 = j7.getSoal711().toUpperCase();

            String soal82 = j8.getSoal82().toUpperCase();
            String soal83 = j8.getSoal83().toUpperCase();
            String soal85 = j8.getSoal85().toUpperCase();
            String soal86 = j8.getSoal86().toUpperCase();

            String soal91 = j9.getSoal91().toUpperCase();
            String soal92 = j9.getSoal92().toUpperCase();
            String soal93 = j9.getSoal93().toUpperCase();
            String soal94 = j9.getSoal94().toUpperCase();
            String soal95 = j9.getSoal95().toUpperCase();

            String soal101 = j10.getSoal101().toUpperCase();
            String soal102 = j10.getSoal102().toUpperCase();
            String soal103 = j10.getSoal103().toUpperCase();
            String soal104 = j10.getSoal104().toUpperCase();
            String soal105 = j10.getSoal105().toUpperCase();
            String soal106 = j10.getSoal106().toUpperCase();

            if (soal11.equals("G") && soal12.equals("A") && soal37.equals("N") && soal14.equals("G") && soal15.equals("L") && soal52.equals("I") && soal17.equals("O") && soal18.equals("N")){
                this.ket1.setText(benar);
                setScore(1);
            }
            else{
                this.ket1.setText(salah);
                this.ket1.setTextColor(Color.RED);
            }
            if (soal21.equals("C") && soal32.equals("E") && soal23.equals("R") && soal24.equals("E") && soal25.equals("B") && soal26.equals("R") && soal27.equals("U") && soal28.equals("M")){
                this.ket2.setText(benar);
                setScore(1);
            }
            else{
                this.ket2.setText(salah);
                this.ket2.setTextColor(Color.RED);
            }
            if (soal31.equals("M") && soal32.equals("E") && soal33.equals("L") && soal34.equals("A") && soal35.equals("T") && soal36.equals("O") && soal37.equals("N") && soal38.equals("I") && soal39.equals("N")){
                this.ket3.setText(benar);
                setScore(1);
            }
            else{
                this.ket3.setText(salah);
                this.ket3.setTextColor(Color.RED);
            }
            if (soal34.equals("A") && soal42.equals("R") && soal43.equals("A") && soal44.equals("C") && soal45.equals("H") && soal46.equals("N") && soal47.equals("O") && soal71.equals("I") && soal49.equals("D")){
                this.ket4.setText(benar);
                setScore(1);
            }
            else{
                this.ket4.setText(salah);
                this.ket4.setTextColor(Color.RED);
            }
            if (soal51.equals("S") && soal52.equals("I") && soal53.equals("N") && soal54.equals("A") && soal55.equals("P") && soal56.equals("S") && soal57.equals("I") && soal58.equals("S")){
                this.ket5.setText(benar);
                setScore(1);
            }
            else{
                this.ket5.setText(salah);
                this.ket5.setTextColor(Color.RED);
            }
            if (soal61.equals("D") && soal62.equals("E") && soal76.equals("N") && soal64.equals("D") && soal65.equals("R") && soal101.equals("I") && soal67.equals("T")){
                this.ket6.setText(benar);
                setScore(1);
            }
            else{
                this.ket6.setText(salah);
                this.ket6.setTextColor(Color.RED);
            }
            if (soal71.equals("I") && soal72.equals("N") && soal73.equals("T") && soal74.equals("E") && soal75.equals("R") && soal76.equals("N") && soal77.equals("E") && soal78.equals("U") && soal79.equals("R") && soal710.equals("O") && soal711.equals("N")){
                this.ket7.setText(benar);
                setScore(1);
            }
            else{
                this.ket7.setText(salah);
                this.ket7.setTextColor(Color.RED);
            }
            if (soal73.equals("T") && soal82.equals("I") && soal83.equals("R") && soal94.equals("O") && soal85.equals("I") && soal86.equals("D")){
                this.ket8.setText(benar);
                setScore(1);
            }
            else{
                this.ket8.setText(salah);
                this.ket8.setTextColor(Color.RED);
            }
            if (soal91.equals("A") && soal92.equals("K") && soal93.equals("S") && soal94.equals("O") && soal95.equals("N")){
                this.ket9.setText(benar);
                setScore(1);
            }
            else{
                this.ket9.setText(salah);
                this.ket9.setTextColor(Color.RED);
            }
            if (soal101.equals("I") && soal102.equals("M") && soal103.equals("P") && soal104.equals("U") && soal105.equals("L") && soal106.equals("S")){
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

            this.edit11.setText(soal11);
            this.edit12.setText(soal12);
            this.edit13.setText(soal37);
            this.edit14.setText(soal14);
            this.edit15.setText(soal15);
            this.edit16.setText(soal52);
            this.edit17.setText(soal17);
            this.edit18.setText(soal18);

            this.edit21.setText(soal21);
            this.edit22.setText(soal32);
            this.edit23.setText(soal23);
            this.edit24.setText(soal24);
            this.edit25.setText(soal25);
            this.edit26.setText(soal26);
            this.edit27.setText(soal27);
            this.edit28.setText(soal28);

            this.edit31.setText(soal31);
            this.edit32.setText(soal32);
            this.edit33.setText(soal33);
            this.edit34.setText(soal34);
            this.edit35.setText(soal35);
            this.edit36.setText(soal36);
            this.edit37.setText(soal37);
            this.edit38.setText(soal38);
            this.edit39.setText(soal39);

            this.edit41.setText(soal34);
            this.edit42.setText(soal42);
            this.edit43.setText(soal43);
            this.edit44.setText(soal44);
            this.edit45.setText(soal45);
            this.edit46.setText(soal46);
            this.edit47.setText(soal47);
            this.edit48.setText(soal71);
            this.edit49.setText(soal49);

            this.edit51.setText(soal51);
            this.edit52.setText(soal52);
            this.edit53.setText(soal53);
            this.edit54.setText(soal54);
            this.edit55.setText(soal55);
            this.edit56.setText(soal56);
            this.edit57.setText(soal57);
            this.edit58.setText(soal58);

            this.edit61.setText(soal61);
            this.edit62.setText(soal62);
            this.edit63.setText(soal76);
            this.edit64.setText(soal64);
            this.edit65.setText(soal65);
            this.edit66.setText(soal101);
            this.edit67.setText(soal67);

            this.edit71.setText(soal71);
            this.edit72.setText(soal72);
            this.edit73.setText(soal73);
            this.edit74.setText(soal74);
            this.edit75.setText(soal75);
            this.edit76.setText(soal76);
            this.edit77.setText(soal77);
            this.edit78.setText(soal78);
            this.edit79.setText(soal79);
            this.edit710.setText(soal710);
            this.edit711.setText(soal711);

            this.edit81.setText(soal73);
            this.edit82.setText(soal82);
            this.edit83.setText(soal83);
            this.edit84.setText(soal94);
            this.edit85.setText(soal85);
            this.edit86.setText(soal86);

            this.edit91.setText(soal91);
            this.edit92.setText(soal92);
            this.edit93.setText(soal93);
            this.edit94.setText(soal94);
            this.edit95.setText(soal95);

            this.edit101.setText(soal101);
            this.edit102.setText(soal102);
            this.edit103.setText(soal103);
            this.edit104.setText(soal104);
            this.edit105.setText(soal105);
            this.edit106.setText(soal106);
        }
    }

    public void handlehome(View view) {
        Intent intent = new Intent(this, HomeGameCrossword.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
    
    public void onBackPressed() {
        Intent intent = new Intent(this, HomeGameCrossword.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
