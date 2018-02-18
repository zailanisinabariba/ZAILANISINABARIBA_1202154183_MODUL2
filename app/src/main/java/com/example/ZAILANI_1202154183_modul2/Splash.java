package com.example.ZAILANI_1202154183_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends AppCompatActivity {
    //Set waktu lama splashscreen dalamam milisecond
    private static int splashInterval = 20000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this,"ZAILANI_1202154183",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent
                //jeda selesai Splashscreen
            }
        }, splashInterval);

    }

    ;
}