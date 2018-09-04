<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.Agreement" %>
<%@ page import="com.letulet.backend.model.AgreementManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<%
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

    <form action="<%= request.getContextPath() %>/landlord_contract_declined_process.jsp" class="form-horizontal" role="form" id="UserSignUpForm" method="post" accept-charset="utf-8">
        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID() %>"/>


        <div class="col-md-6 col-md-offset-3">

            <div class="page-header">
                <h3>Your partnership with [XXXXXXXXX] has been declined</h3>
            </div>

            <p>[XXXX] we are sorry to see you decline partnership with [XXXXX]</p>

            <p><b>Would you mind telling us why you decided this proposal?</b></p>

            <div class="form-group">
                <div class="col-sm-6">
                    <textarea name="data[Landlord][declinedreason]" class="form-control" rows="3"></textarea>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary bn-lg">SUBMIT</button>
                    <a href="<%= request.getContextPath() %>/landlord_contract_review.jsp" class="btn btn-default bn-lg">RETURN TO HOME</a>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
