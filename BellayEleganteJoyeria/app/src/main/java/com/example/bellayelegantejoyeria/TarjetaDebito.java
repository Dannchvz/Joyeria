package com.example.bellayelegantejoyeria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class TarjetaDebito extends AppCompatActivity {
    EditText NumTarjeta, Nombre, Anio, Mes, CVV;
    List<EditText> campos;
    Button Guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta_debito);
        NumTarjeta = findViewById(R.id.NumTarjeta);
        Nombre = findViewById(R.id.Nombre);
        Anio = findViewById(R.id.Anio);
        Mes = findViewById(R.id.Mes);
        CVV = findViewById(R.id.CVV);
        campos = Arrays.asList(Nombre, NumTarjeta, Mes, Anio, CVV);

        Guardar = findViewById(R.id.button5);
        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Verificacion();

                if (Verificacion()) {
                    Toast.makeText(TarjetaDebito.this, getString(R.string.GuardadoExitoso), Toast.LENGTH_SHORT).show();
                    Regreso();
                }else{
                    Toast.makeText(TarjetaDebito.this, getString(R.string.FaltanCampos), Toast.LENGTH_SHORT).show();
                }

            }

        });

    }



    private boolean Verificacion() {
        boolean falta = false;
        for (EditText text : campos) {
            text.setHintTextColor(ContextCompat.getColor(this, R.color.colorR));
        }
        for (EditText text : campos) {
            if (text.getText().toString().trim().isEmpty()) {
                text.setHintTextColor(ContextCompat.getColor(this, R.color.error));
                falta = true;
            }
        }
        return !falta;
    }

    public void Regreso (){
        Intent IrConF = new Intent(this, Pago.class);
        startActivity(IrConF);
    }
}

