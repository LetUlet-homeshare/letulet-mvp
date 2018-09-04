<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.backend.model.Landlord" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUserManager" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUser" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%
    request.setCharacterEncoding("UTF-8");

    Tenant tenant = null;
    com.letulet.backend.model.User user =  (com.letulet.backend.model.User)request.getSession().getAttribute("user");

    if (user instanceof Tenant) {

        tenant =  (Tenant)user;
    }

    String error = request.getParameter("error");
    String code = request.getParameter("code");
    String airbnbUserID = request.getParameter("airbnbUserID");

    if (Validator.isNotNull(error)) {

        String error_description = request.getParameter("error_description");

        Log.info(AirbnbUserManager.class, "Error on onboarding while connecting airbnb account: " + error_description);
        return;
    }

    AirbnbUser airbnbUser = null;

    //Onboarding / Create airbnb user
    if (Validator.isNotNull(code)) {

        System.out.println(">>>>>>>>>>> AIRBNB code = " + code);
        JSONObject tokens = com.letulet.backend.channel.airbnb.api.rest.UserManager.getTokens(code);
        System.out.println(">>>>>>>>>>> AIRBNB tokens = " + tokens);
        String access_token = tokens.getString("access_token");
        String refresh_token = tokens.getString("refresh_token");
        String user_id = String.valueOf(tokens.getInt("user_id"));

        airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByAirbnbUserID(user_id);

        if (airbnbUser == null) {

            airbnbUser = AirbnbUserManager.getInstance().createAirbnbUser(user_id, access_token, refresh_token, user);
        } else {

            airbnbUser.setAccessToken(access_token);
            airbnbUser.setRefreshToken(refresh_token);
            airbnbUser.save();
        }
    }

    //Import for single account page
    if (airbnbUser == null) {

        airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByUserID(String.valueOf(user.getID()));
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Orbirental | Airbnb properties</title>
    <%@ include file="../../../inc-header.jsp" %>
</head>
<body>
<style>
    div.property {
        margin: 10px 0px;
    }

    .header img {
        height: 140px;
        margin-right: 15px;
    }

    ol.choices-list {
        counter-reset: section;
        list-style-type: none;
        margin-left: 0;
        margin-bottom: 30px;

    }

    ol.choices-list > li {
        counter-increment: customlistcounter;
    }

    ol.choices-list > li:before {
        content: counter(customlistcounter) " ";
        font-weight: bold;
        float: left;
        width: 30px;
        height: 30px;
        border: 2px solid #5cb85c;
        border-radius: 50%;
        text-align: center;
        font-size: 18px;
        margin-right: 20px;
    }

    ol.choices-list:first-child {
        counter-reset: customlistcounter;
    }

    .choice {
        display: flex;
        flex-direction: column;
        color: gray;
    }

    .choice a {
        font-size: 21px;
        font-weight: bold;
        margin-bottom: 5px;
    }

    .separator {
        width: 100%;
        background-color: rgba(128, 128, 128, 0.5);
        height: 1px;
        position: relative;
        margin: 30px 0;
        text-align: center;
    }

    .separator span {
        position: absolute;
        left: 45%;
        top: -8px;
        background-color: white;
        display: block;
        padding-top: -10px;
        padding: 0 30px;
    }

    .properties-list {
        list-style: none;
        padding: 0;
        margin-top: 50px;
        margin-bottom: 50px;
    }

    .property {
        display: flex;
        align-items: center;
        justify-content: flex-start;
        flex-wrap: wrap;
        flex-direction: row;
    }

    .container_icon {
        flex: 0 1 20%;
    }

    .property_icon {
        border: 0.09em solid #e6e6e6;
        padding: .319em;
        border-radius:50% 50% 50% 50%;
        width:90px;
        height:90px !important;
    }

    .property-details {
        display: flex;
        align-items: center;
        justify-content: space-between;
        flex: 0 1 80%;
        flex-wrap: wrap;
    }

    .property-details .author {
        flex: 0 1 100%;
    }

    .property-process {
        flex: 0 1 100%;
        text-align: right;
    }

    .property-loader {
        float: right;
        display: none;
    }

    .property-loader.active {
        display: block;
    }

    .property-name {
        font-size:24px;
    }
</style>

<div class="dashboard-page content">

    <%@ include file="../../../inc-menu.jsp" %>

    <div class="container-space container">

        <%@ include file="../../../inc-navbar.jsp" %>

        <div class="row">

            <div class="col-xs-12 text-center">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="header">
                            <h2>We're loading your data...</h2>
                            <br/>
                        </div>
                        <span id="subheader" class="choice">This might take several minutes, so sit back and relax while we get everything ready</span>
                    </div>
                    <br/><br/>
                    <div class="col-xs-offset-2 col-xs-8">
                        <div id="properties" class="properties row">

                        </div>

                        <div class="row" style="text-align:center" id="properties-loader" style="display:none">
                            <img style="margin: 20px auto;" src="<%= request.getContextPath() %>/img/loader.gif" />
                        </div>
                        <br/><br/>
                        <a style="display:none" id="dashboardButton" href="<%= request.getContextPath() %>/dashboard_tenant.jsp" class="btn btn-red btn-rounded btn-lg ">Go to my dashboard</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /container -->
</div>

<%@ include file="../../../inc-footer-nolinks.jsp" %>
</body>
</html>

<script src="<%= request.getContextPath() %>/assets/js/onboarding_landlord.js"></script>

</body>
</html>