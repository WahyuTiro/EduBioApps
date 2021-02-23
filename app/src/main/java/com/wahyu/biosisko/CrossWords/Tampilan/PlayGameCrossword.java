package com.wahyu.biosisko.CrossWords.Tampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wahyu.biosisko.CrossWords.Fragment.*;
import com.wahyu.biosisko.R;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword1;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword2;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword3;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword4;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword5;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword6;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword7;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword8;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword9;
import com.wahyu.biosisko.CrossWords.model.jawabanCrossword10;

public class PlayGameCrossword extends AppCompatActivity {

    public static final String SOAL_1 = "soal1";
    public static final String SOAL_2 = "soal2";
    public static final String SOAL_3 = "soal3";
    public static final String SOAL_4 = "soal4";
    public static final String SOAL_5 = "soal5";
    public static final String SOAL_6 = "soal6";
    public static final String SOAL_7 = "soal7";
    public static final String SOAL_8 = "soal8";
    public static final String SOAL_9 = "soal9";
    public static final String SOAL_10 = "soal10";

    jawabanCrossword1 j1;
    jawabanCrossword2 j2;
    jawabanCrossword3 j3;
    jawabanCrossword4 j4;
    jawabanCrossword5 j5;
    jawabanCrossword6 j6;
    jawabanCrossword7 j7;
    jawabanCrossword8 j8;
    jawabanCrossword9 j9;
    jawabanCrossword10 j10;

    EditText edit11,edit12,edit14,edit15,edit17,edit18;
    EditText edit21,edit23,edit24,edit25,edit26,edit27,edit28;
    EditText edit31,edit32,edit33,edit34,edit35,edit36,edit37,edit38,edit39;
    EditText edit42,edit43,edit44,edit45,edit46,edit47,edit49;
    EditText edit51,edit52,edit53,edit54,edit55,edit56,edit57,edit58;
    EditText edit61,edit62,edit64,edit65,edit67;
    EditText edit71, edit72,edit73,edit74,edit75,edit76,edit77,edit78,edit79,edit710,edit711;
    EditText edit82,edit83,edit85,edit86;
    EditText edit91,edit92,edit93,edit94,edit95;
    EditText edit101,edit102,edit103,edit104,edit105,edit106;
    Button buttonhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_play);

        edit11 = findViewById(R.id.edit11);
        edit12 = findViewById(R.id.edit12);
        edit14 = findViewById(R.id.edit14);
        edit15 = findViewById(R.id.edit15);
        edit17 = findViewById(R.id.edit17);
        edit18 = findViewById(R.id.edit18);

        edit21 = findViewById(R.id.edit21);
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

        edit42 = findViewById(R.id.edit42);
        edit43 = findViewById(R.id.edit43);
        edit44 = findViewById(R.id.edit44);
        edit45 = findViewById(R.id.edit45);
        edit46 = findViewById(R.id.edit46);
        edit47 = findViewById(R.id.edit47);
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
        edit64 = findViewById(R.id.edit64);
        edit65 = findViewById(R.id.edit65);
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

        edit82 = findViewById(R.id.edit82);
        edit83 = findViewById(R.id.edit83);
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

        buttonhasil = findViewById(R.id.button_hasil);
        buttonhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit11.length()==0 || edit12.length()==0 || edit14.length()==0 || edit15.length()==0 || edit17.length()==0 || edit18.length()==0) {
                    Toast.makeText(PlayGameCrossword.this, "No. 1 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit21.length()==0 || edit23.length()==0 || edit24.length()==0 || edit25.length()==0 || edit26.length()==0 || edit27.length()==0 || edit28.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 2 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit31.length()==0 || edit32.length()==0 || edit33.length()==0 || edit34.length()==0 || edit35.length()==0 || edit36.length()==0 || edit37.length()==0 || edit38.length()==0 || edit39.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 3 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit42.length()==0 || edit43.length()==0 || edit44.length()==0 || edit45.length()==0 || edit46.length()==0 || edit47.length()==0 || edit49.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 4 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit51.length()==0 || edit52.length()==0 || edit53.length()==0 || edit54.length()==0 || edit55.length()==0 || edit56.length()==0 || edit57.length()==0 || edit58.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 5 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit61.length()==0 || edit62.length()==0 || edit64.length()==0 || edit65.length()==0 || edit67.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 6 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit71.length()==0 || edit72.length()==0 || edit73.length()==0 || edit74.length()==0 || edit75.length()==0 || edit76.length()==0 || edit77.length()==0 || edit78.length()==0 || edit79.length()==0 || edit710.length()==0 || edit711.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 7 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit82.length()==0 || edit83.length()==0 || edit85.length()==0 || edit86.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 8 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit91.length()==0 || edit92.length()==0 || edit93.length()==0 || edit94.length()==0  || edit95.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 9 belum terisi penuh", Toast.LENGTH_LONG).show();
                }else if(edit101.length()==0 || edit102.length()==0 || edit103.length()==0 || edit104.length()==0 || edit105.length()==0 || edit106.length()==0){
                    Toast.makeText(PlayGameCrossword.this, "No. 10 belum terisi penuh", Toast.LENGTH_LONG).show();
                }
                else {
                    handlehasil();
                }
            }
        });
    }

    public void soal1(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal1Fragment soal1Fragment = (Soal1Fragment) getSupportFragmentManager().findFragmentByTag("SOAL1_FRAGMENT");
        if(soal1Fragment != null && soal1Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal1Fragment(), "SOAL1_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal2(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal2Fragment soal2_fragment = (Soal2Fragment) getSupportFragmentManager().findFragmentByTag("SOAL2_FRAGMENT");
        if(soal2_fragment != null && soal2_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal2Fragment(), "SOAL2_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal3(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal3Fragment soal3_fragment = (Soal3Fragment) getSupportFragmentManager().findFragmentByTag("SOAL3_FRAGMENT");
        if(soal3_fragment != null && soal3_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal3Fragment(), "SOAL3_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal4(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal4Fragment soal4_fragment = (Soal4Fragment) getSupportFragmentManager().findFragmentByTag("SOAL4_FRAGMENT");
        if(soal4_fragment != null && soal4_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal4Fragment(), "SOAL4_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal5(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal5Fragment soal5_fragment = (Soal5Fragment) getSupportFragmentManager().findFragmentByTag("SOAL5_FRAGMENT");
        if(soal5_fragment != null && soal5_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal5Fragment(), "SOAL5_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal6(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal6Fragment soal6_fragment = (Soal6Fragment) getSupportFragmentManager().findFragmentByTag("SOAL6_FRAGMENT");
        if(soal6_fragment != null && soal6_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal6Fragment(), "SOAL6_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal7(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal7Fragment soal7_fragment = (Soal7Fragment) getSupportFragmentManager().findFragmentByTag("SOAL7_FRAGMENT");
        if(soal7_fragment != null && soal7_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal7Fragment(), "SOAL7_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal8(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal8Fragment soal8_fragment = (Soal8Fragment) getSupportFragmentManager().findFragmentByTag("SOAL8_FRAGMENT");
        if(soal8_fragment != null && soal8_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal8Fragment(), "SOAL8_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal9(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal9Fragment soal9_fragment = (Soal9Fragment) getSupportFragmentManager().findFragmentByTag("SOAL9_FRAGMENT");
        if(soal9_fragment != null && soal9_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal9Fragment(), "SOAL9_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal10(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Soal10Fragment soal10_fragment = (Soal10Fragment) getSupportFragmentManager().findFragmentByTag("SOAL10_FRAGMENT");
        if(soal10_fragment != null && soal10_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal9Fragment(), "SOAL9_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void handlehasil() {

        String edit_11 = edit11.getText().toString();
        String edit_12 = edit12.getText().toString();
        String edit_14 = edit14.getText().toString();
        String edit_15 = edit15.getText().toString();
        String edit_17 = edit17.getText().toString();
        String edit_18 = edit18.getText().toString();

        String edit_21 = edit21.getText().toString();
        String edit_23 = edit23.getText().toString();
        String edit_24 = edit24.getText().toString();
        String edit_25 = edit25.getText().toString();
        String edit_26 = edit26.getText().toString();
        String edit_27 = edit27.getText().toString();
        String edit_28 = edit28.getText().toString();

        String edit_31 = edit31.getText().toString();
        String edit_32 = edit32.getText().toString();
        String edit_33 = edit33.getText().toString();
        String edit_34 = edit34.getText().toString();
        String edit_35 = edit35.getText().toString();
        String edit_36 = edit36.getText().toString();
        String edit_37 = edit37.getText().toString();
        String edit_38 = edit38.getText().toString();
        String edit_39 = edit39.getText().toString();

        String edit_42 = edit42.getText().toString();
        String edit_43 = edit43.getText().toString();
        String edit_44 = edit44.getText().toString();
        String edit_45 = edit45.getText().toString();
        String edit_46 = edit46.getText().toString();
        String edit_47 = edit47.getText().toString();
        String edit_49 = edit49.getText().toString();

        String edit_51 = edit51.getText().toString();
        String edit_52 = edit52.getText().toString();
        String edit_53 = edit53.getText().toString();
        String edit_54 = edit54.getText().toString();
        String edit_55 = edit55.getText().toString();
        String edit_56 = edit56.getText().toString();
        String edit_57 = edit57.getText().toString();
        String edit_58 = edit58.getText().toString();

        String edit_61 = edit61.getText().toString();
        String edit_62 = edit62.getText().toString();
        String edit_64 = edit64.getText().toString();
        String edit_65 = edit65.getText().toString();
        String edit_67 = edit67.getText().toString();

        String edit_71 = edit71.getText().toString();
        String edit_72 = edit72.getText().toString();
        String edit_73 = edit73.getText().toString();
        String edit_74 = edit74.getText().toString();
        String edit_75 = edit75.getText().toString();
        String edit_76 = edit76.getText().toString();
        String edit_77 = edit77.getText().toString();
        String edit_78 = edit78.getText().toString();
        String edit_79 = edit79.getText().toString();
        String edit_710 = edit710.getText().toString();
        String edit_711 = edit711.getText().toString();

        String edit_82 = edit82.getText().toString();
        String edit_83 = edit83.getText().toString();
        String edit_85 = edit85.getText().toString();
        String edit_86 = edit86.getText().toString();

        String edit_91 = edit91.getText().toString();
        String edit_92 = edit92.getText().toString();
        String edit_93 = edit93.getText().toString();
        String edit_94 = edit94.getText().toString();
        String edit_95 = edit95.getText().toString();

        String edit_101 = edit101.getText().toString();
        String edit_102 = edit102.getText().toString();
        String edit_103 = edit103.getText().toString();
        String edit_104 = edit104.getText().toString();
        String edit_105 = edit105.getText().toString();
        String edit_106 = edit106.getText().toString();

        j1 = new jawabanCrossword1(edit_11, edit_12, edit_14, edit_15, edit_17, edit_18);
        j2 = new jawabanCrossword2(edit_21, edit_23, edit_24, edit_25, edit_26, edit_27, edit_28);
        j3 = new jawabanCrossword3(edit_31, edit_32, edit_33, edit_34, edit_35, edit_36, edit_37, edit_38, edit_39);
        j4 = new jawabanCrossword4(edit_42, edit_43, edit_44, edit_45, edit_46, edit_47, edit_49);
        j5 = new jawabanCrossword5(edit_51, edit_52, edit_53, edit_54, edit_55, edit_56, edit_57, edit_58);
        j6 = new jawabanCrossword6(edit_61, edit_62, edit_64, edit_65, edit_67);
        j7 = new jawabanCrossword7(edit_71, edit_72, edit_73, edit_74, edit_75, edit_76, edit_77, edit_78, edit_79, edit_710, edit_711);
        j8 = new jawabanCrossword8(edit_82, edit_83, edit_85, edit_86);
        j9 = new jawabanCrossword9(edit_91, edit_92, edit_93, edit_94, edit_95);
        j10 = new jawabanCrossword10(edit_101, edit_102, edit_103, edit_104, edit_105, edit_106);

        Intent intent = new Intent(this, HasilGameCrossword.class);
        intent.putExtra(SOAL_1, j1);
        intent.putExtra(SOAL_2, j2);
        intent.putExtra(SOAL_3, j3);
        intent.putExtra(SOAL_4, j4);
        intent.putExtra(SOAL_5, j5);
        intent.putExtra(SOAL_6, j6);
        intent.putExtra(SOAL_7, j7);
        intent.putExtra(SOAL_8, j8);
        intent.putExtra(SOAL_9, j9);
        intent.putExtra(SOAL_10, j10);
        startActivity(intent);

    }
}
