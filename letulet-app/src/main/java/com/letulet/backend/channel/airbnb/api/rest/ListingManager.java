package com.letulet.backend.channel.airbnb.api.rest;

import com.letulet.backend.channel.airbnb.api.Authorization;
import com.letulet.backend.model.*;
import com.letulet.backend.model.airbnb.AirbnbUser;
import com.letulet.utils.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;

public class ListingManager {

    public static final String AIRBNB_API_KEY_PARAM = "X-Airbnb-API-Key";
    public static final String AIRBNB_OAUTH_TOKEN_PARAM = "X-Airbnb-OAuth-Token";
    public static final String AIRBNB_GET_LISTING_API_REST_ENDPOINT = "https://api.airbnb.com/v2/listings/?user_id=";

    public static JSONObject getAllListings(AirbnbUser airbnbUser, int offset, boolean hasAvailability) {

        System.out.println(">>>... AIrBnB REST API : get listing...");

        JSONObject jsn = new JSONObject();

        HttpURLConnection myURLConnection = null;

        String authToken = airbnbUser.getAccessToken();

        StringBuffer response = new StringBuffer();

        try {
            if (!Authorization.isValidToken(authToken, Authorization.REST_basicAuth)) {
                authToken = Authorization.refreshAccessToken(airbnbUser, Authorization.REST_basicAuth);
                System.out.println(">>>... new AIrBnB token " + authToken);
            }

            String _url = AIRBNB_GET_LISTING_API_REST_ENDPOINT + airbnbUser.getAirbnbUserID();

            _url += "&_offset=" + offset;

            if (!hasAvailability) {
                _url += "&has_availability=false";
            } else {
                _url += "&has_availability=true";
            }

            Log.info(PropertyManager.class, _url);

            URL myURL = new URL(_url);
            myURLConnection = (HttpURLConnection) myURL.openConnection();
            myURLConnection.setRequestProperty(ListingManager.AIRBNB_API_KEY_PARAM, Authorization.REST_CLIENT_ID);
            myURLConnection.setRequestProperty(ListingManager.AIRBNB_OAUTH_TOKEN_PARAM, authToken);
            myURLConnection.setRequestProperty("Accept", "application/json");
            myURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
            myURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            myURLConnection.setRequestMethod("GET");
            myURLConnection.setDoOutput(true);
            myURLConnection.setUseCaches(false);

            InputStream _is;

            if (myURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                _is = myURLConnection.getInputStream();
            } else {

                _is = myURLConnection.getErrorStream();

                if (_is == null) {
                    _is = myURLConnection.getInputStream();
                }
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(_is, "UTF-8"));
            String inputLine;
            StringBuffer response2 = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response2.append(inputLine);
            }

            JSONObject obj = null;

            try {
                obj = new JSONObject(response2.toString());
            } catch (JSONException e) {

            }

            Log.info(ListingManager.class, ">>>... Airbnb REST API : get listing..." + obj);

            _is.close();

            return obj;

        } catch (ProtocolException e) {
            e.printStackTrace();

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (myURLConnection != null) {
                myURLConnection.disconnect();
            }
        }

        return jsn;
    }

    public static Property processProperty(Tenant tenant, JSONObject listing, AirbnbUser airbnbUser) {

        try {

            int id = listing.getInt("id");
            String name = listing.has("name") ? listing.getString("name") : null;

            Property property = PropertyManager.getInstance().getPropertyByAirBnBID(id + "");

            if (property == null) {

                property = PropertyManager.getInstance().createProperty();
            }

            property.setTenant(tenant);
            property.setIsActive(true);
            property.setName(name);
            property.setCreatedOn(new Date());
            property.setUpdatedOn(new Date());
            property.setAirbnbUser(airbnbUser);
            property.setAirBnBID(id + "");

            String address1 = null;
            try {
                address1 = listing.has("street") ? listing.getString("street") : null;
                property.setAddress1(address1);
            } catch (Exception e) {
            }

            String apt = null;
            try {
                apt = listing.has("apt") && !listing.isNull("apt") ? listing.getString("apt") : null;
                property.setAddress2(apt);
            } catch (Exception e) {
            }

            String state = null;
            try {
                state = listing.has("state") ? listing.getString("state") : null;
                property.setState(state);
            } catch (Exception e) {
            }

            String zipcode = null;
            try {
                zipcode = listing.has("zipcode") && !listing.isNull("zipcode") ? listing.getString("zipcode") : null;
                property.setZipCode(zipcode);
            } catch (Exception e) {
            }

            String city = null;
            try {
                city = listing.has("city") ? listing.getString("city") : null;
                property.setCity(city);
            } catch (Exception e) {
            }

            String country_code = null;
            try {
                country_code = listing.has("country_code") ? listing.getString("country_code") : null;
                property.setCountryCode(CountryCode.valueOf(country_code));
            } catch (Exception e) {
            }

            double lat = 0;
            try {
                lat = listing.has("lat") ? listing.getDouble("lat") : 0;
                property.setLatitude(lat);
            } catch (Exception e) {
            }

            double lng = 0;
            try {
                lng = listing.has("lng") ? listing.getDouble("lng") : 0;
                property.setLongitude(lng);
            } catch (Exception e) {
            }


            int bedrooms = 0;
            try {
                bedrooms = listing.has("bedrooms") ? listing.getInt("bedrooms") : 0;
                property.setBedrooms(bedrooms);
            } catch (Exception e) {
            }

            double bathrooms = 0;
            try {
                bathrooms = listing.has("bathrooms") ? listing.getDouble("bathrooms") : 0;
                property.setBathrooms(PropertyManager.getInstance().convertStringBathroomsToInteger(bathrooms + ""));
            } catch (Exception e) {
            }

            int beds = 0;
            try {
                beds = listing.has("beds") ? listing.getInt("beds") : 0;
                property.setBedCount(beds);
            } catch (Exception e) {
            }

            String permit_or_tax_id = null;
            try {
                permit_or_tax_id = listing.has("permit_or_tax_id") ? listing.getString("permit_or_tax_id") : null;
                property.setRentalLicenseNumber(permit_or_tax_id);
            } catch (Exception e) {
            }

            String picture_url = null;
            try {
                picture_url = listing.has("picture_url") ? listing.getString("picture_url") : null;
                property.setPicture(picture_url);
            } catch (Exception e) {
            }


            int minimumStay = 0;
            try {
                minimumStay = listing.has("min_nights_input_value") ? listing.getInt("min_nights_input_value") : 1;
                property.setMinimumStay(minimumStay);
            } catch (Exception e) {
            }

            int maximumStay = 0;
            try {
                maximumStay = listing.has("max_nights_input_value") ? listing.getInt("max_nights_input_value") : -1;
                property.setMaximumStay(maximumStay);
            } catch (Exception e) {
            }

            int maximumGuests = 0;
            try {
                maximumGuests = listing.has("person_capacity") ? listing.getInt("person_capacity") : 1;
                property.setMaximumGuests(maximumGuests);
            } catch (Exception e) {
            }

            try {
                String _currency = listing.getString("listing_currency");
                property.setCurrency(Currency.valueOf(_currency));
            } catch (Exception e) {
            }

            double baseDailyRate = 0;
            try {
                baseDailyRate = listing.has("listing_price") ? listing.getDouble("listing_price") : 1;
                property.setBaseDailyRate(baseDailyRate);
            } catch (Exception e) {
            }

            double weekendPrice = 0.0;
            try {
                weekendPrice = listing.has("listing_weekend_price") ? listing.getDouble("listing_weekend_price") : 0;
                property.setDefaultWeekendPrice(weekendPrice);
            } catch (Exception e) {
            }

            double SD = 0;
            try {
                SD = listing.has("listing_security_deposit") ? listing.getDouble("listing_security_deposit") : 0;
                property.setSecurityDepositAmount(SD);
            } catch (Exception e) {
            }

            double cleaningFee = 0;
            try {
                cleaningFee = listing.has("listing_cleaning_fee") ? listing.getDouble("listing_cleaning_fee") : 0;
                property.setCleaningFeeAmount(cleaningFee);
            } catch (Exception e) {
            }

            int baseGuests = 0;
            try {
                baseGuests = listing.has("guests_included") ? listing.getInt("guests_included") : 1;
                property.setBaseGuests(baseGuests);
            } catch (Exception e) {
            }

            double extraGuestFee = 0;
            try {
                extraGuestFee = listing.has("listing_extra_person_price") ? listing.getDouble("listing_extra_person_price") : 0;
                property.setExtraGuestFee(extraGuestFee);
            } catch (Exception e) {
            }

            String cancellationPolicy = "";
            try {
                cancellationPolicy = listing.has("cancellation_policy_category") ? listing.getString("cancellation_policy_category") : "flexible";
                property.setCancelationPolicy(cancellationPolicy);
            } catch (Exception e) {
            }

            property.save();

            return property;
        } catch (IllegalArgumentException cce) {
            cce.printStackTrace();
        }

        return null;
    }
}