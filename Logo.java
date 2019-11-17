package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
    }
    //Metodo Para ir a Registro
    public void Foto(View view){
        Intent IrInicio = new Intent(this, MainActivity.class);
        startActivity(IrInicio);
    }
}
