package com.wahyu.biosisko.Riddles.Tampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wahyu.biosisko.Riddles.Fragment.*;
import com.wahyu.biosisko.R;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles1;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles2;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles3;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles4;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles5;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles6;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles7;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles8;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles9;
import com.wahyu.biosisko.Riddles.model.jawabanRiddles10;

public class PlayGameRiddles extends AppCompatActivity {

    public static final String SOAL_11 = "soal11";
    public static final String SOAL_21 = "soal21";
    public static final String SOAL_31 = "soal31";
    public static final String SOAL_41 = "soal41";
    public static final String SOAL_51 = "soal51";
    public static final String SOAL_61 = "soal61";
    public static final String SOAL_71 = "soal71";
    public static final String SOAL_81 = "soal81";
    public static final String SOAL_91 = "soal91";
    public static final String SOAL_101 = "soal101";

    jawabanRiddles1 j1;
    jawabanRiddles2 j2;
    jawabanRiddles3 j3;
    jawabanRiddles4 j4;
    jawabanRiddles5 j5;
    jawabanRiddles6 j6;
    jawabanRiddles7 j7;
    jawabanRiddles8 j8;
    jawabanRiddles9 j9;
    jawabanRiddles10 j10;

    EditText editRid1;
    EditText editRid2;
    EditText editRid3;
    EditText editRid4;
    EditText editRid5;
    EditText editRid6;
    EditText editRid7;
    EditText editRid8;
    EditText editRid9;
    EditText editRid10;

    Button buttonhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddles_play);

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


        buttonhasil = findViewById(R.id.button_hasil);
        buttonhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editRid1.length()==0) {
                    Toast.makeText(PlayGameRiddles.this, "No. 1 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid2.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 2 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid3.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 3 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid4.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 4 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid5.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 5 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid6.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 6 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid7.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 7 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid8.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 8 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid9.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 9 belum terisi", Toast.LENGTH_LONG).show();
                }else if(editRid10.length()==0){
                    Toast.makeText(PlayGameRiddles.this, "No. 10 belum terisi", Toast.LENGTH_LONG).show();
                }
                else {
                    handlehasil();
                }
            }
        });
    }

    public void soal11(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal1Fragment soal1Fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal1Fragment) getSupportFragmentManager().findFragmentByTag("SOAL1_FRAGMENT");
        if(soal1Fragment != null && soal1Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal1Fragment(), "SOAL1_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal21(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal2Fragment soal2_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal2Fragment) getSupportFragmentManager().findFragmentByTag("SOAL2_FRAGMENT");
        if(soal2_fragment != null && soal2_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal2Fragment(), "SOAL2_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal31(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal3Fragment soal3_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal3Fragment) getSupportFragmentManager().findFragmentByTag("SOAL3_FRAGMENT");
        if(soal3_fragment != null && soal3_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal3Fragment(), "SOAL3_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal41(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal4Fragment soal4_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal4Fragment) getSupportFragmentManager().findFragmentByTag("SOAL4_FRAGMENT");
        if(soal4_fragment != null && soal4_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal4Fragment(), "SOAL4_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal51(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal5Fragment soal5_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal5Fragment) getSupportFragmentManager().findFragmentByTag("SOAL5_FRAGMENT");
        if(soal5_fragment != null && soal5_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal5Fragment(), "SOAL5_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal61(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal6Fragment soal6_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal6Fragment) getSupportFragmentManager().findFragmentByTag("SOAL6_FRAGMENT");
        if(soal6_fragment != null && soal6_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal6Fragment(), "SOAL6_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal71(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal7Fragment soal7_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal7Fragment) getSupportFragmentManager().findFragmentByTag("SOAL7_FRAGMENT");
        if(soal7_fragment != null && soal7_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal7Fragment(), "SOAL7_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal81(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal8Fragment soal8_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal8Fragment) getSupportFragmentManager().findFragmentByTag("SOAL8_FRAGMENT");
        if(soal8_fragment != null && soal8_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal8Fragment(), "SOAL8_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal91(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal9Fragment soal9_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal9Fragment) getSupportFragmentManager().findFragmentByTag("SOAL9_FRAGMENT");
        if(soal9_fragment != null && soal9_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Riddles.Fragment.Soal9Fragment(), "SOAL9_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal101(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Riddles.Fragment.Soal10Fragment soal10_fragment = (com.wahyu.biosisko.Riddles.Fragment.Soal10Fragment) getSupportFragmentManager().findFragmentByTag("SOAL10_FRAGMENT");
        if(soal10_fragment != null && soal10_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal9Fragment(), "SOAL9_FRAGMENT");
            fragmentTransaction.commit();
        }
    }


    public void handlehasil() {

        String editRid_1 = editRid1.getText().toString();
        String editRid_2 = editRid2.getText().toString();
        String editRid_3 = editRid3.getText().toString();
        String editRid_4 = editRid4.getText().toString();
        String editRid_5 = editRid5.getText().toString();
        String editRid_6 = editRid6.getText().toString();
        String editRid_7 = editRid7.getText().toString();
        String editRid_8 = editRid8.getText().toString();
        String editRid_9 = editRid9.getText().toString();
        String editRid_10 = editRid10.getText().toString();

        j1 = new jawabanRiddles1(editRid_1);
        j2 = new jawabanRiddles2(editRid_2);
        j3 = new jawabanRiddles3(editRid_3);
        j4 = new jawabanRiddles4(editRid_4);
        j5 = new jawabanRiddles5(editRid_5);
        j6 = new jawabanRiddles6(editRid_6);
        j7 = new jawabanRiddles7(editRid_7);
        j8 = new jawabanRiddles8(editRid_8);
        j9 = new jawabanRiddles9(editRid_9);
        j10 = new jawabanRiddles10(editRid_10);

        Intent intent = new Intent(this, HasilGameRiddles.class);
        intent.putExtra(SOAL_11, j1);
        intent.putExtra(SOAL_21, j2);
        intent.putExtra(SOAL_31, j3);
        intent.putExtra(SOAL_41, j4);
        intent.putExtra(SOAL_51, j5);
        intent.putExtra(SOAL_61, j6);
        intent.putExtra(SOAL_71, j7);
        intent.putExtra(SOAL_81, j8);
        intent.putExtra(SOAL_91, j9);
        intent.putExtra(SOAL_101, j10);
        startActivity(intent);

    }
}
