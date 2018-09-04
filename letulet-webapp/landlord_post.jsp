<%@ page import="javax.mail.internet.AddressException" %><%@ page import="javax.mail.internet.InternetAddress" %><%@ page import="com.letulet.utils.CookieUtil" %><%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();

    try {

        String email = request.getParameter("data[Landlord][email]");
        String password = request.getParameter("data[Landlord][password]");
        String firstName = request.getParameter("data[Landlord][firstName]");
        String lastName = request.getParameter("data[Landlord][lastName]");

        if(Validator.isNull(email) || Validator.isNull(password) || Validator.isNull(firstName) || Validator.isNull(lastName)) {

            json.put("message", "Invalid data");
            json.put("status", "error");

%><%= json.toString() %><%
            return;
        }

        if (!isValidEmailAddress(email) || email.contains("yopmail.com") || email.contains("maildrop.cc") || email.contains("mailinator.com")) {
            json.put("message", "Invalid email");
            json.put("status", "error");

%><%= json.toString() %><%
            return;
        }

        User user = LandlordManager.getInstance().createLandlord(email, password);

        Landlord landlord = (Landlord) user;
        landlord.setFirstName(firstName);
        landlord.setLastName(lastName);
        landlord.save();

        request.getSession().setAttribute(WebConstants.USER_KEY, user);

        json.put("status", "success");

    } catch (Exception e) {
        e.printStackTrace();
        json.put("message", "An error occured.");
        json.put("status", "error");
    }
%><%= json.toString()%><%!
    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }
%>