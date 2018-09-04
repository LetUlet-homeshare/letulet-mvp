<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUser" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUserManager" %>
<%@ page import="com.letulet.backend.channel.airbnb.api.rest.UserManager" %>
<%@ page import="com.letulet.backend.model.User" %><%

    //https://www.letulet.com/airbnb/auth.jsp?code=5p9zgqaleli61ldgp6wq9av6l&scope=basic_listing_read+basic_reservation_read&state=
    request.setCharacterEncoding("UTF-8");
    User user =  (User)request.getSession().getAttribute("user");

    String code = request.getParameter("code");
    JSONObject tokens = UserManager.getTokens(code);
    String access_token = tokens.getString("access_token");
    String refresh_token = tokens.getString("refresh_token");
    String user_id = String.valueOf(tokens.getInt("user_id"));

    AirbnbUser airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByAirbnbUserID(user_id);

    if (airbnbUser == null) {

        airbnbUser = AirbnbUserManager.getInstance().createAirbnbUser(user_id,access_token, refresh_token, user);
    } else {

        airbnbUser.setAccessToken(access_token);
        airbnbUser.setRefreshToken(refresh_token);
        airbnbUser.save();
    }

    response.sendRedirect(request.getContextPath() + "/airbnb/wizard/tenant/add_property_airbnb_wizard.jsp");
%>