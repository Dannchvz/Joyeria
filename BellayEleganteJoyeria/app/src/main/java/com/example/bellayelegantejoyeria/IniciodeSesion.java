package com.example.bellayelegantejoyeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IniciodeSesion extends AppCompatActivity {

    Button Entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_de_sesion);

    }

          //Metodo Para ir a Registro
    public void Registro(View view){
        Intent IrRegistro = new Intent(this, Registro.class);
        startActivity(IrRegistro);
    }

   public void Entrar(View view){
        Intent IrCategorias = new Intent(this, Categorias.class);
        startActivity(IrCategorias);
    }

    /**
     *
     * Comienzan metodos de funciones con botones de inicio
     */
<<<<<<< HEAD
=======
    }
>>>>>>> 4e27900a76948948fbff42244b63809e911ccf15

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
