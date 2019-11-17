package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo Para ir a Registro
    public void Registro(View view){
        Intent IrRegistro = new Intent(this, Registro.class);
        startActivity(IrRegistro);
    }
}
