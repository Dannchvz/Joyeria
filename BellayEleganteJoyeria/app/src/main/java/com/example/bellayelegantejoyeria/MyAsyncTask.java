package com.example.bellayelegantejoyeria;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.fabricimages.projectmanager.R;
import com.fabricimages.projectmanager.short_methods.alert.SimpleAlert;
import com.fabricimages.projectmanager.short_methods.alert.SimpleAlertSinConexion;
import com.fabricimages.projectmanager.short_methods.otros.Progress_Dialog;
import com.fabricimages.projectmanager.short_methods.otros.ReturnString;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class MyAsyncTask extends AsyncTask<String,Void,String> {


    public MyAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {
        int paramslenght = params.length;
        String type = params[0];
        String TAG = "BCKG_WORKR";
        Log.d(TAG, "El tipo de comunciacion que intenta hacer es de tipo: " + type);
        String newurl = params[1];

        try {

            StringBuilder post_data = null;


        }
        Log.d(TAG +" "+ type, "Post Final que se enviara al servidor:" + post_data);
        return null;
    }
}
