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
    <title>LetULet | Review Contract</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>
<%@ include file="inc-navbar-branded.jsp" %>

<div id="wrap" class="container animated fadeInDown">

    <form action="<%= request.getContextPath() %>/landlord_contract_accept_process.jsp" class="form-horizontal" role="form" id="UserSignUpForm" method="post" accept-charset="utf-8">
        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID() %>"/>

        <div class="col-md-8 col-md-offset-2">

            <div class="page-header">
                <h3>Stay informed and compliant</h3>
            </div>

            <div class="checkbox">
                <label>
                    <input name="data[Landlord][informme]" type="checkbox" checked> Always inform me of reservations dates and number of nights
                </label>
            </div>

            <div class="checkbox">
                <label>
                    <input name="data[Landlord][onlyvip]" type="checkbox"> Only accept 5 star rating tenants
                </label>
            </div>

            <div class="checkbox">
                <label>
                    <input name="data[Landlord][nopets]" type="checkbox"> Not pets are allowed
                </label>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <textarea name="data[Landlord][customcompliance]" class="form-control" placeholder="Write your own compliance rules (optional)" rows="3"></textarea>
                </div>
            </div>

            <div class="page-header">
                <h3>Set house rules to be followed by host and guests</h3>
            </div>

            <div class="checkbox">
                <label>
                    <input name="data[Landlord][cleanyourself]" type="checkbox" checked> Picking up after yourself in common areas
                </label>
            </div>

            <div class="checkbox">
                <label>
                    <input name="data[Landlord][lockdoor]" type="checkbox"> Always lock the front door when you leave the house
                </label>
            </div>

            <div class="checkbox">
                <label>
                    <input name="data[Landloard][nosmoking]" type="checkbox"> Absolutely NO smoking in the house and if you do smoke outside , please be courteous and clean up your butts/ash
                </label>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <textarea name="data[Landlord][customrules]" class="form-control" placeholder="Write your own house rules (optional)" rows="3"></textarea>
                </div>
            </div>

            <div class="page-header">
                <h3>Enter owner name to activate $1 Million Host Protection Insurance</h3>
            </div>

            <div class="checkbox">
                <div class="col-sm-6">
                    <div class="input email required">
                        <input name="data[Landloard][insuredname]" placeholder="Enter owner name to be insured" class="form-control" type="text"/>
                    </div>
                </div>
            </div>

            <hr/>

            <div class="checkbox">
                <label>
                    <input type="checkbox" checked required> Check this box to sign letulet <a href="#">terms of service</a>
                </label>
            </div>

            <div class="checkbox">
                <label>
                    <input type="checkbox" checked required> Check this box to sign partnership agreement
                </label>
            </div>


            <div class="form-group">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-primary bn-lg">AGREE AND SIGN</button>
                    <a href="<%= request.getContextPath() %>/landlord_contract_counter_offer.jsp?uid=<%= agreement.getUID()%>" class="btn btn-default bn-lg">COUNTER OFFER</a>
                    <a href="<%= request.getContextPath() %>/landlord_contract_decline.jsp?uid=<%= agreement.getUID()%>" type="button" class="btn btn-default bn-lg">DECLINE OFFER</a>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
