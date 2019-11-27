package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Aretes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aretes);
    }

    //Metodo para ir hacia atras

    public void Atras(View view){
        Intent Atras = new Intent(this, Categorias.class);
        startActivity(Atras);
    }
}
