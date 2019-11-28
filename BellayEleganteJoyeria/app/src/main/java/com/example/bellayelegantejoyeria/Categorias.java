package com.example.bellayelegantejoyeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    //Metodo para aretes
    public void Aretes(View view){
        Intent Aretes = new Intent(this,SubCategorias.class);
        startActivity(Aretes);
    }
    //Metodo para Collares
    public void Collares(View view){
        Intent Collares = new Intent(this,SubCategorias.class);
        startActivity(Collares);
    }

    //Metodo para Cadenas
    public void Cadenas(View view){
        Intent cadenas = new Intent(this,SubCategorias.class);
        startActivity(cadenas);
    }

    //Metodo para Anillos
    public void Anillos(View view){
        Intent Anillos = new Intent(this,SubCategorias.class);
        startActivity(Anillos);
    }
    //Metodo para Pulseras
    public void Pulseras(View view){
        Intent Pulseras = new Intent(this,SubCategorias.class);
        startActivity(Pulseras);
    }
    //Metodo para Atras
    public void Atras(View view){
        Intent Atras = new Intent(this, PaginaPrincipal.class);
        startActivity(Atras);
    }

    /**
     *
     * Comienzan metodos de funciones con botones de inicio
     */

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
    /**
     *
     * Finalizan metodos de funciones con botones de inicio
     */
}
