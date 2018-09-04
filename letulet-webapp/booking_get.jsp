<%@ page import="com.letulet.backend.model.*" %><%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.db.DBUtils" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONArray jsonbookings = new JSONArray();

    try {

        User user =  (User)request.getSession().getAttribute("user");

        String propertyID = request.getParameter("propertyID");

        if (Validator.isNull(propertyID)) {

            %><%= jsonbookings %><%
            return;
        }

        Property property = getPropertyById(propertyID);

        if (property == null) {

%><%= jsonbookings %><%
            return;
        }

        Booking[] bookings = getBookingByProperty(property);

        /*for (Booking booking : bookings) {

            JSONObject jsonbooking = new JSONObject();

            jsonbooking.put("id", booking.getID());

            jsonbookings.put(jsonbooking);
        }*/

        JSONObject jsonproperty = new JSONObject();
        jsonproperty.put("id", property.getID());
        jsonproperty.put("name", property.getName());
        jsonproperty.put("city", property.getCity());
        jsonproperty.put("address1", property.getAddress1());
        jsonproperty.put("address2", property.getAddress2());
        jsonproperty.put("zipCode", property.getZipCode());

        //TODO testing
        JSONObject jsonbooking1 = new JSONObject();
        jsonbooking1.put("id", 1);
        jsonbooking1.put("checkinDate", "2018-05-01");
        jsonbooking1.put("checkoutDate", "2018-05-20");
        jsonbooking1.put("guestFirstName", "Cedric");
        jsonbooking1.put("guestLastName", "Raudin");
        jsonbooking1.put("adultCount", 1);
        jsonbooking1.put("childrenCount", 2);
        jsonbooking1.put("property", jsonproperty);

        JSONObject jsonbooking2 = new JSONObject();
        jsonbooking2.put("id", 1);
        jsonbooking2.put("checkinDate", "2018-05-20");
        jsonbooking2.put("checkoutDate", "2018-05-24");
        jsonbooking2.put("guestFirstName", "Stephane");
        jsonbooking2.put("guestLastName", "Raudin");
        jsonbooking2.put("adultCount", 1);
        jsonbooking2.put("childrenCount", 2);
        jsonbooking2.put("property", jsonproperty);

        JSONObject jsonbooking3 = new JSONObject();
        jsonbooking3.put("id", 3);
        jsonbooking3.put("checkinDate", "2018-05-24");
        jsonbooking3.put("checkoutDate", "2018-06-10");
        jsonbooking3.put("guestFirstName", "Stephan");
        jsonbooking3.put("guestLastName", "Osmont");
        jsonbooking3.put("adultCount", 1);
        jsonbooking3.put("childrenCount", 2);
        jsonbooking3.put("property", jsonproperty);

        jsonbookings.put(jsonbooking1);
        jsonbookings.put(jsonbooking2);
        jsonbookings.put(jsonbooking3);
    } catch (Exception e) {

        e.printStackTrace();
    }
%><%= jsonbookings.toString() %><%!
    public Property getPropertyById(String id) {

        if(id == null) { throw new IllegalArgumentException(); }

        try {
            Property[] p = DBUtils.getEntityManager().find(Property.class, "ID = ?", id);
            if(p.length == 0)
                return null;
            else
                return p[0];

        } catch (SQLException se) {
            Log.error(PropertyManager.class, se.getMessage());
        }
        return null;
    }

    public Booking[] getBookingByProperty(Property property) {

        if(property == null) { throw new IllegalArgumentException(); }

        Booking[] l = null;

        try {

            return DBUtils.getEntityManager().find(Booking.class, "propertyID = ?", property);
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }
%>