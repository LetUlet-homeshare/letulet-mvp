<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<%
    request.setCharacterEncoding("UTF-8");

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

    String __jspName = this.getClass().getSimpleName().replaceAll("_", ".");

    User user =  (User)request.getSession().getAttribute("user");

    Landlord landlord = agreement.getProperty().getLandlord();
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Orbirental | Review your Proposal</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>

<div class="proposal-add-page content">

    <span id="anchor-step1"></span>

    <%@ include file="inc-menu.jsp" %>

    <div class="container">

        <div class="row">

            <div class="col-xs-12">
                <div class="step step-with-title">

                    <div class="step-title step-background-4">
                        <div class="row">
                            <div class="col-xs-12">
                                <h1 class="title red">WELCOME TO LETULET</h1>
                            </div>
                            <div class="col-xs-7">
                                <p>Tools to permit long term tenants to host short-term rentals.</p>
                            </div>
                        </div>
                    </div>

                    <div class="step-content">
                        <div class="row margin-bottom-30">
                            <div class="col-xs-offset-1 text-center col-xs-10">
                                <h1 class="text-center">REVIEW YOUR PROPOSAL</h1>

                                <p>Your tenant, <span class="tenant-popover red"><%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%></span>, at <%= agreement.getProperty().getAddress1() %>, <%= agreement.getProperty().getCity() %>, has offered to share <%=agreement.getLandlordCommissionRate()%>% of their short-term rental revenue with you. Use letUlet to set specific terms of your agreement, like your house rules and listing limits.</p>
                                <p class="text-center">
                                    <a onclick="showChartsPayoutModal(); return false;" class=" green" href="#">Counter This Offer</a>
                                </p>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-xs-12">
                                <h1 class="text-center">WHAT YOU’RE GETTING</h1>
                            </div>
                        </div>
                        <div class="margin-bottom-30 row features">
                            <div class="text-center col-xs-4 feature">
                                <img class="feature-icon" src="<%= request.getContextPath() %>/img/expand-your-rentals.svg" />
                                <h4 class="feature-title">Expand Your Rentals</h4>
                                <p class="feature-content">Establish the right hosting limits and house rules that fit your property</p>
                            </div>
                            <div class="text-center col-xs-4 feature">
                                <img class="feature-icon" src="<%= request.getContextPath() %>/img/empower-business.svg" />
                                <h4 class="feature-title">Empower Your Business</h4>
                                <p class="feature-content">Receive a written lease addendum, have full transparency and tap revenue sharing</p>
                            </div>
                            <div class="text-center col-xs-4 feature">
                                <img class="feature-icon" src="<%= request.getContextPath() %>/img/be-supported.svg" />
                                <h4 class="feature-title">Be Supported</h4>
                                <p class="feature-content">LetUlet partnered with Airbnb to automate the whole process at no cost to you</p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12 text-center">
                                <button onclick="openLetuletVideo()" class="btn btn-green btn-lg btn-rounded">
                                    <img src="<%= request.getContextPath() %>/img/lecture.png" />
                                    WHY LETULET ?
                                </button>
                            </div>
                        </div>
                    </div>
                    <span id="anchor-step2">&nbsp;</span>
                </div>

                <div class="step">
                    <h1>LET’S SET THE RULES</h1>
                    <p class="subtitle">Now, set the hosting limits and house rules to be followed by your tenant, <span class="tenant-popover red"><%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%></span>.</p>

                    <form id="form2">

                        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                        <h2 class="margin-bottom-10">Hosting Limits</h2>
                        <p class="subtitle">Check the boxes below to set Hosting Limits to be included in your written agreement </p>

                        <div class="checkbox checkbox-red checkbox-circle">
                            <input name="data[Property][notifiedOfNewBooking]" id="informMe" type="checkbox">
                            <label for="informMe">
                                Always inform me of date and number of guests when a reservation is made
                            </label>
                        </div>

                        <div class="checkbox checkbox-red checkbox-circle form-inline">
                            <input onchange="$('#maximumGuests').prop('disabled',!this.checked);" name="data[Property][maximumGuestsCheck]" id="maximumGuestsCheck" type="checkbox">
                            <label for="maximumGuestsCheck">
                                No more than <input style="width:65px" type="number" value="1" name="data[Property][maximumGuests]" class="form-control input-sm" id="maximumGuests" disabled> guests per stay
                            </label>
                        </div>

                        <div class="checkbox checkbox-red checkbox-circle form-inline">
                            <input onchange="$('#maximumReservationsPerYear').prop('disabled',!this.checked);" name="data[Property][maximumReservationsPerYearCheck]" id="maximumReservationsPerYearCheck" type="checkbox">
                            <label for="maximumReservationsPerYearCheck">
                                No more than <input style="width:65px" type="number" value="20" name="data[Property][maximumReservationsPerYear]" class="form-control input-sm" id="maximumReservationsPerYear" disabled> reservations per year
                            </label>
                        </div>

                        <div class="checkbox checkbox-red checkbox-circle form-inline">
                            <input onchange="$('#maximumDaysPerYear').prop('disabled',!this.checked);" name="data[Property][maximumDaysPerYearCheck]" id="maximumDaysPerYearCheck" type="checkbox">
                            <label for="maximumDaysPerYearCheck">
                                No more than <input style="width:65px" type="number" value="1" name="data[Property][maximumDaysPerYear]" class="form-control input-sm" id="maximumDaysPerYear" disabled> days total per year
                            </label>
                        </div>

                        <h2 class="margin-bottom-10">House Rules</h2>
                        <p class="subtitle">Check the boxes below to set House Rules to be presented to guests prior to their stay</p>


                        <div class="checkbox checkbox-red checkbox-circle">
                            <input name="data[Property][notAllowPets]" id="noPetsAllowedCheck" type="checkbox">
                            <label for="noPetsAllowedCheck">
                                No pets allowed
                            </label>
                        </div>

                        <div class="checkbox checkbox-red checkbox-circle form-inline">
                            <input onchange="$('#noNoiseAfter').prop('disabled',!this.checked);" name="data[Property][[disallowNoiseAfterCheck]" id="noNoiseAfterCheck" type="checkbox">
                            <label for="noNoiseAfterCheck">
                                No loud noise after
                                <select name="data[Property][[disallowNoiseAfter]" class="input-sm form-control" id="noNoiseAfter" disabled>
                                    <option value="18">6 pm</option>
                                    <option value="19">7 pm</option>
                                    <option value="20">8 pm</option>
                                    <option value="21">9 pm</option>
                                    <option value="22">10 pm</option>
                                    <option value="23">11 pm</option>
                                    <option value="24">0 am</option>
                                    <option value="1">1 am</option>
                                    <option value="2">2 am</option>
                                    <option value="3">3 am</option>
                                </select>
                            </label>
                        </div>

                        <div class="checkbox checkbox-red checkbox-circle">
                            <input name="data[Proposal][noSmokingAllowed]" id="noSmokingAllowedCheck" type="checkbox">
                            <label for="noSmokingAllowedCheck">
                                Absolutely NO smoking
                            </label>
                        </div>

                        <input name="data[Proposal][Rules][count]" id="rulesCount" type="hidden" value="1">

                        <div class="checkbox checkbox-red checkbox-circle">
                            <input id="rules1" type="checkbox" checked>
                            <label for="rules1">
                                <textarea name="data[Proposal][Rules][1]" rows="2" class="rulestexarea form-control" placeholder="Write your own house rules (optional)"></textarea>
                            </label>
                        </div>

                        <div class="checkbox  checkbox-circle">
                            <input id="addMoreRulesCheck" type="checkbox">
                            <label>
                                <a onclick="addOneRule()" class="red">Add more</a>
                            </label>
                        </div>


                        <!-- TODO
                        <div class="form-group">
                            <label for="compliances" class="sr-only"></label>
                            <textarea style="margin-right:40px" rows="3" name="data[Property][complianceRules]" class="form-control" id="compliances" placeholder="Write your own compliance rules (optional)"></textarea>
                        </div>

                        <div class="form-group">
                            <label for="house" class="sr-only"></label>
                            <textarea style="margin-right:40px" rows="3" name="data[Property][houseRules]" class="form-control" id="house" placeholder="Write your own house rules (optional)"></textarea>
                        </div>

                        <h2>Enter owner name to activate  $1 Million Host Protection Insurance</h2>

                        <div style="margin-bottom:0" class="form-group">
                            <label for="ownerName" class="sr-only"></label>
                            <input name="data[Property][ownerName]" class="form-control" id="ownerName" placeholder="Enter owner name to be insured" />
                        </div>-->

                        <button type="submit" style="display:none" id="form2-submit"></button>
                    </form>

                    <span id="anchor-step3">&nbsp;</span>
                </div>

                <div id="step3" class="step">
                    <h1>HERE IS THE DEAL</h1>
                    <p class="subtitle margin-bottom-10">Here is a summary of the proposed agreement you have with your tenant <span class="tenant-popover red"><%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%></span>.</p>
                    <p class="subtitle"><%= agreement.getProperty().getAddress1() %> <%= agreement.getProperty().getCity() %> <%= agreement.getProperty().getState() %> <%= agreement.getProperty().getZipCode() %></p>

                    <h2 class="margin-bottom-10">The Proposal</h2>
                    <p class="subtitle">Financial breakdown example based on $1,000 Airbnb payout</p>

                    <div class="row margin-bottom-30" style="display: flex;align-items: center;">
                        <div class="col-xs-5">
                            <div id="chart-payout-static"></div>
                        </div>
                        <div class="col-xs-offset-1 col-xs-6">
                            <p><span class="tenant-popover red"><%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%></span> is offering to share <span data-proposal-landlord-amount></span>% of his payout with you</p>
                            <a onclick="showChartsPayoutModal(); return false;" class="green" href="#">Counter This Offer</a>
                        </div>
                    </div>

                    <form id="form3">

                        <h2>Hosting Limits</h2>

                        <p show-no-hosting-limits class="subtitle">No hosting limits set</p>

                        <div show-notify-new-booking class="checkbox checkbox-red checkbox-circle">
                            <input id="1" type="checkbox" checked disabled>
                            <label for="1">
                                Always inform me of reservation dates and number of nights <a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right red">Edit</a>
                            </label>
                        </div>

                        <div show-maximum-guest class="checkbox checkbox-red checkbox-circle">
                            <input id="9" type="checkbox" checked disabled>
                            <label for="9">
                                No more than <span html-maximum-guest></span> guests per stay<a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right red">Edit</a>
                            </label>
                        </div>

                        <div show-maximum-reservations-per-year class="checkbox checkbox-red checkbox-circle">
                            <input id="11" type="checkbox" checked disabled>
                            <label for="11">
                                No more than <span html-maximum-reservations-per-year></span> reservations per year<a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right red">Edit</a>
                            </label>
                        </div>

                        <div show-maximum-days-per-year class="checkbox checkbox-red checkbox-circle">
                            <input id="12" type="checkbox" checked disabled>
                            <label for="12">
                                No more than <span html-maximum-days-per-year></span> days total per year<a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right red">Edit</a>
                            </label>
                        </div>

                        <br/>

                        <h2>House Rules</h2>

                        <p show-no-house-rules class="subtitle">No house rules set</p>

                        <div show-no-pets-allowed-rule class="checkbox checkbox-red checkbox-circle">
                            <input id="4" type="checkbox" checked disabled>
                            <label for="4">
                                No pets allowed <a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right red">Edit</a>
                            </label>
                        </div>

                        <div show-disallow-noise-after class="checkbox checkbox-red checkbox-circle">
                            <input id="5" type="checkbox" checked disabled>
                            <label for="5">
                                No loud noise after <span html-disallow-noise-after></span><a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right red">Edit</a>
                            </label>
                        </div>

                        <div show-no-smoking-rule class="checkbox checkbox-red checkbox-circle">
                            <input id="6" type="checkbox" checked disabled>
                            <label for="6">
                                Absolutely NO smoking<a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right red">Edit</a>
                            </label>
                        </div>

                        <!--<div show-house-rule class="checkbox checkbox-red checkbox-circle">
                            <input id="7" type="checkbox" checked disabled>
                            <label for="7">
                                <span html-house-rule></span><a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right black">Edit</a>
                            </label>
                        </div>

                        <div show-compliance-rule class="checkbox checkbox-red checkbox-circle">
                            <input id="3" type="checkbox" checked disabled>
                            <label for="3">
                                <span html-compliance-rule></span><a onclick="proposalStep.previousStep(); return false;" href="#" class="pull-right black">Edit</a>
                            </label>
                        </div>-->

                        <button type="submit" style="display:none" id="form3-submit"></button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <div class="right-side container white-side">

        <!--<div class="follow-scroll">-->

        <div class="steps-wrapper">
            <ul class="steps">
                <li class="step-number">
                    1
                </li>
                <li class="step-number">
                    2
                </li>
                <li class="step-number">
                    3
                </li>
            </ul>
        </div>

        <div class="row">
            <div class="col-xs-offset-1 col-xs-10 text-center">

                <div class="row">
                    <div class="tip col-xs-12">

                        <img src="img/proposal-review-illustration-1.svg" class="illustration"/>

                        <label class="tip-title">Did you know?</label>

                        <p class="tip-info nomargin">There are over 75 Million Millennial renters, a majority of which see hosting short-term rentals as a valuable amenity</p>

                        <a onclick="return proposalStep.nextStep();" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">LET'S GET STARTED</a>
                    </div>

                    <div class="tip col-xs-12">

                        <img src="img/proposal-review-illustration-2.svg" class="illustration"/>

                        <label class="tip-title">DID YOU KNOW?</label>

                        <p class="tip-info nomargin">Landlords receive $1 Million Dollars of insurance coverage through Airbnb’s Host Protection Insurance Program at no additional cost</p>

                        <button onclick="return $('#form2-submit').click();" class="btn btn-fullwidth btn-lg btn-rounded btn-red">NEXT</button>
                        <a onclick="return proposalStep.previousStep()" class="margin-bottom-30 btn btn-fullwidth btn-black" href="#">BACK</a>
                        <a onclick="previewProposal()" class="margin-bottom-30 btn btn-fullwidth btn-lg btn-rounded btn-gray" href="#">
                            <img src="<%= request.getContextPath() %>/img/preview.svg" />
                            PREVIEW AGREEMENT</a>
                    </div>

                    <div class="tip col-xs-12">

                        <img src="img/proposal-review-illustration-3.svg" class="illustration"/>

                        <label class="tip-title">Tips to get your landlord’s approval</label>

                        <p class="tip-info nomargin">With over 60 million guests, AIrbnb’s market of paying travelers continues to grow</p>

                        <a onclick="return reviewProposalModal()" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">REVIEW AND SIGN</a>
                        <a onclick="return proposalStep.previousStep()" class="margin-bottom-30 btn btn-fullwidth btn-black" href="#">BACK</a>
                        <a onclick="previewProposal()" class="margin-bottom-30 btn btn-fullwidth btn-lg btn-rounded btn-gray" href="#">
                            <img src="<%= request.getContextPath() %>/img/preview.svg" />
                            PREVIEW AGREEMENT</a>
                    </div>
                </div>
            </div>
        </div>
        <!--</div>-->
    </div>

    <div id="content-tenant-popover" style="display: none">
        <div>
            <p class="margin-bottom-10">
                <b><%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant()) %></b>
            </p>

            <p class="margin-bottom-10">
                <%= agreement.getProperty().getAddress1()%><br/>
                <%=agreement.getProperty().getCity()%>, <%=agreement.getProperty().getState()%>
            </p>

            <p class="margin-bottom-10">
                <%=agreement.getProperty().getBedrooms() %> Bedroom / <%=agreement.getProperty().getBathrooms() %> Bath
            </p>

            <p>
                Wants to do a <%=agreement.getLandlordCommissionRate() %>% revenue share with you
            </p>
        </div>
    </div>

    <%@ include file="modal/charts_payout.jsp" %>
</div>
<!-- /container -->

<%@ include file="modal/send_invitation_congrats.jsp" %>
<%@ include file="modal/send_invitation.jsp" %>
<%@ include file="modal/proposal_declined.jsp" %>
<%@ include file="modal/landlord_set_password.jsp" %>
<%@ include file="modal/review_proposal.jsp" %>
<%@ include file="modal/preview_proposal.jsp" %>
<%@ include file="modal/landlord_pairing_successful.jsp" %>
<%@ include file="modal/payout_sended_tenant.jsp" %>
<%@ include file="modal/video.jsp" %>

<%@ include file="inc-footer-nolinks.jsp" %>
<script>
    var uid = "<%= agreement.getUID() %>";
    var landlordPasswordIsSet = <%= landlord.getIsActive() ? true : false %>;
</script>
<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/proposal_review.js"></script>
</body>
</html>
