package com.letulet.external.partners;

import com.letulet.backend.model.*;
import com.letulet.utils.Log;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NC2Helper {

    final static  String USERNAME = "letulet"; //Development
    final static  String PASSWORD = "test"; //Development
    final static  String PARTNER_ID = "b423f608-806e-11e8-adc0-fa7ae01bbebc"; //Development
    final static  String NC2_ENDPOINT = "https://mpapitest.netchainsquared.com/"; //Development
    //final String NC2_ENDPOINT = "https://netchainsquared.com/"; //Production

    public static String getAuth() {

        JSONObject data = new JSONObject();
        data.put("username", USERNAME);
        data.put("password", PASSWORD);

        try {

            URL myURL = new URL(NC2_ENDPOINT + "getAuth");
            HttpURLConnection myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);

            OutputStream os = myURLConnection.getOutputStream();
            os.write(data.toString().getBytes());
            os.flush();
            os.close();

            InputStream _is;

            if (myURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                _is = myURLConnection.getInputStream();
            } else {

                _is = myURLConnection.getErrorStream();

                if (_is == null) {
                    _is = myURLConnection.getInputStream();
                }
            }


            BufferedReader in = new BufferedReader(new InputStreamReader(_is));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            Log.info(NC2Helper.class, "getAuth :" + response.toString());

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static BankAccount createUpdateClient(BankAccount bankAccount, User user, boolean isNew) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");

        String auth = getAuth();

        JSONObject data = new JSONObject();
        JSONArray clients = new JSONArray();
        JSONObject client = new JSONObject();

        client.put("clientId", bankAccount.getID() + "");
        client.put("status", (isNew) ? "new" : "update");

        if (user != null) {

            client.put("firstName", user.getFirstName());
            client.put("lastName", user.getLastName());
            client.put("phone", user.getPhoneNumber());
        }

        if (user instanceof Tenant) {

            Tenant tenant = (Tenant) user;
            client.put("email", tenant.getEmail());
        }

        if (user instanceof Landlord) {

            Landlord landlord = (Landlord) user;
            client.put("email", landlord.getEmail());
        }

        if (bankAccount.getDateOfBirth() != null) {

            client.put("dateOfBirth", formatter2.format(bankAccount.getDateOfBirth()));
        }

        client.put("companyName", bankAccount.getCompanyName());
        client.put("taxId", bankAccount.getTaxID());
        client.put("streetAddress", bankAccount.getStreetAddress());
        client.put("city", bankAccount.getCity());
        client.put("state", bankAccount.getState());
        client.put("zip", bankAccount.getZipCode());
        client.put("bankName", bankAccount.getName());
        client.put("bankAccountHolderName", bankAccount.getAccountHolderName());
        client.put("bankRoutingNumber", bankAccount.getRoutingNumber());
        client.put("bankAccountNumber", bankAccount.getAccountNumber());
        client.put("ar_ap_flag", true); //True when that client should be able to receive payments
        if (bankAccount.getCreditCardType() != null) {
            client.put("creditCardType", bankAccount.getCreditCardType().toString()); //"'Visa', 'MasterCard', 'Amex', 'Discover'"
        }
        client.put("creditCardFirstName", bankAccount.getCreditCardFirstName());
        client.put("creditCardLastName", bankAccount.getCreditCardLastName());
        client.put("creditCardNumber", bankAccount.getCreditCardNumber());
        client.put("creditCardExpiration", bankAccount.getCreditCardFirstName());
        client.put("creditCardBillingZipCode", bankAccount.getCreditCardExpiration());
        client.put("creditCardCvv", bankAccount.getCreditCardCvv());
        client.put("createTimeStamp", formatter.format(bankAccount.getCreated()));
        client.put("updateTimeStamp", formatter.format(bankAccount.getModified()));

        clients.put(client);

        data.put("clients", clients);
        data.put("partnerId", PARTNER_ID);

        try {

            URL myURL = new URL(NC2_ENDPOINT + "createUpdateClient");
            HttpURLConnection myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("Authorization", auth);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);

            OutputStream os = myURLConnection.getOutputStream();
            os.write(data.toString().getBytes());
            os.flush();
            os.close();

            InputStream _is;

            Log.info(NC2Helper.class, myURLConnection.getResponseCode() + " " + myURLConnection.getResponseMessage());

            if (myURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                _is = myURLConnection.getInputStream();
            } else {

                _is = myURLConnection.getErrorStream();

                if (_is == null) {
                    _is = myURLConnection.getInputStream();
                }
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(_is));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            Log.info(NC2Helper.class, response.toString());

            if (myURLConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {

                bankAccount.setIsActive(false);
                bankAccount.save();

                return null;
            }

            in.close();

            JSONObject responseJSON = new JSONObject(response.toString());

            if (responseJSON.has("result")) {

                JSONArray clientsJSON = responseJSON.getJSONArray("result");

                for (int i =0; i < clientsJSON.length(); i++) {

                    JSONObject clientJSON = clientsJSON.getJSONObject(i);

                    String id = clientJSON.getString("clientId");
                    String status = clientJSON.getString("status");

                    if (status.equals("success")) {

                        bankAccount.setIsActive(true);
                    } else {

                        bankAccount.setIsActive(false);
                    }
                }

                bankAccount.save();

                return bankAccount;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getClients(BankAccount bankAccount) {

        String auth = getAuth();

        try {

            URL myURL = new URL(NC2_ENDPOINT + "getClients/" + bankAccount.getID());
            HttpURLConnection myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("GET");
            myURLConnection.setRequestProperty("Authorization", auth);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);
            myURLConnection.setUseCaches(false);

            InputStream _is = myURLConnection.getInputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(_is));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            Log.info(NC2Helper.class, "getClients :" + response.toString());

            in.close();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String liabilityNotification(Transaction transaction) {

        if (transaction.getStatus() == Transaction.Status.PROCESSED) return null;

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");

        String auth = NC2Helper.getAuth();

        JSONObject data = new JSONObject();
        data.put("partnerId", PARTNER_ID); //Required

        JSONArray _liability = new JSONArray();
        JSONObject liability = new JSONObject();
        liability.put("liabilityId", transaction.getID() + ""); //Required
        liability.put("totalAmount", transaction.getAmount() + ""); //Required
        liability.put("status", (transaction.getStatus() == Transaction.Status.NEW) ? "new" : "retry");
        liability.put("notificationTimeStamp", formatter.format(new Date())); //Required


        JSONArray invoices = new JSONArray();
        JSONObject invoice = new JSONObject();
        invoice.put("apId", transaction.getBankAccountSource().getID() + ""); //Required The apId is the client that is making payment
        invoice.put("arId", transaction.getBankAccountDestination().getID() + ""); //Required The arId is the clientId that is receiving payment
        invoice.put("paymentMethod", "ACH"); //Required
        invoice.put("amount", transaction.getAmount() + ""); //Required

        JSONArray itemList = new JSONArray(); //Not required
        JSONObject item = new JSONObject();
        item.put("item", "transaction");
        item.put("quantity", 1);
        item.put("rate", transaction.getAmount());
        item.put("cost", transaction.getAmount());
        itemList.put(item);
        invoice.put("itemList", itemList);

        invoices.put(invoice);


        liability.put("Invoice", invoices);

        _liability.put(liability);
        data.put("liability", _liability);

        try {

            URL myURL = new URL(NC2_ENDPOINT + "liabilityNotification");
            HttpURLConnection myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("Authorization", auth);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);

            OutputStream os = myURLConnection.getOutputStream();
            os.write(data.toString().getBytes());
            os.flush();
            os.close();

            InputStream _is = myURLConnection.getInputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(_is));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            if (myURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                transaction.setStatus(Transaction.Status.PROCESSED);
            } else {

                transaction.setStatus(Transaction.Status.FAILED);
            }

            transaction.save();

            JSONObject resp = new JSONObject(response.toString());

            Log.error(NC2Helper.class, resp);

            in.close();

            return resp.toString();

        } catch (Exception e) {

            transaction.setStatus(Transaction.Status.FAILED);
            transaction.save();

            e.printStackTrace();
        }

        return null;
    }

    public static JSONObject clientDetailsNotification(BankAccount bankAccount) {

        String auth = getAuth();

        JSONObject data = new JSONObject();

        JSONArray _clientDetails = new JSONArray();
        JSONObject clientDetails = new JSONObject();
        clientDetails.put("clientId" , bankAccount.getID());
        clientDetails.put("accountDetailsRequired" ,false);
        clientDetails.put("accountDetailsStatus" ,false);
        clientDetails.put("dateOfBirthRequired" ,false);
        clientDetails.put("dateOfBirthStatus" ,false);
        clientDetails.put("taxIdRequired" ,false);
        clientDetails.put("taxIdStatus" ,false);
        clientDetails.put("kycFlag" ,"Green"); //"'Green', 'Red', 'Orange'",
        clientDetails.put("status" ,"open"); //"open, closed"
        clientDetails.put("notificationTimeStamp" ,"");
        _clientDetails.put(clientDetails);

        data.put("clientDetails", _clientDetails);

        try {

            URL myURL = new URL(NC2_ENDPOINT + "liabilityNotification");
            HttpURLConnection myURLConnection = (HttpURLConnection)myURL.openConnection();
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("Authorization", auth);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);

            OutputStream os = myURLConnection.getOutputStream();
            os.write(data.toString().getBytes());
            os.flush();
            os.close();

            InputStream _is = myURLConnection.getInputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(_is));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            JSONObject resp = new JSONObject(response.toString());

            in.close();

            return resp;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
