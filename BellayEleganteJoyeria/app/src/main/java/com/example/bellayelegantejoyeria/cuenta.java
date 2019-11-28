package com.example.bellayelegantejoyeria;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
    }

    //Metodo para Atras
    /**
    public void Atras(View view){
        Intent Atras = new Intent(this, Inicio.class);
        startActivity(Atras);
    }**/

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
