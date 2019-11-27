package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Direccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);
    }

    //Metodo Para ir a Inicio de Sesion
    public void Sesion(View view){
        Intent IrSesion = new Intent(this, IniciodeSesion.class);
        startActivity(IrSesion);
    }
}
