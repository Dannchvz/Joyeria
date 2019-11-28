package com.example.bellayelegantejoyeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaprincipal);
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
}
