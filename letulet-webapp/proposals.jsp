<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.letulet.backend.model.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Letulet | Proposals</title>
    <%@ include file="inc-header.jsp" %>
    <%
        Tenant tenant = null;
        Landlord landlord = null;
        User user =  (User)request.getSession().getAttribute("user");

        if (user instanceof Tenant) {

            tenant =  (Tenant)user;
        }

        if (user instanceof Landlord) {

            landlord =  (Landlord)user;
        }

        ArrayList<Agreement> agreementsTenants = new ArrayList<Agreement>();
        ArrayList<Agreement> agreementsLandlord = new ArrayList<Agreement>();

        Property[] properties = null;

        if (tenant != null) {

            properties = PropertyManager.getInstance().getPropertiesByTenant(tenant);

            for (Property p : properties) {

                Agreement[] a = AgreementManager.getInstance().getAgreementsByProperty(p);

                for (Agreement _a : a) {

                    agreementsTenants.add(_a);
                }
            }
        }


        if (landlord != null) {

            properties = PropertyManager.getInstance().getPropertiesByLandlord(landlord);
        }
    %>
</head>
<body>

<div class="dashboard-page content">

    <%@ include file="inc-menu.jsp" %>

    <div class="container container-space">

        <%@ include file="inc-navbar.jsp" %>

        <% if (tenant != null) { %>

        <div class="proposals">
            <% if (agreementsTenants.size() > 0) { %>
            <%  for (Agreement agreement : agreementsTenants) {
                Landlord _agreementlandlord = agreement.getProperty().getLandlord(); %>
            <div class="proposal">

                <% if (_agreementlandlord != null) { %>
                <h1>PROPOSAL<br/>FOR <%= LandlordManager.getInstance().showBestProfile(_agreementlandlord)%></h1>
                <% } %>

                <div class="proposal-status">
                    Status: <%= agreement.getStatus().getLabel() %>
                </div>

                <% if (agreement.getStatus() == Agreement.Status.DECLINED) { %>
                <div class="proposal-info">
                    Reason: <%= agreement.getReasonOfDecline()%>
                </div>
                <% } %>

                <div class="proposal-info">
                    <%= agreement.getProperty().getAddress1()%><br/>
                    <%= agreement.getProperty().getZipCode() %>, <%= agreement.getProperty().getCity() %> <%= (agreement.getProperty().getCountryCode() != null) ? agreement.getProperty().getCountryCode().getName().toString() : "" %><br/>
                    <span class="medium"><%= 100 - agreement.getLandlordCommissionRate()%>% Revenue Share</span>
                </div>

                <a class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">VIEWS DETAILS</a>
            </div>
            <% } %>
            <% } %>
            <div class="proposal">
                <a class="add-proposal"  href="<%=request.getContextPath() %>/proposal_add.jsp">
                    <img src="<%=request.getContextPath() %>/img/icons/add-proposal-icon.svg" />
                </a>
            </div>
        </div>
        <% } %>

        <% if (landlord != null) {

            if (properties == null) return;

        for (Property p : properties) {
            Agreement[] a = AgreementManager.getInstance().getAgreementsByProperty(p);

            if (a.length > 0) {
        %>
            <div class="row">
                <div class="col-xs-12">
                    <div class="widget">
                        <h1 class="widget-title">
                            <%= p.getAddress1()%>, <%= p.getCity()%>
                        </h1>
                        <div class="row">
                            <div class="col-xs-12 proposals-list">
                            <% for (Agreement agreement : a) {
                                if (agreement.getProperty() == null) continue; %>
                                <div class="proposal-list">
                                    <div class="proposal-list-item">
                                        <% if (agreement.getStatus() == Agreement.Status.NEW) { %>
                                        <p class="title"><b>
                                            <a href="<%= request.getContextPath() %>/proposal_review.jsp?uid=<%=agreement.getUID()%>">Proposal from <%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%></a>
                                        </b></p>
                                        <% } else { %>
                                        <p class="title"><b>
                                            <% if (agreement.getProperty().getTenant() != null) { %>
                                            Proposal from <%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%>
                                            <% } %>
                                        </b></p>
                                        <% } %>

                                        <p class="nomargin gray">Status: <%= agreement.getStatus().getLabel() %></p>
                                    </div>
                                    <div class="proposal-list-item">
                                        <p class="nomargin"><%= agreement.getProperty().getAddress1()%>, <%= agreement.getProperty().getCity()%></p>
                                    </div>
                                    <div class="proposal-list-item">
                                        <p class="nomargin"><%= agreement.getLandlordCommissionRate()%>% Revenue Share</p>
                                    </div>
                                    <div class="proposal-list-item">
                                        <button onclick="previewProposal('<%= agreement.getUID()%>')" class="btn btn-lg btn-red btn-rounded">VIEW AGREEMENT</button>
                                    </div>
                                </div>
                            <% } %>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <% }
        }
        }%>
        </div>
    </div>
</div>
<!-- /container -->
<%@ include file="modal/preview_proposal.jsp" %>

<%@ include file="inc-footer-nolinks.jsp" %>
<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/proposals.js"></script>
</body>
</html>
