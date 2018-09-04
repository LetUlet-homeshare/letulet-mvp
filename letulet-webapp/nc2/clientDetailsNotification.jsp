<%@ page import="org.apache.commons.io.IOUtils" %><%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page import="com.letulet.external.partners.NC2Helper" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="com.letulet.backend.model.BankAccount" %>
<%@ page import="com.letulet.backend.model.BankAccountManager" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%

/*
"clientDetails":[{
"clientId": "string",
"accountDetailsRequired": boolean, //
"accountDetailsStatus": boolean,
"dateOfBirthRequired": boolean,
"dateOfBirthStatus": boolean,
"taxIdRequired": boolean,
"taxIdStatus": boolean,
"kycFlag": "'Green', 'Red', 'Orange'",
"status": "open, closed"
"notificationTimeStamp": "string",
}
]
 */
    request.setCharacterEncoding("UTF-8");

    String json = IOUtils.toString(request.getReader()).trim();

    try {

        JSONObject data = new JSONObject(json);
        Log.info(NC2Helper.class, "client details notifications > " + data);

        JSONArray clientDetails = data.getJSONArray("clientDetails");

        for (int i = 0 ; i < clientDetails.length(); i++) {

            JSONObject clientDetail = clientDetails.getJSONObject(i);

            String clientId = clientDetail.getString("clientId");
            boolean accountDetailsRequired = clientDetail.getBoolean("accountDetailsRequired");
            boolean accountDetailsStatus = clientDetail.getBoolean("accountDetailsStatus");
            boolean dateOfBirthRequired = clientDetail.getBoolean("dateOfBirthRequired");
            boolean dateOfBirthStatus = clientDetail.getBoolean("dateOfBirthStatus");
            boolean taxIdRequired = clientDetail.getBoolean("taxIdRequired");
            boolean taxIdStatus = clientDetail.getBoolean("taxIdStatus");
            String kycFlag = clientDetail.getString("kycFlag");
            String status = clientDetail.getString("status");

            BankAccount bankAccount = BankAccountManager.getInstance().getBankAccountByID(clientId);

            if (bankAccount == null) {

                Log.info(NC2Helper.class, "Bank account with id  " + clientId + " not found.");
                continue;
            }

            //TODO send notification if missing info

            bankAccount.setNC2Status(status);
            bankAccount.setNC2Flag(kycFlag);
            bankAccount.save();
        }

    } catch (Exception e) {

        e.printStackTrace();
    }

    JSONObject data = new JSONObject();
    data.put("status", "success");
%><%= data %>