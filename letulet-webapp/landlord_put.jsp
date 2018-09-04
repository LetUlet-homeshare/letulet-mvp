<%@ page import="com.letulet.backend.model.*" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.*" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();

    try {
        String action = request.getParameter("action"); //new_password
        String password = request.getParameter("password");
        String agreementUID = request.getParameter("agreementUID");

        if (Validator.isNotNull(action) && action.equals("new_password")) {


            Agreement agreement = AgreementManager.getInstance().getAgreementByUid(agreementUID);

            Landlord landlord = agreement.getProperty().getLandlord();

            String hashedPassword = null;

            try {
                hashedPassword = HashPasswordUtil.hash(password);
                landlord.setHashedPassword(hashedPassword);
                landlord.save();

                request.getSession().setAttribute(WebConstants.USER_KEY, landlord);
                landlord.setLastLogin(new Date());
                landlord.setIsActive(true);
                landlord.save();

                json.put("status", "success");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    } catch (Exception e) {

        e.printStackTrace();

        json.put("message", "An error occurred: " + e.getMessage());
        json.put("status", "error");
    }
%><%= json.toString() %>