package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Anillos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anillos);
    }

    //Metodo para Atras
    public void Atras(View view){
        Intent Atras = new Intent(this, Categorias.class);
        startActivity(Atras);
    }
}
