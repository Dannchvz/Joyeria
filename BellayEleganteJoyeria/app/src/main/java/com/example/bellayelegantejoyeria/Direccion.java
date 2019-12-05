package com.example.bellayelegantejoyeria;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bellayelegantejoyeria.utils.MyURL;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Direccion extends AppCompatActivity {

    @BindView(R.id.etCalle)
    EditText etCalle;
    @BindView(R.id.etNI)
    EditText etNI;
    @BindView(R.id.etNE)
    EditText etNE;
    @BindView(R.id.etCP)
    EditText etCP;
    @BindView(R.id.etMun)
    EditText etMun;
    @BindView(R.id.etEstado)
    EditText etEstado;
    @BindView(R.id.etPais)
    EditText etPais;

    private String nombre, apP, apM, curp, correo, telefono;
    private String calle, ni, ne, cp, mun, estado, pais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);
        ButterKnife.bind(this);
        onNewIntent(getIntent());
    }

    private void obtener(){
        calle = etCalle.getText().toString();
        ni = etNI.getText().toString();
        ne = etNE.getText().toString();
        cp = etCP.getText().toString();
        mun = etMun.getText().toString();
        estado = etEstado.getText().toString();
        pais = etPais.getText().toString();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("nom")) {
                nombre = extras.getString("nom");
                apP = extras.getString("app");
                apM = extras.getString("apm");
                curp = extras.getString("cur");
                correo = extras.getString("cor");
                telefono = extras.getString("tel");
            }
        }
    }

    //Metodo Para ir a Inicio de Sesion
    public void Sesion(View view) {
        /*Intent IrSesion = new Intent(this, IniciodeSesion.class);
        startActivity(IrSesion);*/
        obtener();
        new CrearUsiario(this).execute("CREAR USUARIO", MyURL.url+"InsertarUsuario.php",
                "nom",nombre,"app",apP,"apm",apM,"cur",curp,"cor",correo,"tel",telefono,
                "cal",calle,"ni",ni,"ne",ne,"cp",cp,"mun",mun,"est",estado,"pais",pais);
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


    private class CrearUsiario extends MyAsyncTask{

        public CrearUsiario(Context context) {
            super(context);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
            /*Intent IrSesion = new Intent(context, IniciodeSesion.class);
            startActivity(IrSesion);*/
        }
    }

}
