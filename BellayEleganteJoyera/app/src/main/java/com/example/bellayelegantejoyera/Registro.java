package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    //Metodo Para ir a Direccion
    public void Direccion(View view){
        Intent IrDireccion = new Intent(this,Direccion.class);
        startActivity(IrDireccion);
    }
}
