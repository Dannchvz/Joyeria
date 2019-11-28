package com.example.bellayelegantejoyeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaprincipal);
    }
    //Metodo para Categoria
    public void Categoria(View view){
        Intent Categoria = new Intent(this,Categorias.class);
        startActivity(botonCategoria);
    }

    //Metodo para Cuenta
    public void Cuenta(View view){
        Intent Cuenta = new Intent(this,cuenta.class);
        startActivity(Cuenta);
    }

    /**
     *
     * Comienzan metodos de funciones con botones de inicio
     */
}

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
