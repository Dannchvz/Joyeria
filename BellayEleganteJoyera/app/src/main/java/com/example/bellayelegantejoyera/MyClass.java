package com.example.bellayelegantejoyera;


import android.os.AsyncTask;
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

public class MyClass extends AsyncTask<String, Void, String> {





    MyClass() {

    }

    @Override
    protected String doInBackground(String... params) {
        String parametro1 = params[0], parametro2 = params[1];

        String login_url = "https://tudominio o ip/archivo.php";
            try {
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                String post_data = URLEncoder.encode("nombre_que_recibe_en_el_servidor", "UTF-8") + "=" + URLEncoder.encode(parametro1, "UTF-8")+ "&" +
                        URLEncoder.encode("nombre", "UTF-8") + "=" + URLEncoder.encode(parametro2, "UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                String result = "";
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    result = line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (IOException e) {
                e.printStackTrace();
            }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        // s contiene lo que imprimes en el archivo creado en el servidor

        //La forma de ejecutar lo anterior es la siguinte:
        new MyClass().execute("parametro1","parametro2"); //esa línea va en la actividad en la que quieras interactuar con el servidor
    }

}
