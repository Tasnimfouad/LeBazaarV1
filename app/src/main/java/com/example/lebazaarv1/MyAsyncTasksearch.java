package com.example.lebazaarv1;


import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.SearchView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class MyAsyncTasksearch extends AsyncTask<Void,Void,Void> {

    String data = "";
    String dataParsed = "";
    String singleParsed = "";
    String str = "";
    static String s2;
    ProgressDialog pd;

    TextView text1;
    //sharedclass searchurl= new sharedclass();
    // MainActivity main=new MainActivity();


    public MyAsyncTasksearch(String str) {
        this.str = str;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {

            URL url = new URL( str );

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( inputStream ) );
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONArray JA = new JSONArray( data );
            for (int i = 0; i < JA.length(); i++) {

                JSONObject JO = (JSONObject) JA.get( i );
                singleParsed = JO.get( "Category" ) + "\n" +
                        //put it in a name array
                        JO.get( "ShopID" ) + "\n" +
                        //put in image array
                        JO.get( "Description" ) + "\n";
                //3 different arrays
                dataParsed = singleParsed + dataParsed;
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }


    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute( aVoid );
        MainActivity.txtJson.setText(dataParsed);
    }


}