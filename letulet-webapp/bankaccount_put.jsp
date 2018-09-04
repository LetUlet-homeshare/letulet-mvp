<%@ page import="com.letulet.backend.model.*" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.external.partners.NC2Helper" %>
<%@ page import="java.util.Date" %>
<%@ page import="org.json.JSONArray" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject bankaccountjson = new JSONObject();

    User user =  (User)request.getSession().getAttribute("user");

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String routingNumber = request.getParameter("routingNumber");
    String accountNumber = request.getParameter("accountNumber");
    String accountHolderName = request.getParameter("accountHolderName");
    String SSN = request.getParameter("SSN");
    String city = request.getParameter("city");
    String state = request.getParameter("state");
    String companyName = request.getParameter("companyName");
    String dateOfBirth = request.getParameter("dateOfBirth");
    String streetAddress = request.getParameter("streetAddress");
    String zipCode = request.getParameter("zipCode");

    if (Validator.isNull(id)) {

        bankaccountjson.put("status", "error");
        bankaccountjson.put("message", "No id");
        %><%= bankaccountjson.toString()%><%
        return;
    }

    BankAccount bankAccount = BankAccountManager.getInstance().getBankAccountByID(id);

    if (bankAccount == null) {

        bankaccountjson.put("status", "error");
        bankaccountjson.put("message", "No bank account");
        %><%= bankaccountjson.toString()%><%
        return;
    }


    bankAccount.setName(name);
    bankAccount.setAccountHolderName(accountHolderName);
    bankAccount.setRoutingNumber(routingNumber);
    bankAccount.setAccountNumber(accountNumber);
    bankAccount.setSSN(SSN);
    bankAccount.setCity(city);
    bankAccount.setState(state);
    bankAccount.setCompanyName(companyName);
    bankAccount.setStreetAddress(streetAddress);
    bankAccount.setZipCode(zipCode);
    bankAccount.setModified(new Date());

    try {

        bankAccount.setDateOfBirth(sdf.parse(dateOfBirth));
    } catch (Exception e) {
        e.printStackTrace();
    }

    bankAccount.save();

    //NC2
    BankAccount resp = null;

    try {

        resp = NC2Helper.createUpdateClient(bankAccount, user, false);

    } catch (Exception e) {
        bankaccountjson.put("message", "We are currently experiencing difficulties saving your account details. Please try again later");
        bankaccountjson.put("status", "error");
    }

    if (resp == null) {

        bankaccountjson.put("message", "We are currently experiencing difficulties saving your account details. Please try again later");
        bankaccountjson.put("status", "error");
        bankAccount.setIsActive(false);
        bankAccount.save();
    } else {

        bankAccount.setIsActive(true);
        bankAccount.save();
    }

    bankaccountjson.put("id", bankAccount.getID());
    bankaccountjson.put("isActive", bankAccount.getIsActive());
    bankaccountjson.put("name", bankAccount.getName());
    bankaccountjson.put("accountHolderName", bankAccount.getAccountHolderName());
    bankaccountjson.put("routingNumber", bankAccount.getRoutingNumber());
    bankaccountjson.put("SSN", bankAccount.getSSN());
    bankaccountjson.put("city", bankAccount.getCity());
    bankaccountjson.put("state", bankAccount.getState());
    bankaccountjson.put("companyName", bankAccount.getCompanyName());

    if (bankAccount.getDateOfBirth() != null) {
        bankaccountjson.put("dateOfBirth", sdf.format(bankAccount.getDateOfBirth()));
    }

    bankaccountjson.put("streetAddress", bankAccount.getStreetAddress());
    bankaccountjson.put("zipCode", bankAccount.getZipCode());

    //Transaction
    JSONArray transactionsjson = new JSONArray();
    Transaction[] transactions = TransactionManager.getInstance().getTransactionsByBankAccount(bankAccount);

    for (Transaction transaction : transactions) {

        JSONObject jsontransaction = new JSONObject();

        jsontransaction.put("id", transaction.getID());
        jsontransaction.put("amount", transaction.getAmount());
        jsontransaction.put("status", transaction.getStatus());

        JSONObject bankAccountDestinationjson = new JSONObject();
        jsontransaction.put("id", transaction.getBankAccountDestination().getID());
        jsontransaction.put("bankAccountDestination", bankAccountDestinationjson);

        JSONObject bankAccountSourcejson = new JSONObject();
        jsontransaction.put("id", transaction.getBankAccountSource().getID());
        jsontransaction.put("bankAccountSource", bankAccountSourcejson);
        transactionsjson.put(jsontransaction);
    }

    bankaccountjson.put("transactions", transactionsjson);
%><%= bankaccountjson.toString() %>