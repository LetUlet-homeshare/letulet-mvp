<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="org.json.JSONObject" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();
    JSONObject jsonagreement = new JSONObject();

    try {

        String action = request.getParameter("action"); //Decline / sign
        String decline = request.getParameter("data[Proposal][decline]");
        String agreementUID = request.getParameter("data[Agreement][uid]");

        Agreement agreement = AgreementManager.getInstance().getAgreementByUid(agreementUID);
        Property property = agreement.getProperty();

        if (action != null) {

            if (action.equals("decline")) {

                agreement.setStatus(Agreement.Status.DECLINED);
                agreement.setReasonOfDecline(decline);
                agreement.save();
            }

            if (action.equals("set_rules")) {

                String notifiedOfNewBooking = request.getParameter("data[Property][notifiedOfNewBooking]");
                property.setNotifiedOfNewBooking(Validator.isNotNull(notifiedOfNewBooking));

                String maximumGuestsCheck = request.getParameter("data[Property][maximumGuestsCheck]");
                int maximumGuests = GetterUtil.getInteger(request.getParameter("data[Property][maximumGuests]"), 0);

                if (Validator.isNotNull(maximumGuestsCheck)) {

                    property.setMaximumGuests(maximumGuests);
                    property.save();
                } else {

                    property.setMaximumGuests(0);
                }

                String complianceRules = request.getParameter("data[Property][complianceRules]");

                if (Validator.isNotNull(complianceRules)) {

                    property.setComplianceRules(complianceRules);
                } else {
                    property.setComplianceRules(null);
                }

                String noPetsAllowed = request.getParameter("data[Property][notAllowPets]");

                if (Validator.isNotNull(noPetsAllowed)) {

                    property.setAllowPets(false);
                } else {

                    property.setAllowPets(true);
                }

                String disallowNoiseAfterCheck = request.getParameter("data[Property][[disallowNoiseAfterCheck]");
                int disallowNoiseAfter = GetterUtil.getInteger(request.getParameter("data[Property][[disallowNoiseAfter]"), -1);

                if (Validator.isNotNull(disallowNoiseAfterCheck)) {

                    property.setDisallowNoiseAfter(disallowNoiseAfter);
                } else {
                    property.setDisallowNoiseAfter(-1);
                }

                String noSmokingAllowed = request.getParameter("data[Proposal][noSmokingAllowed]");

                if (Validator.isNotNull(noSmokingAllowed)) {

                    property.setAllowSmoking(false);
                } else {

                    property.setAllowSmoking(true);
                }

                String houseRules = request.getParameter("data[Property][houseRules]");

                if (Validator.isNotNull(houseRules)) {

                    property.setHouseRules(houseRules);
                } else {

                    property.setHouseRules(null);
                }

                String ownerName = request.getParameter("data[Property][ownerName]");

                if (Validator.isNotNull(ownerName)) {

                    property.setOwnerName(ownerName);
                }

                int maximumReservationsPerYear = GetterUtil.getInteger(request.getParameter("data[Property][maximumReservationsPerYear]"), 0);
                property.setMaximumReservationsPerYear(maximumReservationsPerYear);

                int maximumDaysPerYear = GetterUtil.getInteger(request.getParameter("data[Property][maximumDaysPerYear]"), 0);
                property.setMaximumDaysPerYear(maximumDaysPerYear);

                //Rules
                int rulesCount = GetterUtil.getInteger("data[Proposal][Rules][count]", 0);

                for (int r = 1; r <= rulesCount; r++) {

                    String rule = request.getParameter("data[Proposal][Rules][" + r +"]");

                    if (Validator.isNotNull(rule)) {

                        //TODO + Getter
                    }
                }


                property.save();
            }

            if (action.equals("set_payout")) {

                //If this is from a landlord, this is a COUNTER OFFER
                User user =  (User)request.getSession().getAttribute("user");

                if (user != null && user instanceof Landlord) {

                    Landlord landlord = (Landlord) user;
                    agreement.setStatus(Agreement.Status.COUNTER_OFFER_SENT);
                    //TODO Send email
                    agreement.save();
                }

                int payout = GetterUtil.getInteger(request.getParameter("data[Proposal][payout]"), 0);
                int tenantPayout = GetterUtil.getInteger(request.getParameter("data[Proposal][tenant]"), 0);
                int landlordPercentage = GetterUtil.getInteger(request.getParameter("data[Proposal][landlord]"), 0);

                agreement.setPayout(payout);
                agreement.setCleaningFeeAmount(payout * 0.03);
                agreement.setLandlordCommissionRate(landlordPercentage);
                agreement.save();
            }

            if (action.equals("sign")) {

                String signature = request.getParameter("data[Landlord][signature]");
                agreement.setStatus(Agreement.Status.ACCEPTED);
                agreement.save();
            }
        }

        json.put("status", "success");

        jsonagreement.put("status", agreement.getStatus());
        jsonagreement.put("uid", agreement.getUID());
        jsonagreement.put("landlordCommissionRate", agreement.getLandlordCommissionRate());
        jsonagreement.put("cleaningFeeAmount", agreement.getCleaningFeeAmount());
        jsonagreement.put("status", agreement.getStatus());

        json.put("Agreement", jsonagreement);
    } catch (Exception e) {

        e.printStackTrace();

        json.put("message", "An error occurred: " + e.getMessage());
        json.put("status", "error");
    }
%><%= json.toString() %>