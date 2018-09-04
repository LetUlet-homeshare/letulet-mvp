<%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.AgreementManager" %>
<%@ page import="com.letulet.backend.model.Agreement" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<%
    String uid = request.getParameter("uid");

    if (Validator.isNull(uid)) {

        response.sendRedirect(request.getContextPath() + "/tenantwizard2.jsp");
        return;
    }

    Agreement agreement = AgreementManager.getInstance().getAgreementByUid(uid);

    if (agreement == null) {

        response.sendRedirect(request.getContextPath() + "/tenantwizard2.jsp");
        return;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>LetULet | Sign Up</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>
<%@ include file="inc-navbar-branded.jsp" %>

<div id="wrap" class="container animated fadeInDown">

    <form action="<%= request.getContextPath() %>/tenantwizard3_process.jsp" class="form-horizontal" role="form" id="UserSignUpForm" method="post" accept-charset="utf-8">
        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID() %>"/>

        <div class="col-md-6 col-md-offset-3">

            <div class="page-header">
                <h3>Review & Send invitation to the landlord</h3>
            </div>

            <div class="checkbox">
                <label>
                    <input type="checkbox"> Hosting helps ...
                </label>
            </div>

            <div class="checkbox">
                <label>
                    <input type="checkbox"> I respect ...
                </label>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <textarea name="data[Tenant][notes]" class="form-control" rows="3"></textarea>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button id="submitButton" type="submit" class="btn btn-primary bn-lg">SEND INVITATION</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
