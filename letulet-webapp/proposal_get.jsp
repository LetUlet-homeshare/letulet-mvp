<%@ page import="com.letulet.backend.model.*" %><%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.AgreementUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="org.json.JSONArray" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONArray jsonagreements = new JSONArray();
    JSONObject jsonagreement = new JSONObject();

    String agreementUID = request.getParameter("uid");

    if (Validator.isNotNull(agreementUID)) {

        try {

            Agreement agreement = AgreementManager.getInstance().getAgreementByUid(agreementUID);
            Property property = agreement.getProperty();
            Landlord landlord = property.getLandlord();

            jsonagreement.put("landlordCommissionRate", agreement.getLandlordCommissionRate());
            jsonagreement.put("payout", agreement.getPayout());
            jsonagreement.put("cleaningFeeAmount", agreement.getCleaningFeeAmount());
            jsonagreement.put("uid", agreement.getUID());

            if (agreement.getStatus() != null) {
                jsonagreement.put("status", agreement.getStatus());
                jsonagreement.put("statusLabel", agreement.getStatus().getLabel());
            }

            JSONObject jsonproperty = new JSONObject();
            jsonproperty.put("name", property.getName());
            jsonproperty.put("city", property.getCity());
            jsonproperty.put("address", property.getAddress1());
            jsonproperty.put("houseRules", property.getHouseRules());
            jsonproperty.put("complianceRules", property.getComplianceRules());
            jsonproperty.put("allowPets", property.getAllowPets());
            jsonproperty.put("allowSmoking", property.getAllowSmoking());
            if (property.getDisallowNoiseAfter() > 0) {
                jsonproperty.put("disallowNoiseAfter", property.getDisallowNoiseAfter());
            }
            jsonproperty.put("ownerName", property.getOwnerName());
            jsonproperty.put("maximumGuests", property.getMaximumGuests());
            jsonproperty.put("maximumDaysPerYear", property.getMaximumDaysPerYear());
            jsonproperty.put("maximumReservationsPerYear", property.getMaximumReservationsPerYear());
            jsonproperty.put("notifiedOfNewBooking", property.getNotifiedOfNewBooking());
            jsonagreement.put("Property", jsonproperty);

            JSONObject jsontenant = new JSONObject();
            jsontenant.put("bestProfile", TenantManager.getInstance().showBestProfile(property.getTenant())); //BEst profile //TODO
            jsonagreement.put("Tenant", jsontenant);

            JSONObject jsonlandlord = new JSONObject();
            jsonlandlord.put("email", landlord.getEmail());
            jsonagreement.put("Landlord", jsonlandlord);

            if (agreement.getLandlordBankAccount() != null) {
                JSONObject jsonbankaccount = new JSONObject();

                jsonbankaccount.put("id", agreement.getLandlordBankAccount().getID());
                jsonbankaccount.put("isActive", agreement.getLandlordBankAccount().getIsActive());
                jsonagreement.put("LandlordBankAccount", jsonbankaccount);
            }

            try {
                jsonagreement.put("textAgreement", AgreementUtil.getTextAgreement(agreement, false));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {

            e.printStackTrace();

            jsonagreement.put("message", "An error occurred: " + e.getMessage());
            jsonagreement.put("status", "error");
        }
%><%= jsonagreement.toString() %><%
    return;
%><%
    } else {

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

            jsonagreement.put("status", "error");
            jsonagreement.put("message", "No User");
%><%= jsonagreement.toString()%><%
            return;
        }

        Agreement[] agreements = null;

        if (landlord != null) {

            agreements = getAgreementsByLandlord(landlord);
        } else {

            agreements = AgreementManager.getInstance().getAgreementsByTenant(tenant);
        }

        for (Agreement agreement : agreements) {

            try {

                Property _property = agreement.getProperty();

                JSONObject _jsonagreement = new JSONObject();

                _jsonagreement.put("landlordCommissionRate", agreement.getLandlordCommissionRate());
                _jsonagreement.put("payout", agreement.getPayout());
                _jsonagreement.put("cleaningFeeAmount", agreement.getCleaningFeeAmount());
                _jsonagreement.put("uid", agreement.getUID());

                if (agreement.getStatus() != null) {
                    _jsonagreement.put("status", agreement.getStatus());
                    _jsonagreement.put("statusLabel", agreement.getStatus().getLabel());
                }

                JSONObject jsonproperty = new JSONObject();
                jsonproperty.put("name", _property.getName());
                jsonproperty.put("city", _property.getCity());
                jsonproperty.put("address", _property.getAddress1());
                jsonproperty.put("houseRules", _property.getHouseRules());
                jsonproperty.put("complianceRules", _property.getComplianceRules());
                jsonproperty.put("allowPets", _property.getAllowPets());
                jsonproperty.put("allowSmoking", _property.getAllowSmoking());
                if (_property.getDisallowNoiseAfter() > 0) {
                    jsonproperty.put("disallowNoiseAfter", _property.getDisallowNoiseAfter());
                }
                jsonproperty.put("ownerName", _property.getOwnerName());
                jsonproperty.put("maximumGuests", _property.getMaximumGuests());
                jsonproperty.put("maximumDaysPerYear", _property.getMaximumDaysPerYear());
                jsonproperty.put("maximumReservationsPerYear", _property.getMaximumReservationsPerYear());
                jsonproperty.put("notifiedOfNewBooking", _property.getNotifiedOfNewBooking());
                _jsonagreement.put("Property", jsonproperty);

                JSONObject jsontenant = new JSONObject();
                jsontenant.put("bestProfile", TenantManager.getInstance().showBestProfile(_property.getTenant())); //BEst profile //TODO
                _jsonagreement.put("Tenant", jsontenant);

                JSONObject jsonlandlord = new JSONObject();
                jsontenant.put("bestProfile", LandlordManager.getInstance().showBestProfile(_property.getLandlord()));
                jsonlandlord.put("email", _property.getLandlord().getEmail());
                _jsonagreement.put("Landlord", jsonlandlord);

                if (agreement.getLandlordBankAccount() != null) {
                    JSONObject jsonbankaccount = new JSONObject();

                    jsonbankaccount.put("id", agreement.getLandlordBankAccount().getID());
                    jsonbankaccount.put("isActive", agreement.getLandlordBankAccount().getIsActive());
                    jsonbankaccount.put("isDeleted", agreement.getLandlordBankAccount().getIsDeleted());
                    _jsonagreement.put("LandlordBankAccount", jsonbankaccount);
                }

                try {
                    _jsonagreement.put("textAgreement", AgreementUtil.getTextAgreement(agreement, false));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonagreements.put(_jsonagreement);
            } catch (Exception e) {

                e.printStackTrace();

                JSONObject _jsonagreement = new JSONObject();
                _jsonagreement.put("message", "An error occurred: " + e.getMessage());
                _jsonagreement.put("status", "error");
                jsonagreements.put(_jsonagreement);
            }
        }
    }
%><%= jsonagreements.toString() %><%!
    public Agreement[] getAgreementsByLandlord(Landlord landlord) {

        ArrayList<Agreement> agreements = new ArrayList<Agreement>();

        Property[] properties = PropertyManager.getInstance().getPropertiesByLandlord(landlord);

        for (Property p : properties) {

            Agreement[] a = AgreementManager.getInstance().getAgreementsByProperty(p);

            for (Agreement _a : a) {
                agreements.add(_a);
            }
        }

        return agreements.toArray(new Agreement[0]);
    }
%>