package com.example.bellayelegantejoyera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Entrar;
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

   public void Entrar(View view){
        Intent IrPago = new Intent(this, Pago.class);
        startActivity(IrPago);
    }
}
