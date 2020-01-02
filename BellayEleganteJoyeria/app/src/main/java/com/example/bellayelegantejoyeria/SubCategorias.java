package com.example.bellayelegantejoyeria;


import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.bellayelegantejoyeria.utils.MyURL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SubCategorias extends AppCompatActivity {

    private static final String URL_Productos= MyURL.url+"Buscar(Producto).php";

    List<Productos> productosList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_categorias);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ));

        productosList= new ArrayList<>();
        loadprodcutos();
    }

    private void loadprodcutos(){
        StringRequest stringRequest= new StringRequest( Request.Method.GET, URL_Productos, new Response.Listener<String>(){
            @Override
            public void onResponse(String response){
                try{
                    JSONArray array = new JSONArray( response );
                    for (int i=0;i<array.length();i++){
                        JSONObject producto = array.getJSONObject(i);

                        productosList.add(new Productos(
                                producto.getString("nombre"),
                                producto.getString("descripcion"),
                                producto.getString("imagen"),
                                producto.getInt("precio")
                        ));
                    }

                    Adaptador adapter = new Adaptador( SubCategorias.this ,productosList);
                    recyclerView.setAdapter( adapter );
                }catch(JSONException e){
                    e.printStackTrace();
                }
            }
        },
                new Response.ErrorListener(){
            @Override
                    public void onErrorResponse(VolleyError error){
                    //Toast.makeText(getAplication(),error.toString(),Toast.LENGTH_SHORT).show();
                    }
                });

        Volley.newRequestQueue(this).add(stringRequest);
    }

    /**
     *
     * Comienzan metodos de funciones con botones de inicio
     */

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
