package com.letulet.backend.channel.airbnb.api.rest;

import com.letulet.backend.channel.airbnb.api.Authorization;
import com.letulet.backend.model.Booking;
import com.letulet.backend.model.BookingManager;
import com.letulet.backend.model.Property;
import com.letulet.backend.model.PropertyManager;
import com.letulet.backend.model.airbnb.AirbnbUser;
import com.letulet.utils.Log;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationManager {

    public static final String AIRBNB_RESERVATION_API_REST_ENDPOINT = "https://api.airbnb.com/v2/reservations/";

    public static JSONObject getReservation(AirbnbUser airbnbUser, String confirmationCode) {

        Log.debug(ReservationManager.class, ">>>... AIrBnB REST API : getting reservation data for code..." + confirmationCode);

        HttpURLConnection myURLConnection = null;
        JSONObject jsn = new JSONObject();

        String authToken = airbnbUser.getAccessToken();

        try {

            if (!Authorization.isValidToken(authToken)) {
                authToken = Authorization.refreshAccessToken(airbnbUser);
                Log.debug(ReservationManager.class, ">>>... new AIrBnB token " + authToken);

                if (authToken == null) {

                    Log.info(ReservationManager.class, "Could not refresh access token for airbnb user ID " + airbnbUser.getID());
                    return null;
                }
            }


            URL myURL = new URL(AIRBNB_RESERVATION_API_REST_ENDPOINT + confirmationCode + "?_format=platform_partner");
            myURLConnection = (HttpURLConnection) myURL.openConnection();
            myURLConnection.setRequestProperty(ListingManager.AIRBNB_API_KEY_PARAM, Authorization.REST_CLIENT_ID);
            myURLConnection.setRequestProperty(ListingManager.AIRBNB_OAUTH_TOKEN_PARAM, authToken);
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestProperty("Accept", "application/json");
            myURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            myURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            myURLConnection.setRequestMethod("GET");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);

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

            _is.close();

            JSONObject obj = new JSONObject(response2.toString());
            JSONObject reservation = obj.getJSONObject("reservation");

            Log.debug(ReservationManager.class, "AirBnB reservation = ### " + reservation);

            return reservation;
        } catch (Exception e) {
            jsn.put("error", e.getMessage());
            e.printStackTrace();
        } finally {
            if (myURLConnection != null) {
                myURLConnection.disconnect();
            }
        }

        return jsn;
    }

    /* limit: max 50, default 20 */
    public static JSONObject getAllReservations(AirbnbUser airbnbUser, String airbnbID, Date start, Date end, int offset, int limit) {

        Log.debug(ReservationManager.class, ">>>... AIrBnB REST API : getAllReservation...");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        JSONObject jsn = new JSONObject();

        HttpURLConnection myURLConnection = null;

        String authToken = airbnbUser.getAccessToken();

        try {
            if (!Authorization.isValidToken(authToken, Authorization.REST_basicAuth)) {
                authToken = Authorization.refreshAccessToken(airbnbUser, Authorization.REST_basicAuth);
                Log.debug(ReservationManager.class, ">>>... new AIrBnB token " + authToken);

                if (authToken == null) {

                    Log.info(ReservationManager.class, "Could not refresh access token for airbnb user ID " + airbnbUser.getID());
                    return null;
                }
            }

            String _start = formatter.format(start);
            String _end = formatter.format(end);

            //String _url = AIRBNB_RESERVATION_API_REST_ENDPOINT + "?listing_id=" + airbnbID + "&_format=platform_partner&start_date=" + _start + "&end_date=" + _end + "&_offset=" + offset + "&_limit=" + limit + "&all_status=true";
            String _url = AIRBNB_RESERVATION_API_REST_ENDPOINT + "?listing_id=" + airbnbID + "&start_date=" + _start + "&end_date=" + _end + "&_offset=" + offset + "&_limit=" + limit + "&all_status=true";

            URL myURL = new URL(_url);
            myURLConnection = (HttpURLConnection) myURL.openConnection();
            myURLConnection.setRequestProperty(ListingManager.AIRBNB_API_KEY_PARAM, Authorization.REST_CLIENT_ID);
            myURLConnection.setRequestProperty(ListingManager.AIRBNB_OAUTH_TOKEN_PARAM, authToken);
            myURLConnection.setRequestProperty("Accept", "application/json");
            myURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            myURLConnection.setRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
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
                System.out.println(">>>>>>>>> " + inputLine);
                response2.append(inputLine);
            }

            JSONObject obj = new JSONObject(response2.toString());

            _is.close();

            return obj;

        } catch (ProtocolException e) {
            e.printStackTrace();
            jsn.put("error", e.getMessage());

        } catch (MalformedURLException e) {
            e.printStackTrace();
            jsn.put("error", e.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
            jsn.put("error", e.getMessage());

        } finally {
            if (myURLConnection != null) {
                myURLConnection.disconnect();
            }
        }

        return jsn;
    }

    public static Booking processBooking(JSONObject reservation){

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {

            String cancellation_policy = reservation.getString("cancellation_policy");
            String cancellation_policy_category = reservation.getString("cancellation_policy_category");
            String confirmation_code = reservation.getString("confirmation_code");
            String start_date = reservation.getString("start_date");
            double expected_payout_amount_accurate = reservation.getDouble("expected_payout_amount_accurate");
            String guest_email = reservation.getString("guest_email");
            String guest_first_name  = reservation.getString("guest_first_name");
            String guest_id  = reservation.getString("guest_id");
            String guest_last_name  = reservation.getString("guest_last_name");
            String listing_base_price_accurate = reservation.getString("listing_base_price_accurate");
            int listing_id = reservation.getInt("listing_id");
            int number_of_guests = reservation.getInt("number_of_guests");
            String end_date = reservation.getString("start_date");
            String status_type = reservation.getString("status_type");
            //String thread_id = reservation.getString("thread_id");

            Date checkin = dateFormat.parse(start_date);
            Date checkout = dateFormat.parse(end_date);


            Property property = PropertyManager.getInstance().getPropertyByAirBnBID(String.valueOf(listing_id));
            Booking booking = BookingManager.getInstance().getBookingByConfirmationCode(confirmation_code);

            if (booking == null) {

                booking = BookingManager.getInstance().createBooking(property, guest_email, checkin, checkout);
            }

            booking.setCancellationPolicy(cancellation_policy);
            booking.setCancellationPolicyCategory(cancellation_policy_category);
            booking.setExpectedPayoutAmountAccurate(expected_payout_amount_accurate);
            booking.setCheckinDate(checkin);
            booking.setCheckinDate(checkin);
            booking.setCheckoutDate(checkout);
            booking.setAdultCount(number_of_guests);
            booking.setConfirmationCode(confirmation_code);
            booking.setGuestEmail(guest_email);
            booking.setGuestFirstName(guest_first_name);
            booking.setGuestLastName(guest_last_name);
            booking.setGuestID(guest_id);

            booking.save();

            return booking;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}