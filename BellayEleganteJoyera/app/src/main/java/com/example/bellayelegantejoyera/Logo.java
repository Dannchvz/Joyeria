package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

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
                Intent IrInicio = new Intent(Logo.this, MainActivity.class);
                startActivity(IrInicio);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
