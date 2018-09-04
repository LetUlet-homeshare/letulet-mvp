<%@ page import="com.letulet.backend.model.*" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();

    try {

        String id = request.getParameter("id");

        if (Validator.isNull(id)) {

            json.put("status", "error");
            json.put("message", "No id");
%><%= json.toString()%><%
            return;
        }

        BankAccount bankAccount = BankAccountManager.getInstance().getBankAccountByID(id);

        if (bankAccount == null) {

        json.put("status", "error");
        json.put("message", "No bank account");
%><%= json.toString()%><%
            return;
        }

        bankAccount.setIsDeleted(true);
        bankAccount.save();
    } catch (Exception e) {

        e.printStackTrace();

        json.put("message", "An error occurred: " + e.getMessage());
        json.put("status", "error");
    }
%><%= json.toString() %>