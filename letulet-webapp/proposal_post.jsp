<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.utils.email.TemplateEngine" %>
<%@ page import="com.letulet.utils.StringUtil" %>
<%@ page import="com.letulet.core.Config" %>
<%@ page import="com.letulet.utils.email.SimpleMailer" %>
<%@ page import="org.json.JSONObject" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();

    try {

        String email = request.getParameter("data[Landlord][email]");

        String address = request.getParameter("data[Property][address]");
        String apt = request.getParameter("data[Property][apt]");
        String city = request.getParameter("data[Property][city]");
        String state = request.getParameter("data[Property][state]");
        String zipcode = request.getParameter("data[Property][zipcode]");

        int bedrooms = GetterUtil.getInteger(request.getParameter("data[Property][bedrooms]"), 0);
        int bathrooms = GetterUtil.getInteger(request.getParameter("data[Property][bathrooms]"), 0);

        int payout = GetterUtil.getInteger(request.getParameter("data[Proposal][payout]"), 0);
        int tenantPercentage = GetterUtil.getInteger(request.getParameter("data[Proposal][tenant]"), 0);
        int landlordPercentage = GetterUtil.getInteger(request.getParameter("data[Proposal][landlord]"), 0);

        String notes = request.getParameter("data[Proposal][notes]");

        Tenant tenant =  (Tenant)request.getSession().getAttribute("user");

        if (tenant ==  null) {

            json.put("status", "error");
            json.put("message", "No Tenant");
%><%= json.toString()%><%
            return;
        }

        User user = UserManager.getInstance().getUserByEmail(email);
        Landlord landlord = null;

        if (user != null && user instanceof Landlord) {

            landlord = (Landlord) user;
        } else {

            landlord = LandlordManager.getInstance().createLandlord(email, "");
            landlord.setIsActive(false);
            landlord.save();
        }

        Property property = PropertyManager.getInstance().createProperty();
        property.setAddress1(address);
        property.setAddress2(apt);
        property.setZipCode(zipcode);
        property.setCity(city);
        property.setState(state);
        property.setTenant(tenant);
        property.setLandlord(landlord);
        property.setBedrooms(bedrooms);
        property.setBathrooms(bathrooms);
        property.save();

        Agreement agreement = AgreementManager.getInstance().createAgreement(property);
        agreement.setCleaningFeeAmount(payout * 0.03);
        agreement.setProperty(property);
        agreement.setStatus(Agreement.Status.NEW);
        agreement.setPersonalContent(notes);
        agreement.setLandlordCommissionRate(landlordPercentage);
        agreement.setPayout(payout);

        agreement.save();

        //Send email to landlord
        String emailBody = TemplateEngine.get("invitation_landlord.html", "en_US");
        emailBody = StringUtil.replace(
                emailBody,
                new String[] {"[$REVIEW_PROPOSAL_URL$]"},
                new String[] {Config.get("base.url") + "proposal_review.jsp?uid=" + agreement.getUID()});

        SimpleMailer.getInstance().spawnThreadAndSend(Config.getAsString("mailer.smtp.replyto") , email,
                "Partner with your tenant and earn extra income!", emailBody, null);


        json.put("status", "success");

    } catch (Exception e) {

        e.printStackTrace();

        json.put("message", "An error occurred: " + e.getMessage());
        json.put("status", "error");
    }
%><%= json.toString() %>