<%@ page import="com.letulet.backend.model.*" %><%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.AgreementUtil" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.db.DBUtils" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
request.setCharacterEncoding("UTF-8");

JSONArray jsonstats = new JSONArray();

String type = request.getParameter("type");

try {

    User user =  (User)request.getSession().getAttribute("user");

    Tenant tenant = null;
    Landlord landlord = null;

    if (user instanceof Tenant) {

        tenant = (Tenant) user;
    }

    if (user instanceof Landlord) {

        landlord = (Landlord) user;
    }

    String propertyID = request.getParameter("propertyID");

    if (Validator.isNull(propertyID)) {
%><%= jsonstats.toString() %><%
        return;
    }

    Property property = getPropertyById(propertyID);

    if (Validator.isNull(propertyID)) {

%><%= jsonstats.toString() %><%
        return;
    }

    if (Validator.isNull(type)) {

%><%= jsonstats.toString() %><%
        return;
    }


    if (type.equalsIgnoreCase("homesharerevenue")) {

        //TODO
        JSONArray homesharerevenuejson = new JSONArray();

        JSONObject json1 = new JSONObject();
        json1.put("month", "January");
        json1.put("y", 50);
        json1.put("guests", 5);
        json1.put("stay", 4);
        homesharerevenuejson.put(json1);

        JSONObject json2 = new JSONObject();
        json2.put("month", "February");
        json2.put("y", 71);
        json2.put("guests", 2);
        json2.put("stay", 4);
        homesharerevenuejson.put(json2);

        JSONObject json3 = new JSONObject();
        json3.put("month", "March");
        json3.put("y", 106);
        json3.put("guests", 2);
        json3.put("stay", 1);
        homesharerevenuejson.put(json3);

        JSONObject json4 = new JSONObject();
        json4.put("month", "April");
        json4.put("y", 120);
        json4.put("guests", 4);
        json4.put("stay", 2);
        homesharerevenuejson.put(json4);

        JSONObject json5 = new JSONObject();
        json5.put("month", "May");
        json5.put("y", 45);
        json5.put("guests", 5);
        json5.put("stay", 7);
        homesharerevenuejson.put(json5);

        JSONObject json6 = new JSONObject();
        json6.put("month", "June");
        json6.put("y", 78);
        json6.put("guests", 5);
        json6.put("stay", 7);
        homesharerevenuejson.put(json6);

        JSONObject json7 = new JSONObject();
        json7.put("month", "July");
        json7.put("y", 150);
        json7.put("guests", 5);
        json7.put("stay", 7);
        homesharerevenuejson.put(json7);

        JSONObject json8 = new JSONObject();
        json8.put("month", "August");
        json8.put("y", 106);
        json8.put("guests", 5);
        json8.put("stay", 7);
        homesharerevenuejson.put(json8);

        %><%= homesharerevenuejson.toString()%><%
        return;
    }
} catch (Exception e) {

    e.printStackTrace();
}
%><%!
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
%>