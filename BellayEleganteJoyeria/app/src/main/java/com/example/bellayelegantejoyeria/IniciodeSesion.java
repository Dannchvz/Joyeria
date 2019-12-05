package com.example.bellayelegantejoyeria;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bellayelegantejoyeria.utils.MyURL;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IniciodeSesion extends AppCompatActivity {

    Button Entrar;
    @BindView(R.id.etUser)
    EditText etUser;
    @BindView(R.id.etPass)
    EditText etPass;

    private String email = null , pass = null;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_de_sesion);
        ButterKnife.bind(this);
        preferences = getSharedPreferences("PreferencesLOGIN",Context.MODE_PRIVATE);

        existeUsuario();

    }

    //Metodo Para ir a Registro
    public void Registro(View view) {
        Intent IrRegistro = new Intent(this, Registro.class);
        startActivity(IrRegistro);
    }

    public void Entrar(View view) {
        obtener();
        new ComprobasUsuario(this).execute("INICIO DE SESION",MyURL.url+"Buscar_inicio_sesion.php","user",email,"pass",pass);
    }

    private void obtener(){
        email = etUser.getText().toString();
        pass = etPass.getText().toString();
    }

    private void saveOnPreferences(String email, String pass){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("email",email);
        editor.putString("pass",pass);
        editor.commit();
        editor.apply();
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

    private void existeUsuario(){
        email = preferences.getString("email",null);
        pass = preferences.getString("pass",null);

        if(email != null && pass != null){
            Intent IrCategorias = new Intent(this, PaginaPrincipal.class);
            IrCategorias.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(IrCategorias);
        }
    }

    @SuppressLint("StaticFieldLeak")
    private class ComprobasUsuario extends MyAsyncTask{

        ComprobasUsuario(Context context) {
            super(context);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if(s.equals("Usuario encontrado")){
                saveOnPreferences(email,pass);
                Intent IrCategorias = new Intent(context, PaginaPrincipal.class);
                IrCategorias.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(IrCategorias);

            }else{
                Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
