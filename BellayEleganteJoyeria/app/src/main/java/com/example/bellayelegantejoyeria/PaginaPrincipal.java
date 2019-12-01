package com.example.bellayelegantejoyeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

    }
    //Metodo para Categoria
    public void Categoria(View view){
        Intent Categoria = new Intent(this,Categorias.class);
        startActivity(Categoria);
    }

    //Metodo para Cuenta
    public void Cuenta(View view){
        Intent Cuenta = new Intent(this,cuenta.class);
        startActivity(Cuenta);
    }

    //Metodo para compra
    public void Compras(View view) {
        Intent Compras = new Intent(this, Pago.class);
        startActivity(Compras);
    }

    //Metodo para Inicio
    public void Inicio(View view) {
        Intent Inicio = new Intent(this, PaginaPrincipal.class);
        startActivity(Inicio);
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
