package com.example.bellayelegantejoyeria;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class PaginaPrincipal extends AppCompatActivity {

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        preferences = getSharedPreferences("PreferencesLOGIN", Context.MODE_PRIVATE);

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
        Intent Compras = new Intent(this, Compras.class);
        startActivity(Compras);
    }

    //Metodo para Inicio
    public void Inicio(View view) {
        Intent Inicio = new Intent(this, PaginaPrincipal.class);
        startActivity(Inicio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.cerrar_sesion:
                removeShared();
                Intent intent = new Intent(this, IniciodeSesion.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void removeShared(){
        preferences.edit().clear().apply();
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
