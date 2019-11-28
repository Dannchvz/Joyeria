package com.example.bellayelegantejoyeria;

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

    /**
     *
     * Comienzan metodos de funciones con botones de inicio
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
