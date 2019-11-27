package com.example.bellayelegantejoyeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Logo extends AppCompatActivity {

   private final int DURACION_SPLASH = 2000; // 3 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        final Handler Handler = new Handler();

        Handler.postDelayed(new Runnable() {
            public void run() {
                //Metodo Para ir a Registro
                Intent IrInicio = new Intent(Logo.this, IniciodeSesion.class);
                startActivity(IrInicio);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
