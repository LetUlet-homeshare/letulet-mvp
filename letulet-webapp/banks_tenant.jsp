<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.backend.model.Tenant" %>
<%@ page import="com.letulet.backend.model.Landlord" %>
<%@ page import="com.letulet.backend.model.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%
    request.setCharacterEncoding("UTF-8");

    Tenant tenant = null;
    User user =  (User)request.getSession().getAttribute("user");

    if (user instanceof Tenant) {

        tenant =  (Tenant)user;
    }

%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Letulet | Bank Info</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body ng-controller="AppController" ng-app="letulet">

<div class="dashboard-page content">

    <%@ include file="inc-menu.jsp" %>

    <div ng-controller="BankAccountController" class="container container-space">

        <%@ include file="inc-navbar.jsp" %>

        <div ng-hide="!bankAccount.id" class="row">
            <div class="col-xs-5">
                <div class="widget">
                    <div class="row">
                        <div class="col-xs-12">
                            <div ng-show="bankAccount" ng-include="'views/bankAccount/bank-account.html'"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div ng-include="'views/bankAccount/bank-account-create-modal.html'"></div>

        <div ng-hide="bankAccount.id" class="row">
            <div class="col-xs-5">
                <div class="widget">
                    <div class="row">
                        <div class="col-xs-12">
                            <button class="btn btn-lg btn-red" ng-hide="bankAccount.id" ng-click="openCreateBankAccountModal(proposal)">create bank account</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>

<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/banks.js"></script>

</body>
</html>
