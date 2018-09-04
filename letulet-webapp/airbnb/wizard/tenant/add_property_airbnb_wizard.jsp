<%@ page import="com.letulet.backend.model.User" %>
<%@ page import="com.letulet.backend.model.Landlord" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUser" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUserManager" %>
<%@ page import="com.letulet.core.Config" %>
<%@ page import="com.letulet.backend.channel.airbnb.api.Authorization" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%
    request.setCharacterEncoding("UTF-8");

    User user =  (User)request.getSession().getAttribute("user");

    Tenant tenant = null;

    if (user instanceof Tenant) {

        tenant =  (Tenant)user;
    }

    AirbnbUser airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByUserID(String.valueOf(user.getID()));

    boolean showConnectButton = false;

    if (!hasAlreadyConnected(user)) {
        showConnectButton = true;
    } else {
        showConnectButton = false;

        if (!isTokenValid(airbnbUser)) {
            showConnectButton = true;
        }
    }

    String nextpage = Config.get("base.url") + "airbnb/wizard/tenant/add_property_airbnb_wizard2.jsp";
    String airbnbConnectRedirect = "https://www.letulet.com/airbnb/auth.jsp";

    if (!showConnectButton) {

        response.sendRedirect(nextpage);
        return;
    }
%><%!
    private boolean isTokenValid(AirbnbUser airbnbUser) {

        String authToken = airbnbUser.getAccessToken();

        if (!Authorization.isValidToken(authToken, Authorization.REST_basicAuth)) {
            String _authToken = Authorization.refreshAccessToken(airbnbUser, Authorization.REST_basicAuth);

            if (_authToken == null) {

                return false;
            }
        }

        return true;
    }

    private boolean hasAlreadyConnected(User user) {

        AirbnbUser airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByUserID(String.valueOf(user.getID()));

        if(airbnbUser != null) {
            return true;
        }

        return false;
    }

    private boolean hasAlreadyConnected(Landlord landlord) {

        AirbnbUser airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByUserID(String.valueOf(landlord.getID()));

        if(airbnbUser != null) {
            return true;
        }

        return false;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Orbirental | Airbnb properties</title>
    <%@ include file="../../../inc-header.jsp" %>
    <script src="https://www.airbnb.com/platform_js" async defer></script>
</head>
<body>
<%@ include file="../../../inc-header.jsp" %>

<div class="dashboard-page content">

    <%@ include file="../../../inc-menu.jsp" %>

    <div class="container-space container">

        <%@ include file="../../../inc-navbar.jsp" %>

        <div class="row">

            <div class="text-center col-xs-12">
                <div id="wrap" class="container animated fadeInDown">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="header">
                                <h2>Connect your Airbnb account below</h2>
                                <br/>
                            </div>

                            <div class="row">

                                <div class="col-xs-offset-4 col-xs-4 text-center">
                                    <span class="airbnb-connect"
                                          data-client-id="bcxy7w1sr75n4jjd93bj9efb"
                                          data-scope="vr,basic_listing_read,basic_reservation_read,basic_profile_read,guest_basic_profile_read,guest_anonymized_email_read"
                                          data-width="100%"
                                          data-redirect-uri="<%= airbnbConnectRedirect %>">
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /container -->
        </div>
    </div>
</div>

<%@ include file="../../../inc-footer-nolinks.jsp" %>
</body>
</html>
