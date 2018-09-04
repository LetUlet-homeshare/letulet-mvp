<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.Agreement" %>
<%@ page import="com.letulet.backend.model.AgreementManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %><%

    String uid = request.getParameter("uid");

    if (Validator.isNull(uid)) {

        response.getWriter().write("Invalid data.");
        return;
    }

    Agreement agreement = AgreementManager.getInstance().getAgreementByUid(uid);

    if (agreement == null) {

        response.getWriter().write("Invalid agreement.");
        return;
    }

    if (agreement.getStatus() != Agreement.Status.NEW) {

        response.getWriter().write("Agreement already reviewed");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>LetULet | Sign Up</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>
<%@ include file="inc-navbar-branded.jsp" %>

<div id="wrap" class="container animated fadeInDown">

    <form action="<%= request.getContextPath() %>/landlord_contract_decline_process.jsp" class="form-horizontal" role="form" id="UserSignUpForm" method="post" accept-charset="utf-8">
        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID() %>"/>

        <div class="col-md-6 col-md-offset-3">

            <div class="page-header">
                <h3>Are you sure you want to decline with [XXXXXXXXX]?</h3>
            </div>

            <p>Lorem ipsum ...</p>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <a href="<%= request.getContextPath() %>/landlord_contract_counter_offer.jsp?uid=<%= agreement.getUID() %>" class="btn btn-primary bn-lg">COUNTER OFFER</a>
                    <button type="submit" class="btn btn-default bn-lg">DECLINE OFFER</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
