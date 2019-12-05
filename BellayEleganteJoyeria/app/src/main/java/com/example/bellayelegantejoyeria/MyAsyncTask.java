package com.example.bellayelegantejoyeria;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;



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

public class MyAsyncTask extends AsyncTask<String, Void, String> {

    @SuppressLint("StaticFieldLeak")
    public Context context;

    public MyAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {
        int paramslenght = params.length;
        String type = params[0];
        String TAG = "BCKG_WORKR";
        Log.d(TAG,"El tipo de comunciacion que intenta hacer es de tipo: " + type);
        String newurl = params[1];

        try {

            URL url = new URL(newurl);
            Log.d(TAG +" "+ type,"URL a la que se le hara la solicitud:. " + url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            }
            StringBuilder post_data = null;
            //Custom code for this case
            for (int i = 2; i<paramslenght; i = i + 2) {
                String nomVar = params[i];
                Log.d(TAG +" "+ type, "Nombre de la variable: " + nomVar);
                String valVar = params[i+1];
                Log.d(TAG +" "+ type, "Valor de la variable: " + valVar);

                if(i==2) {
                    post_data = new StringBuilder(URLEncoder.encode(nomVar, "UTF-8") + "=" + URLEncoder.encode(valVar, "UTF-8"));
                }else {
                    post_data.append("&").append(URLEncoder.encode(nomVar, "UTF-8")).append("=").append(URLEncoder.encode(valVar, "UTF-8"));
                }
            }
            Log.d(TAG +" "+ type, "Post Final que se enviara al servidor:" + post_data);

            //More default code
            assert post_data != null;
            bufferedWriter.write(post_data.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            }
            StringBuilder result = new StringBuilder();
            String line;
            //This lines read the response from the server
            while ((line = bufferedReader.readLine())!= null){
                result.append(line);
            }
            Log.d(TAG +" "+ type, "El servidor repondio lo siguiente:-" + result);
            //Even more default code
            bufferedReader.close();
            inputStream.close();
            httpURLConnection.disconnect();
            String content = result.toString();
            //Progress_Dialog.dismiss();

                return result.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
