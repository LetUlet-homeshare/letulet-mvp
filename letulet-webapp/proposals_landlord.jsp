<%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="com.letulet.backend.model.Landlord" %>
<%@ page import="com.letulet.backend.model.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("UTF-8");

    Landlord landlord = null;
    User user =  (User)request.getSession().getAttribute("user");

    if (user instanceof Tenant) {

        landlord =  (Landlord) user;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Letulet | Agreements</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body ng-controller="AppController" ng-app="letulet">

<div class="proposals-landlord-page content">

    <%@ include file="inc-menu.jsp" %>

    <div ng-controller="ProposalController" class="container container-space">

        <%@ include file="inc-navbar.jsp" %>

        <div ng-include="'views/proposal/proposals-landlord.html'"></div>
        <div ng-include="'views/bankAccount/bank-account-create-modal.html'"></div>
    </div>
</div>
<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>

<script>
    setNavbarActive("agreements.jsp");
</script>
</body>
</html>
