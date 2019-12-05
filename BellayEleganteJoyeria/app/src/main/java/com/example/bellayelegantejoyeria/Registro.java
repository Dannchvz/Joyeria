package com.example.bellayelegantejoyeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Registro extends AppCompatActivity {

    @BindView(R.id.etNombre)
    EditText etNombre;
    @BindView(R.id.etApP)
    EditText etApP;
    @BindView(R.id.etApM)
    EditText etApM;
    @BindView(R.id.etCURP)
    EditText etCURP;
    @BindView(R.id.etCorreo)
    EditText etCorreo;
    @BindView(R.id.etTelefono)
    EditText etTelefono;
    String nombre, apP, apM, curp, correo, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ButterKnife.bind(this);

    }

    //Metodo Para ir a Direccion
    public void Direccion(View view) {
        obtener();
        Intent IrDireccion = new Intent(this, Direccion.class);
        IrDireccion.putExtra("nom", nombre);
        IrDireccion.putExtra("app", apP);
        IrDireccion.putExtra("apm", apM);
        IrDireccion.putExtra("cur", curp);
        IrDireccion.putExtra("cor", correo);
        IrDireccion.putExtra("tel", telefono);
        startActivity(IrDireccion);
    }


    private void obtener() {
        nombre = etNombre.getText().toString();
        apP = etApP.getText().toString();
        apM = etApM.getText().toString();
        curp = etCURP.getText().toString();
        correo = etCorreo.getText().toString();
        telefono = etTelefono.getText().toString();
    }


    /**
     * Comienzan metodos de funciones con botones de inicio
     */

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    /**
     *
     * Finalizan metodos de funciones con botones de inicio
     */
}
