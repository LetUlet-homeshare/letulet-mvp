<%@ page import="org.apache.commons.io.IOUtils" %><%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page import="com.letulet.external.partners.NC2Helper" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="com.letulet.backend.model.Transaction" %>
<%@ page import="com.letulet.backend.model.TransactionManager" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%

    /*
1. URL provided by Cedric, for the delayed response from NC2 in regards to the liability request being sent; resulted in a 200 response. Hence, we need:
    a. Confirmation that LetUlet received the response.
    b. Confirmation from Cedric that he parsed the response
        and the code he authored process the requests  -- expectations
        (pass edits -- format and expect content).
2. Validate the date when an "updated" liability record can be created and passed.
   In other words, if -- during normal processing -- the "push" (for example) to the
   landlord fails, and the landlord updates their banking information -- the system should
            a). Update the landlord's record in NC2 (changing the bank account data)
            b). Resubmit the liability request (same request ID). NC2's system should
                 then realize that the funds are being held and that one push was
                 successful but, the final push (the one that failed) should be
                attempted again.
3. Schedule the initial joint testing activity (getting LetUlet (for lack of a
    better description) certified.
     */
/*
{"liabilityUpdate":
[{"note":"test",
"Invoice":
[{"arId":"22","balance":0,"errorType":"","apId":"21","errorCode":"","errorClientId":"","previousAmount":10,"paidAmount":10,"status":"settled"}],"liabilityId":"16","updateTimeStamp":"2018-08-01T14:31:00Z"}
]}
]
 */
    request.setCharacterEncoding("UTF-8");

    String json = IOUtils.toString(request.getReader()).trim();

    try {

        JSONObject data = new JSONObject(json);
        Log.info(NC2Helper.class, "liability Update > " + data);

        JSONArray liabilityUpdate = data.getJSONArray("liabilityUpdate");

        for (int i = 0 ; i < liabilityUpdate.length(); i++) {

            JSONObject _liabilityUpdate = liabilityUpdate.getJSONObject(i);

            String liabilityId = _liabilityUpdate.getString("liabilityId");

            Transaction transaction = TransactionManager.getInstance().getTransactionByID(liabilityId);

            if (transaction == null) {

                Log.info(NC2Helper.class, "Transaction with id  " + transaction + " not found.");
                continue;
            }

            //TODO send notification if missing info

            String settled = _liabilityUpdate.getString("settled");

            if (settled != null && settled.equals("failed")) {

                transaction.setStatus(Transaction.Status.PROCESSED);
            } else {

                transaction.setStatus(Transaction.Status.FAILED);
            }

            transaction.save();
        }
    } catch (Exception e) {

        e.printStackTrace();
    }

    JSONObject data = new JSONObject();
    data.put("status", "success");
%><%= data %>