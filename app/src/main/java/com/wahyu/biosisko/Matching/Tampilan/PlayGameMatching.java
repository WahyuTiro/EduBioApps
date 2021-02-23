package com.wahyu.biosisko.Matching.Tampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wahyu.biosisko.Matching.Fragment.*;
import com.wahyu.biosisko.R;
import com.wahyu.biosisko.Matching.model.jawabanMatching1;
import com.wahyu.biosisko.Matching.model.jawabanMatching2;
import com.wahyu.biosisko.Matching.model.jawabanMatching3;
import com.wahyu.biosisko.Matching.model.jawabanMatching4;
import com.wahyu.biosisko.Matching.model.jawabanMatching5;
import com.wahyu.biosisko.Matching.model.jawabanMatching6;
import com.wahyu.biosisko.Matching.model.jawabanMatching7;
import com.wahyu.biosisko.Matching.model.jawabanMatching8;
import com.wahyu.biosisko.Matching.model.jawabanMatching9;
import com.wahyu.biosisko.Matching.model.jawabanMatching10;

public class PlayGameMatching extends AppCompatActivity {

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

    jawabanMatching1 j1;
    jawabanMatching2 j2;
    jawabanMatching3 j3;
    jawabanMatching4 j4;
    jawabanMatching5 j5;
    jawabanMatching6 j6;
    jawabanMatching7 j7;
    jawabanMatching8 j8;
    jawabanMatching9 j9;
    jawabanMatching10 j10;

    EditText editMath1;
    EditText editMath2;
    EditText editMath3;
    EditText editMath4;
    EditText editMath5;
    EditText editMath6;
    EditText editMath7;
    EditText editMath8;
    EditText editMath9;
    EditText editMath10;

    Button buttonhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching_play);

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


        buttonhasil = findViewById(R.id.button_hasil);
        buttonhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editMath1.length()==0) {
                    Toast.makeText(PlayGameMatching.this, "No. 1 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath2.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 2 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath3.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 3 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath4.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 4 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath5.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 5 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath6.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 6 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath7.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 7 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath8.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 8 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath9.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 9 belum dipasangkan", Toast.LENGTH_LONG).show();
                }else if(editMath10.length()==0){
                    Toast.makeText(PlayGameMatching.this, "No. 10 belum dipasangkan", Toast.LENGTH_LONG).show();
                }
                else {
                    handlehasil();
                }
            }
        });
    }

    public void soal11(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal1Fragment soal1Fragment = (com.wahyu.biosisko.Matching.Fragment.Soal1Fragment) getSupportFragmentManager().findFragmentByTag("SOAL1_FRAGMENT");
        if(soal1Fragment != null && soal1Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal1Fragment(), "SOAL1_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal21(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal2Fragment soal2_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal2Fragment) getSupportFragmentManager().findFragmentByTag("SOAL2_FRAGMENT");
        if(soal2_fragment != null && soal2_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal2Fragment(), "SOAL2_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal31(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal3Fragment soal3_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal3Fragment) getSupportFragmentManager().findFragmentByTag("SOAL3_FRAGMENT");
        if(soal3_fragment != null && soal3_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal3Fragment(), "SOAL3_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal41(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal4Fragment soal4_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal4Fragment) getSupportFragmentManager().findFragmentByTag("SOAL4_FRAGMENT");
        if(soal4_fragment != null && soal4_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal4Fragment(), "SOAL4_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal51(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal5Fragment soal5_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal5Fragment) getSupportFragmentManager().findFragmentByTag("SOAL5_FRAGMENT");
        if(soal5_fragment != null && soal5_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal5Fragment(), "SOAL5_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal61(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal6Fragment soal6_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal6Fragment) getSupportFragmentManager().findFragmentByTag("SOAL6_FRAGMENT");
        if(soal6_fragment != null && soal6_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal6Fragment(), "SOAL6_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal71(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal7Fragment soal7_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal7Fragment) getSupportFragmentManager().findFragmentByTag("SOAL7_FRAGMENT");
        if(soal7_fragment != null && soal7_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal7Fragment(), "SOAL7_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal81(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal8Fragment soal8_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal8Fragment) getSupportFragmentManager().findFragmentByTag("SOAL8_FRAGMENT");
        if(soal8_fragment != null && soal8_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal8Fragment(), "SOAL8_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal91(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal9Fragment soal9_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal9Fragment) getSupportFragmentManager().findFragmentByTag("SOAL9_FRAGMENT");
        if(soal9_fragment != null && soal9_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new com.wahyu.biosisko.Matching.Fragment.Soal9Fragment(), "SOAL9_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void soal101(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        com.wahyu.biosisko.Matching.Fragment.Soal10Fragment soal10_fragment = (com.wahyu.biosisko.Matching.Fragment.Soal10Fragment) getSupportFragmentManager().findFragmentByTag("SOAL10_FRAGMENT");
        if(soal10_fragment != null && soal10_fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.soallayout, new Soal9Fragment(), "SOAL9_FRAGMENT");
            fragmentTransaction.commit();
        }
    }


    public void handlehasil() {

        String editMath_1 = editMath1.getText().toString();
        String editMath_2 = editMath2.getText().toString();
        String editMath_3 = editMath3.getText().toString();
        String editMath_4 = editMath4.getText().toString();
        String editMath_5 = editMath5.getText().toString();
        String editMath_6 = editMath6.getText().toString();
        String editMath_7 = editMath7.getText().toString();
        String editMath_8 = editMath8.getText().toString();
        String editMath_9 = editMath9.getText().toString();
        String editMath_10 = editMath10.getText().toString();

        j1 = new jawabanMatching1(editMath_1);
        j2 = new jawabanMatching2(editMath_2);
        j3 = new jawabanMatching3(editMath_3);
        j4 = new jawabanMatching4(editMath_4);
        j5 = new jawabanMatching5(editMath_5);
        j6 = new jawabanMatching6(editMath_6);
        j7 = new jawabanMatching7(editMath_7);
        j8 = new jawabanMatching8(editMath_8);
        j9 = new jawabanMatching9(editMath_9);
        j10 = new jawabanMatching10(editMath_10);

        Intent intent = new Intent(this, HasilGameMatching.class);
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
