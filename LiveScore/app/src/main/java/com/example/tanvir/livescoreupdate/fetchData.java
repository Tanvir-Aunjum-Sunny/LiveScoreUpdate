package com.example.tanvir.livescoreupdate;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void> {
    String data = "";
    String dataParsed="";
    String singleParsed="";


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://api.myjson.com/bins/77se6");

            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line = "";
                while (line!=null){
                    line = bufferedReader.readLine();
                    data = data+line;
                }
                JSONArray JA = new JSONArray(data);
                for (int i=0 ; i<10 ;i++){
                    JSONObject JO = (JSONObject) JA.get(i);
                    singleParsed ="Team 1: "+ JO.get("team-1")+ "\n"+
                    "Team 2: "+ JO.get("team-2")+ "\n"+
                            "Toss Winner: "+ JO.get("toss_winner_team")+ "\n"+
                    "Winner Winner: "+ JO.get("winner_team")+ "\n\n";

                    dataParsed = dataParsed + singleParsed;
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        NewMatch.data.setText(this.dataParsed);
    }
}
