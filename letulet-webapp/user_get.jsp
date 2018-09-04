<%@ page import="com.letulet.backend.model.*" %>
<%@ page import="org.json.JSONObject" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();

    try {


        User user =  (User)request.getSession().getAttribute("user");

        String type = null;

        if (user == null) {

            return;
        }


        if (user instanceof Tenant) {

            type = "tenant";
        }

        if (user instanceof Landlord) {

            type = "landlord";
        }

        json.put("id", user.getID());
        json.put("userType", type);

    } catch (Exception e) {

        e.printStackTrace();

        json.put("message", "An error occurred: " + e.getMessage());
        json.put("status", "error");
    }
%><%= json.toString() %>