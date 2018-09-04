<%@ page import="com.letulet.backend.model.*" %><%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="com.letulet.external.partners.NC2Helper" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="java.io.OutputStream" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");


    String transactionID = request.getParameter("transactionID");

    JSONObject resp = new JSONObject();

    if (Validator.isNull(transactionID)) {
        JSONObject _jsonerror = new JSONObject();
        _jsonerror.put("message", "Missing data");
        _jsonerror.put("status", "error");
%><%= _jsonerror %><%
        return;
    }

    Transaction transaction = TransactionManager.getInstance().getTransactionByID(transactionID);

    if (transaction == null) {
        JSONObject _jsonerror = new JSONObject();
        _jsonerror.put("message", "Invalid ID");
        _jsonerror.put("status", "error");
%><%= _jsonerror %><%
        return;
    }

    try {

        String t = NC2Helper.liabilityNotification(transaction);

        try {

            JSONObject re = new JSONObject(t);

        } catch (Exception e) {
                e.printStackTrace();
        }
    } catch (Exception e) {

        e.printStackTrace();

        JSONObject _jsonerror = new JSONObject();
        _jsonerror.put("message", e.getMessage());
        _jsonerror.put("status", "error");
%><%= _jsonerror %><%
        return;
    }
%><%= resp %>