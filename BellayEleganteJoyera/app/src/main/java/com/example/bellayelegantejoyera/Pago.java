package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
    }

    public void TCD (View view){
        Intent IrPagoTarjeta = new Intent(this, TarjetaDebito.class);
        startActivity(IrPagoTarjeta);
    }
}
