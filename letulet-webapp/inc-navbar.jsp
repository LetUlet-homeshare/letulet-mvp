<%@ page import="com.letulet.backend.model.*" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUser" %>
<%@ page import="com.letulet.backend.model.airbnb.AirbnbUserManager" %>
<%
    Tenant _tenant = null;
    Landlord _landlord = null;

    User _user =  (User)request.getSession().getAttribute("user");
    AirbnbUser _airbnbUser = AirbnbUserManager.getInstance().getAirbnbUserByUserID(String.valueOf(_user.getID()));

    if (_user instanceof Tenant) {

        _tenant =  (Tenant)_user;
    }

    if (_user instanceof Landlord) {

        _landlord =  (Landlord)_user;
    }

    if (_tenant == null && _landlord == null) {

        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return;
    }
    String __jspName = this.getClass().getSimpleName().replaceAll("_", ".");

    String userPictureURL = request.getContextPath() + "/img/profiles/" + (int)(Math.random() * 4) + ".png";

    if (_tenant != null && Validator.isNotNull((_tenant).getPictureURL())) {

        userPictureURL = _tenant.getPictureURL();
    }

    if (_landlord != null && Validator.isNotNull((_landlord).getPictureURL())) {

        userPictureURL = _landlord.getPictureURL();
    }
%><div class="letulet-navbar">

    <% if (__jspName.equals("banks_landlord.jsp") && _landlord != null) { %>
    <a href="#" class="btn btn-lg btn-rounded btn-red navbar-btn">ADD A BANK ACCOUNT</a>
    <% } %>

    <% if (_tenant != null) { %>
    <a href="<%= request.getContextPath() %>/airbnb/wizard/tenant/add_property_airbnb_wizard.jsp" class="btn btn-red btn-rounded btn-lg navbar-btn"><%= (_airbnbUser == null) ? "Connect to airbnb" : "Update airbnb data"%></a>
    <% } %>

    <div class="letulet-navbar-right">

        <% if (_tenant != null) { %>
        <span class="letulet-navbar-name"><%=  TenantManager.getInstance().showBestProfile(_tenant) %></span>
        <% } else if (_landlord != null) { %>
        <span class="letulet-navbar-name"><%=  LandlordManager.getInstance().showBestProfile(_landlord) %></span>
        <% } else { %>
        <a onclick="$('#loginmodal').modal('show');return false;return false;" class="letulet-navbar-login" href="<%= request.getContextPath() %>/login.jsp">Log In</a>
        <% } %>

        <div class="dropdown">
            <button onclick="toggleDropdown()" style="background-image: url('<%= userPictureURL %>')" class="dropbtn"></button>
            <div id="myDropdown" class="dropdown-content">
                <a href="<%= request.getContextPath() %>/settings.jsp">View Profile</a>
                <a style="color: #E24660;" href="<%= request.getContextPath() %>/logout.jsp">Log out</a>
            </div>
        </div>
    </div>
</div>