<%@ page import="com.letulet.backend.model.*" %><%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.AgreementUtil" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONArray jsonproperties = new JSONArray();

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

        Property[] properties = null;


        if (landlord != null) {

            properties = PropertyManager.getInstance().getPropertiesByLandlord(landlord);
        }

        if (tenant != null) {

            properties = PropertyManager.getInstance().getPropertiesByTenant(tenant);
        }

        for (Property property : properties) {

            JSONObject jsonproperty = new JSONObject();
            JSONObject jsonstatistics = new JSONObject();
            JSONObject jsonmtd = new JSONObject();
            JSONObject jsonytd = new JSONObject();

            jsonproperty.put("id", property.getID());
            jsonproperty.put("name", property.getName());
            jsonproperty.put("city", property.getCity());
            jsonproperty.put("address1", property.getAddress1());
            jsonproperty.put("address2", property.getAddress2());
            jsonproperty.put("zipCode", property.getZipCode());

            jsonytd.put("amount", 200 * property.getID());
            jsonytd.put("guests", 22);
            jsonmtd.put("amount", 123 * property.getID());
            jsonmtd.put("guests", 5);
            jsonstatistics.put("MTD", jsonmtd);
            jsonstatistics.put("YTD", jsonytd);
            jsonproperty.put("statistics", jsonstatistics);

            jsonproperties.put(jsonproperty);
        }
    } catch (Exception e) {

        e.printStackTrace();
    }
%><%= jsonproperties.toString() %>