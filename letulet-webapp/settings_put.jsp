<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.backend.db.SettingManager" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();
    JSONObject jsonsettings = new JSONObject();

    User user =  (User)request.getSession().getAttribute("user");

    Setting settings = SettingManager.getInstance().getSetting(user);

    if (settings == null) {

        settings = SettingManager.getInstance().createSetting(user);
    }

    try {

        String field = request.getParameter("field");
        boolean value = GetterUtil.getBoolean(request.getParameter("value"), false);

        if (field != null) {

            if (field.equals("emailNotifications")) {

                settings.setEmailNotifications(value);
            }

            if (field.equals("smsNotifications")) {

                settings.setSMSNotifications(value);
            }

            if (field.equals("agreementStatus")) {

                settings.setAgreementStatus(value);
            }

            if (field.equals("newMessage")) {

                settings.setNewMessage(value);
            }

            if (field.equals("newDeposit")) {

                settings.setNewDeposit(value);
            }

            if (field.equals("stayLoggedIn")) {

                settings.setStayLoggedIn(value);
            }

            if (field.equals("smsVerification")) {

                settings.setSMSVerification(value);
            }

            settings.save();
        }

        json.put("status", "success");
    } catch (Exception e) {

        e.printStackTrace();

        json.put("message", "An error occurred: " + e.getMessage());
        json.put("status", "error");
    }
%><%= json.toString() %>