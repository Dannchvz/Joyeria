package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prinicpal);
    }

    //Metodo para aretes
    public void Aretes(View view){
        Intent Aretes = new Intent(this,Aretes.class);
        startActivity(Aretes);
    }
    //Metodo para Collares
    public void Collares(View view){
        Intent Collares = new Intent(this,Collares.class);
        startActivity(Collares);
    }

    //Metodo para Anillos
    public void Anillos(View view){
        Intent Anillos = new Intent(this,Anillos.class);
        startActivity(Anillos);
    }
    //Metodo para Pulseras
    public void Pulseras(View view){
        Intent Pulseras = new Intent(this,Pulseras.class);
        startActivity(Pulseras);
    }
}
