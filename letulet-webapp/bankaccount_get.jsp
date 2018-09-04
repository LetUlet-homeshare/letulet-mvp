<%@ page import="com.letulet.backend.model.*" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.letulet.backend.db.DBUtils" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject bankaccountjson = new JSONObject();
    JSONArray bankaccountsjson = new JSONArray();

    try {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        User user =  (User)request.getSession().getAttribute("user");

        Tenant tenant = null;
        Landlord landlord = null;

        if (user instanceof Tenant) {

            tenant = (Tenant) user;
        }

        if (user instanceof Landlord) {

            landlord = (Landlord) user;
        }

        if (tenant ==  null && landlord == null) {

            bankaccountjson.put("status", "error");
            bankaccountjson.put("message", "No User");
%><%= bankaccountjson.toString()%><%
            return;
        }

        if (tenant != null) {

            BankAccount bankAccount = tenant.getBankAccount();

            if (bankAccount != null) {

                bankaccountjson.put("id", bankAccount.getID());
                bankaccountjson.put("isActive", bankAccount.getIsActive());
                bankaccountjson.put("name", bankAccount.getName());
                bankaccountjson.put("accountHolderName", bankAccount.getAccountHolderName());
                bankaccountjson.put("routingNumber", bankAccount.getRoutingNumber());
                bankaccountjson.put("SSN", bankAccount.getSSN());
                bankaccountjson.put("city", bankAccount.getCity());
                bankaccountjson.put("state", bankAccount.getState());
                bankaccountjson.put("state", bankAccount.getState());
                bankaccountjson.put("companyName", bankAccount.getCompanyName());

                if (bankAccount.getDateOfBirth() != null) {
                    bankaccountjson.put("dateOfBirth", sdf.format(bankAccount.getDateOfBirth()));
                }
                bankaccountjson.put("streetAddress", bankAccount.getStreetAddress());
                bankaccountjson.put("zipCode", bankAccount.getZipCode());
                bankaccountjson.put("tenantID", tenant.getID());

                //Transaction
                JSONArray transactionsjson = new JSONArray();
                Transaction[] transactions = TransactionManager.getInstance().getTransactionsByBankAccount(bankAccount);

                for (Transaction transaction : transactions) {

                    JSONObject jsontransaction = new JSONObject();

                    jsontransaction.put("id", transaction.getID());
                    jsontransaction.put("amount", transaction.getAmount());
                    jsontransaction.put("status", transaction.getStatus());

                    JSONObject bankAccountDestinationjson = new JSONObject();
                    bankAccountDestinationjson.put("id", transaction.getBankAccountDestination().getID());
                    jsontransaction.put("bankAccountDestination", bankAccountDestinationjson);

                    JSONObject bankAccountSourcejson = new JSONObject();
                    bankAccountSourcejson.put("id", transaction.getBankAccountSource().getID());
                    jsontransaction.put("bankAccountSource", bankAccountSourcejson);
                    transactionsjson.put(jsontransaction);
                }

                bankaccountjson.put("transactions", transactionsjson);
            }
            %><%= bankaccountjson.toString()%><%
            return;
        }

        if (landlord != null) {

            Agreement[] agreements = getAgreementsByLandlord(landlord);


            for (Agreement agreement : agreements) {

                if (agreement.getLandlordBankAccount() == null) continue;

                BankAccount bankAccount = agreement.getLandlordBankAccount();

                if (agreement.getLandlordBankAccount().getIsDeleted()) continue;

                JSONObject _bankaccountjson = new JSONObject();

                _bankaccountjson.put("id", bankAccount.getID());
                _bankaccountjson.put("isActive", bankAccount.getIsActive());
                _bankaccountjson.put("name", bankAccount.getName());
                _bankaccountjson.put("accountHolderName", bankAccount.getAccountHolderName());
                _bankaccountjson.put("routingNumber", bankAccount.getRoutingNumber());
                _bankaccountjson.put("SSN", bankAccount.getSSN());
                _bankaccountjson.put("city", bankAccount.getCity());
                _bankaccountjson.put("state", bankAccount.getState());
                _bankaccountjson.put("state", bankAccount.getState());
                _bankaccountjson.put("companyName", bankAccount.getCompanyName());

                if (bankAccount.getDateOfBirth() != null) {
                    _bankaccountjson.put("dateOfBirth", sdf.format(bankAccount.getDateOfBirth()));
                }

                _bankaccountjson.put("streetAddress", bankAccount.getStreetAddress());
                _bankaccountjson.put("zipCode", bankAccount.getZipCode());
                _bankaccountjson.put("landlordID", landlord.getID());

                //Transaction
                JSONArray transactionsjson = new JSONArray();
                Transaction[] transactions = TransactionManager.getInstance().getTransactionsByBankAccount(bankAccount);

                for (Transaction transaction : transactions) {

                    JSONObject jsontransaction = new JSONObject();

                    jsontransaction.put("id", transaction.getID());
                    jsontransaction.put("amount", transaction.getAmount());
                    jsontransaction.put("status", transaction.getStatus());

                    JSONObject bankAccountDestinationjson = new JSONObject();
                    bankAccountDestinationjson.put("id", transaction.getBankAccountDestination().getID());
                    jsontransaction.put("bankAccountDestination", bankAccountDestinationjson);

                    JSONObject bankAccountSourcejson = new JSONObject();
                    bankAccountSourcejson.put("id", transaction.getBankAccountSource().getID());
                    jsontransaction.put("bankAccountSource", bankAccountSourcejson);
                    transactionsjson.put(jsontransaction);
                }

                _bankaccountjson.put("transactions", transactionsjson);
                bankaccountsjson.put(_bankaccountjson);
            }

            %><%= bankaccountsjson.toString()%><%
            return;
        }
    } catch (Exception e) {

        e.printStackTrace();

        bankaccountjson.put("message", "An error occurred: " + e.getMessage());
        bankaccountjson.put("status", "error");
    }
%><%= bankaccountjson.toString() %><%!
    /*public BankAccount getBankAccountByLandlord(Landlord landlord) {

        if(landlord == null) { throw new IllegalArgumentException(); }

        try {
            BankAccount[] b = DBUtils.getEntityManager().find(BankAccount.class, "landlordID = ? AND isDeleted = 0", landlord);
            if(b.length == 0)
                return null;
            else
                return b[0];

        } catch (SQLException se) {
            Log.error(BankAccountManager.class, se.getMessage());
        }
        return null;
    }

    public BankAccount[] getBankAccountsByTenant(Tenant tenant) {

        if(tenant == null) { throw new IllegalArgumentException(); }

        try {

            return DBUtils.getEntityManager().find(BankAccount.class, "tenantID = ? AND isDeleted = 0", tenant);
        } catch (SQLException se) {
            Log.error(BankAccountManager.class, se.getMessage());
        }
        return null;
    }*/

    public Agreement[] getAgreementsByLandlord(Landlord landlord) {

        ArrayList<Agreement> agreements = new ArrayList<Agreement>();

        Property[] properties = PropertyManager.getInstance().getPropertiesByLandlord(landlord);

        for (Property p : properties) {

            Agreement a = AgreementManager.getInstance().getAgreementByProperty(p);

            if (a != null) {

                agreements.add(a);
            }
        }

        return agreements.toArray(new Agreement[0]);
    }
%>