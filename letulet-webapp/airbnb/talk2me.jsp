<%@ page import="org.apache.commons.io.IOUtils" %><%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.channel.airbnb.api.rest.BookingServlet" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page import="com.letulet.backend.channel.airbnb.api.rest.ReservationManager" %>
<%@ page import="com.letulet.backend.model.Booking" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%

   request.setCharacterEncoding("UTF-8");

    String jsonResponse = BookingServlet.SUCCESS;

    String json = IOUtils.toString(request.getReader()).trim();

    if(Validator.isNotNull(json)){
        Log.info(this.getClass(), ">>> JSON= " + json);

        try {

            JSONObject data = new JSONObject(json);
            String action = data.getString("action");
            System.out.println("action = " + action);

            handleEvent(action, data);

        } catch (Exception e) {

            e.printStackTrace();

            jsonResponse = BookingServlet.FAILURE;
        }

    } else {

        jsonResponse = BookingServlet.FAILURE;
    }

    Log.info(this.getClass(), "Airbnb API : response:" + jsonResponse);
%><%!

    public static final String reservation_acceptance_confirmation          = "reservation_acceptance_confirmation";
    public static final String reservation_cancellation_confirmation        = "reservation_cancellation_confirmation";
    public static final String reservation_alteration_confirmation          = "reservation_alteration_confirmation";
    public static final String test_notification                            = "test_notification";
    public static final String listing_synchronization_settings_updated     = "listing_synchronization_settings_updated";
    public static final String listings_mapped                              = "listings_mapped";
    public static final String listings_unlinked                            = "listings_unlinked";
    public static final String authorization_revoked                        = "authorization_revoked";
    public static final String payout_notification                          = "payout_notification";


    private static void handleEvent(String event, JSONObject data) {

        System.out.println("Airbnb API : " + event + " data:" + data.toString());

        JSONObject reservation = null;
        JSONArray updates = null;
        JSONArray mappings = null;
        JSONArray listing_ids = null;

        try {
            if (data.has("reservation")) {

                reservation = data.getJSONObject("reservation");
            }

            if (data.has("updates")) {

                updates = data.getJSONArray("updates");
            }

            if (data.has("mappings")) {

                mappings = data.getJSONArray("mappings");
            }

            if (data.has("listing_ids")) {

                listing_ids = data.getJSONArray("listing_ids");
            }

            if (event.equalsIgnoreCase(reservation_acceptance_confirmation)) {
                handleReservationAcceptanceConfirmation(reservation);
                return;
            }

            if (event.equalsIgnoreCase(reservation_cancellation_confirmation)) {
                handleReservationCancellationConfirmation(reservation);
                return;
            }

            if (event.equalsIgnoreCase(reservation_alteration_confirmation)) {
                handleReservationAlterationConfirmation(reservation);
                return;
            }

            if (event.equalsIgnoreCase(payout_notification)) {
                handlePayoutReservation(reservation);
                return;
            }


            if (event.equalsIgnoreCase(test_notification)) {
                return;
            }

            if (event.equalsIgnoreCase(listing_synchronization_settings_updated)) {
                handleListingSynchronizationUpdated(updates);
                return;
            }

            if (event.equalsIgnoreCase(listings_mapped)) {
                handleListingsMapped(mappings);
                return;
            }

            if (event.equalsIgnoreCase(listings_unlinked)) {
                handleListingsUnlinked(listing_ids);
                return;
            }

            if (event.equalsIgnoreCase(authorization_revoked)) {
                handleListingsUnlinked(listing_ids);
                return;
            }
        } catch (Exception e) {

            e.printStackTrace();
            return;
        }
    }


    private static void handlePayoutReservation(JSONObject reservation) {

        try {

            Booking lead = ReservationManager.processBooking(reservation);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private static void handleReservationAcceptanceConfirmation(JSONObject reservation) {


        try {

            Booking lead = ReservationManager.processBooking(reservation);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private static void handleReservationCancellationConfirmation(JSONObject reservation) {

        try {

            Booking lead = ReservationManager.processBooking(reservation);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private static void handleReservationAlterationConfirmation(JSONObject reservation) {

        try {

            Booking lead = ReservationManager.processBooking(reservation);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    //This notification is sent when a user has updated the synchronization settings for a set of listing, which right now include only synchronization category.
    private static void handleListingSynchronizationUpdated(JSONArray updates) {

        /*Channel channel = ChannelManager.getInstance().getChannelByName("AirBnB");

        for (int i = 0; i < updates.length(); i++) {

            try {
                JSONObject update = updates.getJSONObject(i);

                Property property = null;
                Agency agency = null;

                int listing_id = update.getInt("listing_id");
                String synchronization_category = update.getString("synchronization_category");

                if (update.has("after_mapping_listing_id")) {

                    int after_mapping_listing_id = update.getInt("after_mapping_listing_id");

                    Property _property = PropertyManager.getInstance().getPropertyByAirBnBID(after_mapping_listing_id + "", agency);

                    //The property has not been mapped yet
                    if (_property == null) {

                        property = PropertyManager.getInstance().getPropertyByAirBnBID(listing_id + "", agency);

                        if (property != null) {

                            property.setAirBnBID(after_mapping_listing_id + "");
                            property.save();


                        }
                    } else {

                        property = _property;
                    }
                } else {

                    property = PropertyManager.getInstance().getPropertyByAirBnBID(listing_id + "", agency);

                    if (property.getAirBnBID().equals(property.getAirBnBImportID())) {

                        property.setAirBnBImportID("_" + listing_id);
                        property.save();
                    }
                }

                if (property != null) {

                    ChannelSetting channelSetting = ChannelManager.getInstance().getPropertyChannelSetting(channel, property);

                    if (channelSetting != null) {

                        JSONObject jsn = new JSONObject();
                        jsn.put("synchronization_category", synchronization_category);
                        channelSetting.setSetting1(jsn.toString());
                        channelSetting.save();
                    }
                }
            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return;*/
    }

    //This notification is sent when a user has mapped a set of listings pushed by your application to a set of existing listings on Airbnb
    private static void handleListingsMapped(JSONArray mappings) {

        /*for (int i = 0; i < mappings.length(); i++) {

            try {
                JSONObject mapping = mappings.getJSONObject(i);

                int listing_id = mapping.getInt("listing_id");
                int updated_listing_id = mapping.getInt("updated_listing_id");
                Agency agency = null;

                //New version (via airbnbImportID)
                Property property = PropertyManager.getInstance().getPropertyByAirBnBImportID(listing_id + "");

                //Old version (via airbnbID)
                if (property == null) {

                    property = PropertyManager.getInstance().getPropertyByAirBnBID(listing_id + "", agency);
                }

                if (property != null) {

                    property.setAirBnBID(updated_listing_id + "");

                    if (updated_listing_id + "" == property.getAirBnBImportID()) { //The user create a new listing on airbnb, we need different ID so we know the property is mapped

                        property.setAirBnBImportID("_" + property.getAirBnBImportID());
                    }

                    property.save();

                    try {
                        //Delete ICS
                        ExternalCalendar externalCalendar = ExternalCalendarManager.getInstance().getExternalCalendarByPropertyAndSource(property, Lead.Source.IMPORT_AIRBNB);
                        if (externalCalendar != null) {

                            ExternalCalendarManager.getInstance().deleteExternalCalendar(externalCalendar);
                        }

                        //Delete IMPORT_AIRBNB
                        ArrayList<Property> properties = new ArrayList();
                        properties.add(property);
                        ArrayList<Lead.Source> sources = new ArrayList();
                        sources.add(Lead.Source.IMPORT_AIRBNB);
                        Date start = DateUtil.addDays(new Date(), -30);
                        Date end = DateUtil.addDays(new Date(), 365);
                        Lead[] leads = LeadManager.getInstance().getLeads(property.getAgency(), properties, null, null, null, sources, start, null, null, end, 0, 500);

                        for (Lead lead : leads) {

                            lead.setIsDeleted(true);
                            lead.save();
                        }

                        //Import airbnb bookings
                        AirbnbUser airbnbUser = null;

                        if (property.getAirbnbUser() != null) {

                            airbnbUser = property.getAirbnbUser();
                        } else {

                            AirbnbUser[] airbnbUsers= AirbnbUserManager.getInstance().getAirbnbUserByAgengy(property.getAgency());

                            if (airbnbUsers != null && airbnbUsers.length > 0) {

                                airbnbUser = airbnbUsers[0];
                            }
                        }

                        if (airbnbUser == null) continue;

                        boolean keepgoing = true;

                        int offset = 0;
                        int limit = 50;

                        while (keepgoing) {

                            try {

                                JSONObject jsonresp = ReservationManager.getAllReservation(airbnbUser, property, start, end, offset, limit);

                                JSONArray reservations = jsonresp.getJSONArray("reservations");

                                Log.info(ReservationManager.class, "Airbnb import >>>> " + reservations.toString());

                                for (int r = 0; r < reservations.length(); r++) {

                                    //Check if available
                                    JSONObject reservation = reservations.getJSONObject(r);

                                    ReservationManager.processNewReservation(reservation, (Employee) airbnbUser.getUser());
                                }

                                if (reservations.length() < 50) {
                                    keepgoing = false;
                                }

                                offset += limit;

                            } catch (Exception e) {

                                e.printStackTrace();
                                keepgoing = false;
                            }
                        }

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {

                e.printStackTrace();
            }

        }

        return;*/
    }

    private static void handleListingsUnlinked(JSONArray listing_ids) {

        /*try {
            for (int i = 0; i < listing_ids.length(); i++) {

                int listing_id = listing_ids.getInt(i);
                Agency agency = null;

                Property property = PropertyManager.getInstance().getPropertyByAirBnBID(listing_id + "", agency);

                if (property != null) {

                    Channel channel = ChannelManager.getInstance().getChannelByName("AirBnB");
                    ChannelManager.getInstance().removePropertyChannelSetting(property, channel);

                    property.setAirbnbUser(null);
                    property.setAirBnBImportID(null);
                    property.setAirBnBID(null);
                    property.save();

                    //Delete  airbnbID on photos
                    Photo[] photos = PhotoManager.getInstance().getPropertyPhotos(property);

                    for (Photo photo : photos) {

                        if (Validator.isNotNull(photo.getAirBnbID())) {

                            photo.setAirBnbID(null);
                            photo.save();
                        }
                    }
                }
            }
        } catch (Exception e) {

            e.printStackTrace();
        }*/
    }
%><%= jsonResponse %>