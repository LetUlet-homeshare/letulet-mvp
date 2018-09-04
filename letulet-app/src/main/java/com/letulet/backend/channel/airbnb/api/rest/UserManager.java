package com.letulet.backend.channel.airbnb.api.rest;

import com.letulet.backend.channel.airbnb.api.Authorization;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by cedric on 2017-12-12.
 */
public class UserManager {

    public static String AIRBNB_REVOKE_TOKEN_ENDPOINT = "https://api.airbnb.com/v2/oauth2/authorizations/";
    public static String AIRBNB_USER_ENDPOINT = "https://api.airbnb.com/v2/users/";

    public static JSONObject getTokens(String code) {

        JSONObject data = null;

        HttpURLConnection myURLConnection = null;

        try {

            data = new JSONObject();
            data.put("code",  code);

            URL myURL = new URL("https://api.airbnb.com/v2/oauth2/authorizations?_unwrapped=true");
            myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Authorization", Authorization.REST_basicAuth);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);


            if(data != null) {
                OutputStream os = myURLConnection.getOutputStream();
                os.write(data.toString().getBytes());
                os.flush();
                os.close();
            }

            int responseCode = myURLConnection.getResponseCode();
            System.out.println("AirBnB Oauth2 API Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                BufferedReader in = new BufferedReader(new InputStreamReader( myURLConnection.getInputStream() ));
                String inputLine;
                StringBuffer response2 = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response2.append(inputLine);
                }

                in.close();

                return new JSONObject(response2.toString());

            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (myURLConnection != null) {
                myURLConnection.disconnect();
            }
        }
        return null;
    }
}