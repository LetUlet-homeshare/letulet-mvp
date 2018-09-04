<%@ page import="java.util.*" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUser" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUserManager" %>
<%@ page import="com.letulet.backend.model.*" %>
<%@ page import="com.letulet.backend.utils.WorkerThreads" %>
<%@ page import="com.letulet.utils.DateUtil" %>
<%@ page import="com.letulet.backend.channel.airbnb.api.rest.ReservationManager" %>
<%@ page import="com.letulet.backend.channel.airbnb.api.rest.ListingManager" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="com.letulet.backend.channel.airbnb.api.Authorization" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.net.ProtocolException" %>
<%@ page import="java.net.MalformedURLException" %>
<%@ page import="java.io.IOException" %>
<%@ page
        import="static com.letulet.backend.channel.airbnb.api.rest.ReservationManager.AIRBNB_RESERVATION_API_REST_ENDPOINT" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");
    User _user =  (User)request.getSession().getAttribute("user");

    Tenant tenant = null;

    if (_user instanceof Tenant) {

        tenant =  (Tenant)_user;
    }

    AirbnbUser airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByUserID(String.valueOf(_user.getID()));

    JSONArray jsonproperties = new JSONArray();

    JSONObject airbnbListingsJSON = ListingManager.getAllListings(airbnbUser, 0, true);

    JSONArray listings = airbnbListingsJSON.getJSONArray("listings");
    JSONObject metadata = airbnbListingsJSON.getJSONObject("metadata");

    int pagination = 20;
    int record_count = metadata.getInt("record_count");

    for (int offset = 0; offset < record_count; offset += pagination) {

        if (airbnbListingsJSON == null) {

            airbnbListingsJSON = ListingManager.getAllListings(airbnbUser, offset, true);

            listings = airbnbListingsJSON.getJSONArray("listings");
        }

        for (int l = 0; l < listings.length(); l++) {

            try {

                JSONObject listing = listings.getJSONObject(l);

                Property p = ListingManager.processProperty(tenant, listing, airbnbUser);

                if (p == null) {
                    continue;
                }

                final int airbnbID = listing.getInt("id");
                final AirbnbUser _airbnbuser = airbnbUser;
                final Property _p = p;

                WorkerThreads.submit("Importing Reservations from airbnb", new Runnable() {
                    public void run() {

                        boolean keepgoing = true;

                        Date start = DateUtil.addDays(new Date(), -100);
                        Date end = DateUtil.addDays(new Date(), 365);

                        int offsetR = 0;
                        int limit = 50;

                        while (keepgoing) {

                            try {

                                Log.info(ListingManager.class, "airbnbReservationsJSON: " + getAllReservations(_airbnbuser, airbnbID + "", start, end, offsetR, limit));

                                JSONObject airbnbReservationsJSON = ReservationManager.getAllReservations(_airbnbuser, airbnbID + "", start, end, offsetR, limit);

                                Log.info(ListingManager.class, "airbnbReservationsJSON: " + airbnbReservationsJSON);

                                JSONArray reservations = airbnbReservationsJSON.getJSONArray("reservations");

                                for (int r = 0; r < reservations.length(); r++) {

                                    JSONObject reservation = reservations.getJSONObject(r);
                                    ReservationManager.processBooking(reservation);
                                }

                                if (reservations.length() < 50) {
                                    keepgoing = false;
                                }

                                offsetR += limit;

                            } catch (Exception e) {

                                e.printStackTrace();
                                keepgoing = false;
                            }
                        }
                    }
                });


                JSONObject jsonproperty = new JSONObject();

                jsonproperty.put("listing", airbnbListingsJSON);
                jsonproperty.put("id", p.getID());
                jsonproperty.put("uid", p.getUID());
                jsonproperty.put("picture", p.getPicture());
                jsonproperty.put("name", p.getName());

                jsonproperties.put(jsonproperty);
            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        if (listings.length() < pagination) {
            break;
        }

        airbnbListingsJSON = null;
    }
%><%= jsonproperties.toString() %><%!
    public static String getAllReservations(AirbnbUser airbnbUser, String airbnbID, Date start, Date end, int offset, int limit) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        String _start = formatter.format(start);
        String _end = formatter.format(end);

        return AIRBNB_RESERVATION_API_REST_ENDPOINT + "?listing_id=" + airbnbID + "&_format=platform_partner&start_date=" + _start + "&end_date=" + _end + "&_offset=" + offset + "&_limit=" + limit + "&all_status=true";
    }

%>