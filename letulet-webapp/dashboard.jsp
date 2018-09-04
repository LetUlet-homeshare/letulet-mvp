<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.backend.model.Tenant" %>
<%@ page import="com.letulet.backend.model.Landlord" %>
<%@ page import="com.letulet.backend.model.User" %>
<%
    request.setCharacterEncoding("UTF-8");

    Tenant tenant = null;
    Landlord landlord = null;
    User user =  (User)request.getSession().getAttribute("user");

    if (user instanceof Tenant) {

        tenant =  (Tenant)user;
        response.sendRedirect(request.getContextPath() + "/dashboard_tenant.jsp");
        return;
    }

    if (user instanceof Landlord) {

        landlord =  (Landlord)user;
        response.sendRedirect(request.getContextPath() + "/dashboard_landlord.jsp");
        return;
    }

    response.sendRedirect(request.getContextPath() + "/login.jsp");
    return;
%>