<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.PropertyManager" %>
<%@ page import="com.letulet.backend.model.Property" %>
<%@ page import="com.letulet.backend.model.Agreement" %>
<%@ page import="com.letulet.backend.model.AgreementManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %><%
    String uid = request.getParameter("uid");
    String auid = request.getParameter("auid"); //if not null this is a counter offer

    if (Validator.isNull(uid)) {

        response.sendRedirect(request.getContextPath() + "/tenantwizard1.jsp");
        return;
    }

    Property property = PropertyManager.getInstance().getPropertyByUid(uid);

    if (property == null) {

        response.sendRedirect(request.getContextPath() + "/tenantwizard1.jsp");
        return;
    }

    Agreement agreement = null;

    if (Validator.isNull(auid)) {

        agreement = AgreementManager.getInstance().getAgreementByUid(uid);
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

    <form action="<%= request.getContextPath() %>/tenantwizard2_process.jsp" class="form-horizontal" role="form" id="UserSignUpForm" method="post" accept-charset="utf-8">
        <input name="data[Property][uid]" type="hidden" value="<%= property.getUID() %>"/>
        <% if (agreement != null) { %>
        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID() %>"/>
        <% } %>

        <div class="col-md-6 col-md-offset-3">

            <div class="page-header">
                <h3>Financial Proposal</h3>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input email required">
                        <input placeholder="Gross" name="data[Financial][gross]" class="form-control" type="number" required="required"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input email required">
                        <input placeholder="Your Share" name="data[Tenant][share]" class="form-control" type="number" required="required"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input email required">
                        <input placeholder="Landlord share" name="data[Landlord][share]" class="form-control" type="text" required="required"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input email required">
                        <input placeholder="Cleaning Fee" name="data[Financial][cleaningFee]" class="form-control" type="text" required="required"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button id="submitButton" type="submit" class="btn btn-primary bn-lg">NEXT: REVIEW & SEND INVITATION</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
