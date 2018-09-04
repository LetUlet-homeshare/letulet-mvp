package com.letulet.backend.channel.airbnb.api;

import com.letulet.backend.model.airbnb.AirbnbUser;
import com.letulet.core.Config;
import com.letulet.utils.Log;
import com.letulet.utils.StringPool;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Authorization {

    // XML API
    public static final String CLIENT_ID = Config.getAsString("airbnb.client.id", "bcxy7w1sr75n4jjd93bj9efb").trim ();
    public static final String CLIENT_SECRET = Config.getAsString("airbnb.client.secret", "4mkvcvv1t1v292l7pccy1fvs6").trim ();
    public static String userpass = CLIENT_ID + StringPool.COLON + CLIENT_SECRET;
    public static String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));


    // REST API
    //public static final String REST_CLIENT_ID = Config.getAsString("airbnb.client.id_rest", "pyklarza0f08u91q50le2rhc").trim ();
    //public static final String REST_CLIENT_SECRET = Config.getAsString("airbnb.client.secret_rest", "3zgd40la51chr2jlnkaojfljy").trim ();

    public static final String REST_CLIENT_ID       = "bcxy7w1sr75n4jjd93bj9efb";
    public static final String REST_CLIENT_SECRET   = "4mkvcvv1t1v292l7pccy1fvs6";

    public static String REST_userpass = REST_CLIENT_ID + StringPool.COLON + REST_CLIENT_SECRET;
    public static String REST_basicAuth = "Basic " + new String(new Base64().encode(REST_userpass.getBytes()));

    // AUTHORIZATION END-POINT
    public static String OAUTH_ENDPOINT = "https://api.airbnb.com/v2/oauth2/authorizations?_unwrapped=true";

    public static JSONObject getTokens(String code) {

        JSONObject data = new JSONObject();
        data.put("code",  code);

        HttpURLConnection myURLConnection = null;

        try {
            URL myURL = new URL(OAUTH_ENDPOINT);
            myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Authorization", basicAuth);
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
            Log.info(Authorization.class, "AirBnB Oauth2 API Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (myURLConnection != null) {
                myURLConnection.disconnect();
            }
        }
        return null;
    }

    public static boolean isValidToken(String token) {

        return isValidToken(token, null);
    }


    public static boolean isValidToken(String token, String basicAuthString) {

        if(basicAuthString == null){
            basicAuthString = basicAuth;
        }

        HttpURLConnection myURLConnection = null;

        try {
            URL myURL = new URL("https://api.airbnb.com/v2/oauth2/authorizations/" + token + "?_unwrapped=true");
            myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Authorization", basicAuthString);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("GET");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);

            int responseCode = myURLConnection.getResponseCode();
            Log.info(Authorization.class, "AirBnB isValidToken API Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                BufferedReader in = new BufferedReader(new InputStreamReader( myURLConnection.getInputStream() ));
                String inputLine;
                StringBuffer response2 = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response2.append(inputLine);
                }

                in.close();

                JSONObject resp = new JSONObject(response2.toString());
                Log.info(Authorization.class, "isValidToken?: " + resp);
                return resp.getBoolean("valid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (myURLConnection != null) {
                myURLConnection.disconnect();
            }
        }
        return false;
    }

    public static String refreshAccessToken(AirbnbUser airbnbUser) {

        return refreshAccessToken(airbnbUser, null);

    }

    //https://www.airbnb.com/developer/docs/oauth/
    public static String refreshAccessToken(AirbnbUser airbnbUser, String basicAuthString) {

        if(basicAuthString == null){
            basicAuthString = basicAuth;
        }

        Log.info(Authorization.class, "AirBnB refreshAccessToken with  refreshToken = " + airbnbUser.getRefreshToken());

        JSONObject data = new JSONObject();
        data.put("refresh_token",  airbnbUser.getRefreshToken());

        HttpURLConnection myURLConnection = null;

        try {
            URL myURL = new URL("https://api.airbnb.com/v2/oauth2/authorizations?_unwrapped=true");
            myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Authorization", basicAuthString);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);

            OutputStream os = myURLConnection.getOutputStream();
            os.write(data.toString().getBytes());
            os.flush();
            os.close();

            int responseCode = myURLConnection.getResponseCode();
            Log.info(Authorization.class, "AirBnB refreshAccessToken API Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                BufferedReader in = new BufferedReader(new InputStreamReader( myURLConnection.getInputStream() ));
                String inputLine;
                StringBuffer response2 = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response2.append(inputLine);
                }

                in.close();

                JSONObject resp = new JSONObject(response2.toString());
                Log.info(Authorization.class, "AirBnB New Codes: " + resp);

                String access_token = resp.getString("access_token");
                airbnbUser.setAccessToken(access_token);
                airbnbUser.save();

                return access_token;

            }

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