package com.example.bellayelegantejoyeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Compras extends AppCompatActivity {

    //DECLARACIÓN DE VARIABLES
    private TextView nombre, detalle, precio, cant;
    private ImageView imagen1;
    private String valor;

    /**
     * Métedo onCreate por defecto
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //Instanciacion de XML a JAVA
        nombre = findViewById(R.id.textNombre);
        detalle = findViewById(R.id.textDescripcion);
        imagen1 = findViewById(R.id.imagenUno);
        precio = findViewById(R.id.textprecio);
        cant = findViewById(R.id.txt_cantidad);
    }//Fin onCreate()

    public void ConfPedido(View view) {
        Intent Pedido = new Intent(this, Pago.class);
        startActivity(Pedido);
    }

}//Fin Class

