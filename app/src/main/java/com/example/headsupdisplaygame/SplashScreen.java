package com.example.headsupdisplaygame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    //tiempo dce duracion del splash
    private final int DURACION_SPLASH = 2000; // 2 segundos
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable(){
            public void run(){

                startActivity(new Intent(SplashScreen.this,MainActivity.class ));
                finish();

            };
        }, DURACION_SPLASH);



    }
}
