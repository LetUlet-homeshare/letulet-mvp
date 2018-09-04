<%@ page import="com.letulet.backend.model.*" %><%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="org.json.JSONArray" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");


    String bankAccountID = request.getParameter("bankAccountID");
    JSONArray jsontransactions = new JSONArray();

    if (Validator.isNull(bankAccountID)) {
        JSONObject _jsonerror = new JSONObject();
        _jsonerror.put("message", "Missing data");
        _jsonerror.put("status", "error");
%><%= _jsonerror %><%
        return;
    }

    BankAccount bankAccount = BankAccountManager.getInstance().getBankAccountByID(bankAccountID);

    if (bankAccount == null) {
        JSONObject _jsonerror = new JSONObject();
        _jsonerror.put("message", "Invalid ID");
        _jsonerror.put("status", "error");
%><%= _jsonerror %><%
        return;
    }

    try {

        Transaction[] transactions = TransactionManager.getInstance().getTransactionsByBankAccount(bankAccount);

        for (Transaction transaction : transactions) {

            JSONObject jsontransaction = new JSONObject();

            jsontransaction.put("id", transaction.getID());
            jsontransaction.put("amount", transaction.getAmount());

            JSONObject bankAccountDestinationjson = new JSONObject();
            bankAccountDestinationjson.put("id", transaction.getBankAccountDestination().getID());
            jsontransaction.put("bankAccountDestination", bankAccountDestinationjson);

            JSONObject bankAccountSourcejson = new JSONObject();
            bankAccountSourcejson.put("id", transaction.getBankAccountSource().getID());
            jsontransaction.put("bankAccountSource", bankAccountSourcejson);
        }
    } catch (Exception e) {

        e.printStackTrace();

        JSONObject _jsonerror = new JSONObject();
        _jsonerror.put("message", e.getMessage());
        _jsonerror.put("status", "error");
%><%= _jsonerror %><%
        return;
    }
%><%= jsontransactions.toString() %>
