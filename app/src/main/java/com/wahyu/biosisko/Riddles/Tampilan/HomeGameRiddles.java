package com.wahyu.biosisko.Riddles.Tampilan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wahyu.biosisko.R;

public class HomeGameRiddles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddles_home);
    }

    public void close(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Konfirmasi Keluar");
        alert.setIcon(R.drawable.riddles);
        alert.setMessage("Apakah ingin keluar dari Riddles?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Sampai jumpa lagi", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Batal", Toast.LENGTH_SHORT).show();
                dialogInterface.cancel();
            }
        });
        alert.create().show();
    }
    public void exit(View view) {
        close();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        close();
    }

    public void play(View view) {
        Intent intent = new Intent(this, PlayGameRiddles.class);
        startActivity(intent);

    }
}
